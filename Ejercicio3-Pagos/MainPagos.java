abstract class Pago {
    private double monto;

    public Pago(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public abstract void procesarPago();
}

class PagoTarjeta extends Pago {
    private String numeroTarjeta;
    private String tipoTarjeta;

    public PagoTarjeta(double monto, String numeroTarjeta, String tipoTarjeta) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
        this.tipoTarjeta = tipoTarjeta;
    }

    private String obtenerTarjetaOculta() {
        int len = numeroTarjeta.length();
        if (len < 4) return numeroTarjeta;
        return "**** **** **** " + numeroTarjeta.substring(len - 4);
    }

    @Override
    public void procesarPago() {
        System.out.printf("Procesando pago de Q%.2f con tarjeta de %s: %s%n",
                getMonto(), tipoTarjeta, obtenerTarjetaOculta());
    }
}

class PagoEfectivo extends Pago {
    private double montoRecibido;

    public PagoEfectivo(double monto, double montoRecibido) {
        super(monto);
        this.montoRecibido = montoRecibido;
    }

    @Override
    public void procesarPago() {
        double cambio = montoRecibido - getMonto();
        if (cambio < 0) {
            System.out.println("Monto recibido insuficiente. Faltan Q" + Math.abs(cambio));
        } else {
            System.out.printf("Pago en efectivo de Q%.2f | Recibido: Q%.2f | Cambio: Q%.2f%n",
                    getMonto(), montoRecibido, cambio);
        }
    }
}

public class MainPagos {
    public static void main(String[] args) {
        Pago[] pagos = new Pago[2];
        pagos[0] = new PagoTarjeta(500.00, "4111111111111234", "Crédito");
        pagos[1] = new PagoEfectivo(250.50, 300.00);

        for (Pago p : pagos) {
            p.procesarPago();
            System.out.println("-----");
        }
    }
}
