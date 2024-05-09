package ejerciciopag16;
import java.util.*;


public class ejercicio2 {
    public static void main(String[] args) {
        resolverProblema();
    }

    static void resolverProblema() {
        List<String> mujeres = Arrays.asList("Clara", "Luisa", "María", "Nélida");
        List<String> trabajos = Arrays.asList("diseñadora de moda", "florista", "jardinera", "directora de orquesta");

        // Permutaciones de los trabajos
        List<List<String>> permutaciones = new ArrayList<>();
        permute(trabajos, 0, permutaciones);

        // Verificar las permutaciones según las pistas
        for (List<String> perm : permutaciones) {
            Map<String, String> asignaciones = new HashMap<>();
            asignaciones.put(mujeres.get(0), perm.get(0)); // Clara
            asignaciones.put(mujeres.get(1), perm.get(1)); // Luisa
            asignaciones.put(mujeres.get(2), perm.get(2)); // María
            asignaciones.put(mujeres.get(3), perm.get(3)); // Nélida

            System.out.println("Asignaciones actuales: " + asignaciones); // Impresión de asignaciones actuales

            if (cumplePistas(asignaciones)) {
                System.out.println("Solución encontrada:");
                for (Map.Entry<String, String> entry : asignaciones.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
                return;
            }
        }
        System.out.println("No se encontró solución.");
    }

    static boolean cumplePistas(Map<String, String> asignaciones) {
        // (a) Clara es violentamente alérgica a las plantas.
        if (asignaciones.get("Clara").equals("jardinera") || asignaciones.get("Clara").equals("florista")) {
            System.out.println("Restricción (a) no cumple: Clara es alérgica a las plantas.");
            return false;
        }
        // (b) Luisa y la florista comparten el departamento
        if (!asignaciones.get("Luisa").equals("florista")) {
            System.out.println("Restricción (b) no cumple: Luisa y la florista no comparten el departamento.");
            return false;
        }
        // (c) A María y Luisa les gusta solamente la música rock
        if (!asignaciones.get("María").equals("diseñadora de moda") || !asignaciones.get("Luisa").equals("diseñadora de moda")) {
            System.out.println("Restricción (c) no cumple: María y Luisa no les gusta solo la música rock.");
            return false;
        }
        // (d) La jardinera, la diseñadora de modas y Nélida no se conocen entre sí
        if (asignaciones.get("Nélida").equals("jardinera") || asignaciones.get("Nélida").equals("diseñadora de moda") || asignaciones.get("Nélida").equals("florista")) {
            System.out.println("Restricción (d) no cumple: La jardinera, la diseñadora de modas y Nélida se conocen entre sí.");
            return false;
        }

        return true;
    }

    static void permute(List<String> trabajos, int start, List<List<String>> result) {
        if (start == trabajos.size() - 1) {
            result.add(new ArrayList<>(trabajos));
            return;
        }
        for (int i = start; i < trabajos.size(); i++) {
            swap(trabajos, start, i);
            permute(trabajos, start + 1, result);
            swap(trabajos, start, i);
        }
    }

    static void swap(List<String> trabajos, int i, int j) {
        String temp = trabajos.get(i);
        trabajos.set(i, trabajos.get(j));
        trabajos.set(j, temp);
    }
}