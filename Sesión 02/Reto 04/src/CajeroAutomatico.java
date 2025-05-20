// importar el escáner
import java.util.Scanner;
//crear Clase Cajero Automático
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Usamos var para inferencia de tipo
        var saldo = 1000.0;
        int opcion;

        do {
            // Mostrar menú
            System.out.println("\nBienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            // Leer opción
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Consultar saldo
                    System.out.println("Saldo actual: $" + saldo);
                    break;
                case 2:
                    // Depositar dinero
                    System.out.print("Ingresa el monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("El monto debe ser mayor que 0.");
                    }
                    break;
                case 3:
                    // Retirar dinero
                    System.out.print("Ingresa el monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro <= 0) {
                        System.out.println("El monto debe ser mayor que 0.");
                        break;
                    }
                    if (retiro > saldo) {
                        System.out.println("❌ Fondos insuficientes.");
                        break;
                    }
                    saldo -= retiro;
                    System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    break;
                case 4:
                    // Salir
                    System.out.println("👋 Gracias por usar el cajero automático. ¡Hasta pronto!");
                    break;
                default:
                    // Opción inválida
                    System.out.println("⚠️ Opción inválida. Intenta de nuevo.");
                    break;
            }

        } while (opcion != 4);

        scanner.close();
    }
}
