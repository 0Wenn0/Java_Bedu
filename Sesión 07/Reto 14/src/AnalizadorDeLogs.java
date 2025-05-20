import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AnalizadorDeLogs {

    public static void main(String[] args) {
        String archivoLogs = "errores.log";
        int totalLineas = 0;
        int errores = 0;
        int advertencias = 0;

        // Try-with-resources asegura que BufferedReader se cierra automáticamente
        try (BufferedReader br = new BufferedReader(new FileReader(archivoLogs))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    errores++;
                }
                if (linea.contains("WARNING")) {
                    advertencias++;
                }
            }

            // Mostrar resumen
            System.out.println("📊 Resumen del análisis de logs:");
            System.out.println("--------------------------------");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores: " + errores);
            System.out.println("Cantidad de advertencias: " + advertencias);

            if (totalLineas > 0) {
                double porcentajeErrores = (errores * 100.0) / totalLineas;
                double porcentajeAdvertencias = (advertencias * 100.0) / totalLineas;
                System.out.printf("Porcentaje de líneas con ERROR: %.2f%%\n", porcentajeErrores);
                System.out.printf("Porcentaje de líneas con WARNING: %.2f%%\n", porcentajeAdvertencias);
            } else {
                System.out.println("⚠️ El archivo está vacío.");
            }

        } catch (IOException e) {
            System.err.println("❌ Ocurrió un error leyendo el archivo.");
            registrarError(e.getMessage());
        }
    }

    // Método auxiliar para registrar fallos en un archivo
    private static void registrarError(String mensaje) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("registro_fallos.txt", true))) {
            writer.write("Error al analizar errores.log: " + mensaje);
            writer.newLine();
            System.out.println("📝 Se registró el error en registro_fallos.txt");
        } catch (IOException ex) {
            System.err.println("❌ No se pudo escribir en registro_fallos.txt: " + ex.getMessage());
        }
    }
}
