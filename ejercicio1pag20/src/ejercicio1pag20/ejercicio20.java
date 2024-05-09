package ejercicio1pag20;
import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de empleados: "); // Solicitamos al usuario que ingrese la cantidad de empleados
        int cantidadEmpleados = scanner.nextInt(); // Leemos la cantidad de empleados ingresada por el usuario
        String[] nombres = new String[cantidadEmpleados]; // Creamos un arreglo para almacenar los nombres de los empleados
        double[] sueldos = new double[cantidadEmpleados]; // Creamos un arreglo para almacenar los sueldos de los empleados
        for (int i = 0; i < cantidadEmpleados; i++) { // Iteramos sobre cada empleado para ingresar su nombre y sueldo
            scanner.nextLine(); // Limpiamos el buffer de entrada
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": "); // Solicitamos al usuario que ingrese el nombre del empleado actual
            nombres[i] = scanner.nextLine(); // Almacenamos el nombre ingresado en el arreglo de nombres
            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": "); // Solicitamos al usuario que ingrese el sueldo del empleado actual
            sueldos[i] = scanner.nextDouble(); // Almacenamos el sueldo ingresado en el arreglo de sueldos
        }
        int indiceMayorSueldo = obtenerIndiceMayorSueldo(sueldos); // Obtenemos el índice del empleado con el mayor sueldo
        System.out.println("El empleado con mayor sueldo es: " + nombres[indiceMayorSueldo] + " con un sueldo de " + sueldos[indiceMayorSueldo]); // Mostramos el nombre y el sueldo del empleado con el mayor sueldo
        scanner.close(); // Cerramos el scanner para evitar fugas de recursos
    }

    static int obtenerIndiceMayorSueldo(double[] sueldos) {
        double maxSueldo = sueldos[0]; // Asignamos el primer sueldo como el máximo inicial
        int indice = 0; // Inicializamos el índice del máximo como 0
        for (int i = 1; i < sueldos.length; i++) { // Iteramos sobre los sueldos desde el segundo elemento
            if (sueldos[i] > maxSueldo) { // Si el sueldo actual es mayor que el máximo
                maxSueldo = sueldos[i]; // Actualizamos el máximo con el sueldo actual
                indice = i; // Actualizamos el índice del máximo
            }
        }
        return indice; // Devolvemos el índice del empleado con el mayor sueldo
    }
}