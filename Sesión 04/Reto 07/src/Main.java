public class Main {
    public static void main(String[] args) {
        // Dos facturas con el mismo folio pero diferentes datos
        Factura factura1 = new Factura("FAC001", "Wendy Ramírez", 1800.0);
        Factura factura2 = new Factura("FAC001", "Nami", 1800.0);

        // Mostrar con toString()
        System.out.println(factura1);
        System.out.println(factura2);

        // Comparar con equals()
        boolean sonIguales = factura1.equals(factura2);
        System.out.println("¿Las facturas son iguales?: " + sonIguales);
    }
}
