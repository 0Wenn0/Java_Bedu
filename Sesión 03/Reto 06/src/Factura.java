import java.util.Optional;

public class Factura {
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    // Constructor
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = (rfc != null) ? Optional.of(rfc) : Optional.empty();
    }

    // Método para imprimir resumen
    public String getResumen() {
        String rfcTexto = rfc.isPresent() ? rfc.get() : "[No proporcionado]";
        return "\n📄 Factura generada:\n" +
                "Descripción: " + descripcion + "\n" +
                "Monto: $" + monto + "\n" +
                "RFC: " + rfcTexto + "\n";
    }

}
