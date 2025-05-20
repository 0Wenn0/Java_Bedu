public class TransicionSimple implements TransicionHistoria {
    @Override
    public void transicionar(String decision) {
        System.out.println("La historia avanza en base a tu decisión: \"" + decision + "\".");
    }
}
