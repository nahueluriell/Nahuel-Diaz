package ejercicio1pag20;
import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de alumnos: "); // Solicitamos al usuario que ingrese la cantidad de alumnos
        int cantidadAlumnos = scanner.nextInt(); // Leemos la cantidad de alumnos ingresada por el usuario
        int[] notas = new int[cantidadAlumnos]; // Creamos un arreglo para almacenar las notas de los alumnos
        int sumaNotas = 0; // Variable para almacenar la suma de todas las notas
        for (int i = 0; i < cantidadAlumnos; i++) { // Iteramos sobre cada alumno para ingresar sus notas
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": "); // Solicitamos al usuario que ingrese la nota del alumno actual
            notas[i] = scanner.nextInt(); // Almacenamos la nota ingresada en el arreglo de notas
            sumaNotas += notas[i]; // Sumamos la nota actual a la suma total de notas
        }
        double promedio = (double) sumaNotas / cantidadAlumnos; // Calculamos el promedio de notas de la clase
        System.out.println("El promedio de la clase es: " + promedio); // Mostramos el promedio de notas de la clase
        System.out.println("Alumnos por encima del promedio:"); // Mensaje indicando que se mostrarán los alumnos con notas por encima del promedio
        for (int i = 0; i < cantidadAlumnos; i++) { // Iteramos sobre cada alumno para verificar si su nota está por encima del promedio
            if (notas[i] > promedio) { // Si la nota del alumno actual está por encima del promedio
                System.out.println("Alumno " + (i + 1) + ": " + notas[i]); // Mostramos el número del alumno y su nota
            }
        }
        scanner.close(); // Cerramos el scanner para evitar fugas de recursos
    }
}
