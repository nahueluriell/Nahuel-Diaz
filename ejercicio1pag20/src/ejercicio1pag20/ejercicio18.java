package ejercicio1pag20;
import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arregloOriginal = new int[10]; // Creamos un arreglo original de tamaño 10
        int[] copiaArreglo = new int[5]; // Creamos un arreglo de copia de tamaño 5
        for (int i = 0; i < 10; i++) { // Iteramos sobre el arreglo original para ingresar los datos
            System.out.print("Ingrese el número en la posición " + i + ": "); // Solicitamos al usuario que ingrese el número en la posición actual
            arregloOriginal[i] = scanner.nextInt(); // Almacenamos el número ingresado en la posición actual del arreglo original
        }
        for (int i = 5, j = 0; i < 10; i++, j++) { // Iteramos sobre las últimas 5 posiciones del arreglo original y copiamos sus valores al arreglo de copia
            copiaArreglo[j] = arregloOriginal[i]; // Copiamos el valor de la posición actual del arreglo original al arreglo de copia
        }
        System.out.println("Arreglo resultante de la copia de valores:"); // Mensaje indicando que se mostrará el arreglo resultante
        for (int i = 0; i < 5; i++) { // Iteramos sobre el arreglo de copia para mostrar sus valores
            System.out.println("Número " + copiaArreglo[i] + " en el índice " + i); // Mostramos el valor y su índice correspondiente en el arreglo de copia
        }
        scanner.close(); // Cerramos el scanner para evitar fugas de recursos
    }
}