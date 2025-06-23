package src;

public class PAdapter implements SistemaPago {
    private PagoExterno pagoExterno;

    public PAdapter() {
        this.pagoExterno = new PagoExterno();
    }

    public PAdapter(PagoExterno pagoExterno) {
        this.pagoExterno = pagoExterno;
    }

    @Override
    public void pagar(double monto) {
        pagoExterno.procesarPago(monto);
    }
}