import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {

    public static void main(String[] args) {
        Set<Integer> registrosCPU = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Monitor de Consumo de CPU por Servidor ===");

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.print("Ingresa el consumo de CPU del servidor #" + i + " (0-100): ");
                String entrada = scanner.nextLine();

                // Validación numérica
                int valor;
                try {
                    valor = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    System.out.println("❌ Error: El valor debe ser numérico.");
                    i--; // Reintenta el mismo número de servidor
                    continue;
                }

                // Validaciones de rango
                if (valor < 0 || valor > 100) {
                    System.out.println("❌ Error: El consumo debe estar entre 0 y 100.");
                    i--;
                    continue;
                }

                // Duplicados
                if (!registrosCPU.add(valor)) {
                    System.out.println("⚠️ Advertencia: El valor ya fue ingresado. No se permiten duplicados.");
                    i--;
                    continue;
                }

                // Exceso crítico
                if (valor > 95) {
                    throw new ConsumoCriticoException("⚠️ Alerta crítica: El servidor #" + i + " supera el 95% de uso de CPU.");
                }

                System.out.println("✅ Registro aceptado.");
            }

            System.out.println("\n📊 Registro completo de consumo de CPU:");
            registrosCPU.forEach(cpu -> System.out.println(cpu + "%"));

        } catch (ConsumoCriticoException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("❌ Error inesperado: " + e.getMessage());

        } finally {
            scanner.close();
            System.out.println("\n🛑 Monitoreo finalizado. Recursos cerrados correctamente.");
        }
    }
}
