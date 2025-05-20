//Crear la clase entrada
public class Entrada {
    // Atributos de la clase
    String nombreEvento;
    double precio;

    // Constructor para recibir ambos valores
    public Entrada(String nombreEvento, double precio) {
        this.nombreEvento = nombreEvento;
        this.precio = precio;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Evento: " + nombreEvento + " | Precio: $" + precio);
    }
}
