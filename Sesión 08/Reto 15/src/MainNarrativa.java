public class MainNarrativa {
    private final TransicionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    public MainNarrativa(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void ejecutarEscena() {
        dialogo.mostrarDialogo("Narrador", "Te encuentras en un cruce de caminos...");
        dialogo.mostrarDialogo("Anciano", "¡Por favor, ayúdame a cargar estas cajas!");
        String eleccion = decision.obtenerDecision();
        transicion.transicionar(eleccion);

        if (eleccion.equals("Ayudar al anciano")) {
            dialogo.mostrarDialogo("Anciano", "Gracias, joven. ¡La bondad siempre es recompensada!");
        } else {
            dialogo.mostrarDialogo("Narrador", "Te alejas del anciano. Algo en tu interior se remueve...");
        }
    }

    public static void main(String[] args) {
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        MainNarrativa narrativa = new MainNarrativa(transicion, dialogo, decision);
        narrativa.ejecutarEscena();
    }
}
