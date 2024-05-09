package ejercicio1pag20;
import java.util.Scanner;


public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10]; // Creamos un arreglo de enteros con 10 elementos
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": "); // Solicitamos al usuario que ingrese un número
            numeros[i] = scanner.nextInt(); // Almacenamos el número ingresado en el arreglo
            System.out.println("Número " + numeros[i] + " almacenado en el índice " + i); // Mostramos el número ingresado y su índice
        }
        System.out.println("Datos del vector:"); // Imprimimos un mensaje indicando que se mostrarán los datos del vector
        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + numeros[i] + " en el índice " + i); // Mostramos cada número del vector y su índice
        }
    }
}