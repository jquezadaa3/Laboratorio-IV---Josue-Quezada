
class Vehiculo {

    private String marca;
    private String modelo;
    private int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        if (año > 1885) {
            this.año = año;
        } else {
            System.out.println("Año inválido.");
        }
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Año: " + año);
    }
}

class Carro extends Vehiculo {
    private int numeroPuertas;

    public Carro(String marca, String modelo, int año, int numeroPuertas) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo: Carro | Puertas: " + numeroPuertas);
    }
}

class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String marca, String modelo, int año, boolean tieneSidecar) {
        super(marca, modelo, año);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo: Moto | Sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}

public class MainVehiculos {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[2];
        vehiculos[0] = new Carro("Toyota", "Corolla", 2022, 4);
        vehiculos[1] = new Moto("Honda", "CBR600", 2020, false);

        for (Vehiculo v : vehiculos) {
            v.mostrarDatos();
            System.out.println("-----");
        }
    }
}
