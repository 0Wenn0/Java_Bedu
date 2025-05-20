import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class RegistroMuestrasBiotecnologia {

    public static void main(String[] args) {

        // 🧪 Paso 1: Usar ArrayList para registrar el orden de llegada de las muestras
        ArrayList<String> muestrasOrden = new ArrayList<>();
        muestrasOrden.add("Homo sapiens");
        muestrasOrden.add("Mus musculus");
        muestrasOrden.add("Arabidopsis thaliana");
        muestrasOrden.add("Homo sapiens"); // muestra repetida


        // Mostrar el orden de llegada de las muestras
        System.out.println("📥 Muestras registradas en orden:");
        for (String especie : muestrasOrden) {
            System.out.println("- " + especie);
        }

        // 🧬 Paso 2: Usar HashSet para obtener especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(muestrasOrden);



        System.out.println("\n🧬 Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        // 🧑‍🔬 Paso 3: Usar HashMap para asociar ID de muestra con investigador
        HashMap<String, String> muestraInvestigador = new HashMap<>();
        muestraInvestigador.put("M-001", "Dra. López");
        muestraInvestigador.put("M-002", "Dr. Hernández");
        muestraInvestigador.put("M-003", "Mtra. Jiménez");


        System.out.println("\n🧑‍🔬 Relación ID de muestra - Investigador:");
        for (String id : muestraInvestigador.keySet()) {
            String investigador = muestraInvestigador.get(id);
            System.out.println(id + " → " + investigador);
        }

        // 🔍 Paso 4: Búsqueda por ID específico
        String idBusqueda = "M-002";

        System.out.println("\n🔍 Resultado de búsqueda para ID: " + idBusqueda);
        if (muestraInvestigador.containsKey(idBusqueda)) {
            System.out.println("✅ Investigador: " + muestraInvestigador.get(idBusqueda));
        } else {
            System.out.println("❌ No se encontró esa muestra.");
        }
    }
}
