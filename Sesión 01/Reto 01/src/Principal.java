import java.util.Scanner;
// Método para introducir la información del usuario
public class Principal {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Crear objeto Paciente
        Paciente paciente = new Paciente();

        // Solicitar datos
        System.out.print("Nombre del paciente: ");
        paciente.nombre = scanner.nextLine();

        System.out.print("Edad del paciente: ");
        paciente.edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.print("Número de expediente: ");
        paciente.numeroExpediente = scanner.nextLine();

        // Mostrar la información
        paciente.mostrarInformacion();

        // Cerrar scanner
        scanner.close();
    }
}
