package ejercicio1pag20;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la dimensión del vector: "); // Solicitamos al usuario que ingrese la dimensión del vector
        int dimension = scanner.nextInt(); // Leemos la dimensión del vector ingresada por el usuario
        int[] vector = new int[dimension]; // Creamos un vector de enteros con la dimensión especificada

        for (int i = 0; i < dimension; i++) { // Iteramos sobre el vector para solicitar los números al usuario
            System.out.print("Ingrese el número en la posición " + i + ": "); // Solicitamos al usuario que ingrese el número en la posición actual
            vector[i] = scanner.nextInt(); // Almacenamos el número ingresado en la posición actual del vector
        }

        Arrays.sort(vector); // Ordenamos el vector

        System.out.println("Vector ordenado:"); // Mostramos un mensaje indicando que se imprimirá el vector ordenado
        for (int i = 0; i < dimension; i++) { // Iteramos sobre el vector ordenado
            System.out.println("Número " + vector[i] + " en el índice " + i); // Mostramos el número en la posición actual junto con su índice
        }
    }
}