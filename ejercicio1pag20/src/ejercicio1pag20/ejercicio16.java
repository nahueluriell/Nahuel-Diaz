package ejercicio1pag20;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la dimensión del vector: "); // Solicitamos al usuario que ingrese la dimensión del vector
        int dimension = scanner.nextInt(); // Leemos la dimensión del vector ingresada por el usuario
        int[] vector = new int[dimension]; // Creamos un vector de enteros con la dimensión especificada

        for (int i = 0; i < dimension; i++) { // Iteramos sobre el vector para solicitar los números al usuario
            System.out.print("Ingrese el número en la posición " + i + ": "); // Solicitamos al usuario que ingrese el número en la posición actual
            vector[i] = scanner.nextInt(); // Almacenamos el número ingresado en la posición actual del vector
        }

        int cantidadNegativos = 0; // Inicializamos el contador de números negativos
        int cantidadPositivos = 0; // Inicializamos el contador de números positivos
        int cantidadCeros = 0; // Inicializamos el contador de ceros

        for (int i = 0; i < dimension; i++) { // Iteramos sobre el vector para contar los negativos, positivos y ceros
            if (vector[i] < 0) { // Si el número en la posición actual es negativo
                cantidadNegativos++; // Incrementamos el contador de números negativos
            } else if (vector[i] > 0) { // Si el número en la posición actual es positivo
                cantidadPositivos++; // Incrementamos el contador de números positivos
            } else { // Si el número en la posición actual es cero
                cantidadCeros++; // Incrementamos el contador de ceros
            }
        }

        System.out.println("Cantidad de números negativos: " + cantidadNegativos); // Mostramos la cantidad de números negativos
        System.out.println("Cantidad de números positivos: " + cantidadPositivos); // Mostramos la cantidad de números positivos
        System.out.println("Cantidad de ceros: " + cantidadCeros); // Mostramos la cantidad de ceros
    }
}
