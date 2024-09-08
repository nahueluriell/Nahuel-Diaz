package ejercicio1pag20;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para la entrada de usuario
        int[] numeros = new int[5]; // Creamos un arreglo para almacenar los 5 números ingresados por el usuario
        int suma = 0; // Inicializamos una variable para almacenar la suma de los números
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": "); // Solicitamos al usuario que ingrese un número
            numeros[i] = scanner.nextInt(); // Leemos el número ingresado por el usuario y lo almacenamos en el arreglo
            suma += numeros[i]; // Sumamos el número ingresado al total
            System.out.println("Número ingresado: " + numeros[i]); // Mostramos el número ingresado por el usuario
        }
        double promedio = (double) suma / 5; // Calculamos el promedio de los números ingresados
        System.out.println("El promedio de los números ingresados es: " + promedio); // Mostramos el promedio en la consola
    }
}