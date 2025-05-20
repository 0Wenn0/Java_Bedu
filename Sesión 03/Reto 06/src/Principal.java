public class Principal {
    public static void main(String[] args) {
        // Factura con RFC
        Factura factura1 = new Factura(2500.0, "Servicio de consultoría", "ABCC010101XYZ");

        // Factura sin RFC (null)
        Factura factura2 = new Factura(1800.0, "Reparación de equipo", null);

        // Mostrar los resúmenes
        System.out.println(factura1.getResumen());
        System.out.println(factura2.getResumen());
    }
}
