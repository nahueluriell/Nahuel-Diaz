package ejercicios2;
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese su apellido: ");
            String apellido = scanner.nextLine();
            System.out.println("Nombre completo: " + nombre + " " + apellido);
        } catch (Exception e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        } finally {
            scanner.close();
   
        }
    }
}
