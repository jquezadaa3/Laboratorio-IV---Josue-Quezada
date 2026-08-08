class Producto {
    private String nombre;
    private double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double calcularPrecioFinal() {
        return precioBase;
    }

    public void mostrarDatos() {
        System.out.printf("Producto: %s | Precio final: Q%.2f%n", nombre, calcularPrecioFinal());
    }
}

class ProductoFisico extends Producto {
    private double pesoKg;
    private double costoEnvioPorKg;

    public ProductoFisico(String nombre, double precioBase, double pesoKg, double costoEnvioPorKg) {
        super(nombre, precioBase);
        this.pesoKg = pesoKg;
        this.costoEnvioPorKg = costoEnvioPorKg;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() + (pesoKg * costoEnvioPorKg);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo: Físico | Peso: " + pesoKg + " kg");
    }
}

class ProductoDigital extends Producto {
    private double tamanioMB;

    public ProductoDigital(String nombre, double precioBase, double tamanioMB) {
        super(nombre, precioBase);
        this.tamanioMB = tamanioMB;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo: Digital | Tamaño: " + tamanioMB + " MB");
    }
}

public class MainProductos {
    public static void main(String[] args) {
        Producto[] productos = new Producto[2];
        productos[0] = new ProductoFisico("Audífonos Bluetooth", 250.00, 0.3, 15.00);
        productos[1] = new ProductoDigital("Curso de Java Online", 300.00, 850);

        for (Producto p : productos) {
            p.mostrarDatos();
            System.out.println("-----");
        }
    }
}
