import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class RegistroSimulacion {

    public static void main(String[] args) {
        try {
            guardarParametros();    // Escribe el archivo
            leerParametros();       // Lee y muestra el contenido
        } catch (IOException e) {
            System.err.println("❌ Error durante la operación de archivo: " + e.getMessage());
        }
    }

    public static void guardarParametros() throws IOException {
        // Definir la ruta del archivo en una carpeta "config"
        Path carpeta = Paths.get("config");
        Path archivo = carpeta.resolve("parametros.txt");

        // Crear la carpeta si no existe
        if (!Files.exists(carpeta)) {
            Files.createDirectories(carpeta);
            System.out.println("📁 Carpeta 'config' creada.");
        }

        // Contenido de parámetros
        String parametros = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;

        // Escribir en el archivo
        Files.write(archivo, parametros.getBytes());
        System.out.println("✅ Parámetros guardados en: " + archivo);

        // Verificar existencia
        if (Files.exists(archivo)) {
            System.out.println("✅ Archivo creado correctamente.");
        } else {
            System.out.println("⚠️ El archivo no se creó.");
        }
    }

    public static void leerParametros() throws IOException {
        // Ruta al archivo
        Path archivo = Paths.get("config", "parametros.txt");

        // Leer contenido del archivo
        String contenido = Files.readString(archivo);

        System.out.println("\n📄 Contenido del archivo:");
        System.out.println("--------------------------");
        System.out.println(contenido);
    }
}
