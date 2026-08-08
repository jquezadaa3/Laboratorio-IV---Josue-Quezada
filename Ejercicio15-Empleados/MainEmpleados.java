abstract class Empleado {
    private String nombre;
    private String codigo;

    public Empleado(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public abstract double calcularPago();

    public void mostrarInformacion() {
        System.out.printf("Empleado: %s (Código: %s) | Pago: Q%.2f%n",
                nombre, codigo, calcularPago());
    }
}

class EmpleadoTiempoCompleto extends Empleado {
    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, String codigo, double salarioMensual) {
        super(nombre, codigo);
        if (salarioMensual < 0) {
            throw new IllegalArgumentException("El salario mensual no puede ser negativo.");
        }
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularPago() {
        return salarioMensual;
    }
}

class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHoras(String nombre, String codigo, double horasTrabajadas, double pagoPorHora) {
        super(nombre, codigo);
        if (horasTrabajadas < 0 || pagoPorHora < 0) {
            throw new IllegalArgumentException("Las horas y el pago por hora no pueden ser negativos.");
        }
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularPago() {
        double pagoBase = horasTrabajadas * pagoPorHora;
        double horasNormales = Math.min(horasTrabajadas, 160);
        double horasExtra = Math.max(horasTrabajadas - 160, 0);
        return (horasNormales * pagoPorHora) + (horasExtra * pagoPorHora * 1.5);
    }
}

public class MainEmpleados {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[2];
        empleados[0] = new EmpleadoTiempoCompleto("Ana López", "E001", 8500.00);
        empleados[1] = new EmpleadoPorHoras("Carlos Pérez", "E002", 175, 45.00);

        for (Empleado e : empleados) {
            e.mostrarInformacion();
        }

    }
}
