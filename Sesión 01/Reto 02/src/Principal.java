//Clase
public class Principal {
    public static void main(String[] args) {
        // Crear objetos de tipo Entrada
        Entrada entrada1 = new Entrada("Talentland", 1500.0);
        Entrada entrada2 = new Entrada("Recital de baile", 799.99);

        // Mostrar información
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
        // Usando el record
        Entrada_Record entrada3 = new Entrada_Record("Festival de terror", 820.5);
        entrada3.mostrarInformacion();
    }
}
