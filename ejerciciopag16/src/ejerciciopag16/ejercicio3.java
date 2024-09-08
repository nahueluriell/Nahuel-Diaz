package ejerciciopag16;
import java.util.*;

public class ejercicio3 {
    public static void main(String[] args) {
        resolverProblema();
    }

    static void resolverProblema() {
        List<String> colores = Arrays.asList("rojo", "anaranjado", "amarillo", "verde", "azul", "violeta");
        Set<String> conVeneno = new HashSet<>();
        Set<String> sinVeneno = new HashSet<>();

        // Pares con veneno
        conVeneno.add("violeta");
        conVeneno.add("azul");
        conVeneno.add("rojo");
        conVeneno.add("amarillo");
        conVeneno.add("azul");
        conVeneno.add("anaranjado");

        // Pares sin veneno
        sinVeneno.add("violeta");
        sinVeneno.add("amarillo");
        sinVeneno.add("rojo");
        sinVeneno.add("anaranjado");
        sinVeneno.add("verde");
        sinVeneno.add("azul");

        for (String color : colores) {
            System.out.println("Verificando el frasco " + color + "...");
            if (conVeneno.contains(color) && !sinVeneno.contains(color)) {
                System.out.println("El frasco " + color + " tiene veneno.");
            } else {
                System.out.println("El frasco " + color + " no tiene veneno.");
            }
        }
    }
}