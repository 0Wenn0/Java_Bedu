import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public String obtenerDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opción: [1] Ayudar al anciano [2] Ignorarlo");
        String eleccion = scanner.nextLine();

        if (eleccion.equals("1")) {
            return "Ayudar al anciano";
        } else {
            return "Ignorar al anciano";
        }
    }
}
