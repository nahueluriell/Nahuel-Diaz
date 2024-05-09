package ejercicio1pag20;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio15 {
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

        int min = vector[0]; // Obtenemos el valor mínimo del vector (el primer elemento después de ordenarlo)
        int max = vector[dimension - 1]; // Obtenemos el valor máximo del vector (el último elemento después de ordenarlo)

        System.out.println("Valor mínimo del vector: " + min); // Mostramos el valor mínimo del vector
        System.out.println("Valor máximo del vector: " + max); // Mostramos el valor máximo del vector
    }
}