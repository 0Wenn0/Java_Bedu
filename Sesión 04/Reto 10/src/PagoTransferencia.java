public class PagoTransferencia extends MetodoPago implements Autenticable {
    private boolean conexionBanco;

    public PagoTransferencia(double monto, boolean conexionBanco) {
        super(monto);
        this.conexionBanco = conexionBanco;
    }

    @Override
    public boolean autenticar() {
        return conexionBanco; // Simula validación externa
    }

    @Override
    public void procesarPago() {
        System.out.println("🏦 Procesando transferencia bancaria por $" + monto);
    }
}
