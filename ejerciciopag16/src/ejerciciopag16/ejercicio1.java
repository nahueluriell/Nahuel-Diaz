package ejerciciopag16;
import java.util.*;


public class ejercicio1 {
    static final int GRANJERO = 0, LOBO = 1, GALLINA = 2, MAIZ = 3;
    static final int IZQUIERDA = 0, DERECHA = 1;

    public static void main(String[] args) {
        resolverProblema();
    }

    static void resolverProblema() {
        int[] estadoInicial = {IZQUIERDA, IZQUIERDA, IZQUIERDA, IZQUIERDA};
        Set<List<Integer>> visitado = new HashSet<>();
        Queue<List<Integer>> cola = new LinkedList<>();
        cola.offer(arrayToList(estadoInicial));

        while (!cola.isEmpty()) {
            List<Integer> estadoActual = cola.poll();
            System.out.println("Estado actual: " + estadoActual); // Imprimir estado actual
            if (esSolucion(estadoActual)) {
                imprimirSolucion(estadoActual);
                return;
            }
            visitado.add(estadoActual);
            List<List<Integer>> siguientesEstados = generarSiguientesEstados(estadoActual);
            for (List<Integer> siguienteEstado : siguientesEstados) {
                if (!visitado.contains(siguienteEstado)) {
                    cola.offer(siguienteEstado);
                }
            }
        }
        System.out.println("No se encontró solución.");
    }

    static boolean esSolucion(List<Integer> estado) {
        return estado.get(GRANJERO) == DERECHA && estado.get(LOBO) == DERECHA &&
               estado.get(GALLINA) == DERECHA && estado.get(MAIZ) == DERECHA;
    }

    static void imprimirSolucion(List<Integer> estado) {
        System.out.println("Solución encontrada:");
        System.out.println("Lado izquierdo: Granjero, Lobo, Gallina, Maíz");
        for (int i = 0; i < estado.size(); i++) {
            if (estado.get(i) == IZQUIERDA) {
                System.out.print(getNombre(i) + " ");
            }
        }
        System.out.println("\nLado derecho:");
        for (int i = 0; i < estado.size(); i++) {
            if (estado.get(i) == DERECHA) {
                System.out.print(getNombre(i) + " ");
            }
        }
    }

    static List<List<Integer>> generarSiguientesEstados(List<Integer> estadoActual) {
        List<List<Integer>> siguientesEstados = new ArrayList<>();
        int granjeroPos = estadoActual.get(GRANJERO);
        for (int i = 0; i < estadoActual.size(); i++) {
            if (i == GRANJERO || estadoActual.get(i) != granjeroPos) continue;
            List<Integer> siguienteEstado = new ArrayList<>(estadoActual);
            siguienteEstado.set(GRANJERO, 1 - granjeroPos);
            siguienteEstado.set(i, 1 - estadoActual.get(i));
            siguientesEstados.add(siguienteEstado);
        }
        System.out.println("Siguientes estados: " + siguientesEstados); // Imprimir siguientes estados
        return siguientesEstados;
    }

    static boolean esEstadoValido(List<Integer> estado) {
        if (estado.get(GRANJERO) == IZQUIERDA &&
            (estado.get(GALLINA) == estado.get(LOBO) || estado.get(GALLINA) == estado.get(MAIZ))) {
            return false;
        }
        if (estado.get(GRANJERO) == DERECHA &&
            (estado.get(GALLINA) == estado.get(LOBO) || estado.get(MAIZ) == estado.get(GALLINA))) {
            return false;
        }
        return true;
    }

    static String getNombre(int index) {
        switch (index) {
            case GRANJERO:
                return "Granjero";
            case LOBO:
                return "Lobo";
            case GALLINA:
                return "Gallina";
            case MAIZ:
                return "Maíz";
            default:
                return "";
        }
    }

    static List<Integer> arrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        return list;
    }
}