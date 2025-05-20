//Clase paciente
public class Paciente {
    // Atributos del paciente
    String nombre;
    int edad;
    String numeroExpediente;

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + numeroExpediente);
    }
}
