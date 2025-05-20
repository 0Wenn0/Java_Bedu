// importar el Escáner
import java.util.Scanner;
//Crear la clase simulador
public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Nombre del medicamento: ");
        String nombre = scanner.nextLine();

        System.out.print("Precio unitario: ");
        double precio = scanner.nextDouble();

        System.out.print("Cantidad de piezas: ");
        int cantidad = scanner.nextInt();

        // Calcular total sin descuento
        var totalSinDescuento = precio * cantidad;

        // Usar operador ternario para aplicar descuento solo si el total > 500
        boolean aplicaDescuento = totalSinDescuento > 500;
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;
        double totalConDescuento = totalSinDescuento - descuento;

        // Mostrar resultados
        System.out.println("\nResumen de compra:");
        System.out.println("Medicamento: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalConDescuento);

        scanner.close();
    }
}
