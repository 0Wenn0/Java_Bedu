import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;

// Clase Tema que implementa Comparable para ordenar alfabéticamente
class Tema implements Comparable<Tema> {
    private String titulo;
    private int prioridad; // 1 = urgente, 2 = importante, 3 = opcional

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    // Orden natural por título
    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareToIgnoreCase(otro.titulo);
    }

    @Override
    public String toString() {
        return "📘 Tema: " + titulo + " | Prioridad: " + prioridad;
    }
}

public class TemarioMensual {
    public static void main(String[] args) {

        // CopyOnWriteArrayList: lista segura de temas activos
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));
        temas.add(new Tema("Educación emocional", 2));

        // ConcurrentHashMap: repositorio compartido de recursos
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();

        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medioambiente");
        recursos.put("Educación emocional", "https://recursos.edu/emociones");

        // 🔤 Ordenar por título (orden natural - Comparable)
        Collections.sort(temas);
        System.out.println("📚 Temas ordenados alfabéticamente:");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // 🔢 Ordenar por prioridad (Comparator)
        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        System.out.println("\n⚠️ Temas ordenados por prioridad:");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Mostrar recursos asociados
        System.out.println("\n🔗 Repositorio de recursos por tema:");
        for (String titulo : recursos.keySet()) {
            System.out.println("🔸 " + titulo + " → " + recursos.get(titulo));
        }
    }
}
