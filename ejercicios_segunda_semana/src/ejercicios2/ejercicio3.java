package ejercicios2;
import java.util.Scanner;


public class ejercicio3 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el primer número entero: ");
	        int num1 = scanner.nextInt();
	        System.out.println("Ingrese el segundo número entero: ");
	        int num2 = scanner.nextInt();
	        System.out.println("Suma: " + (num1 + num2));
	        System.out.println("Producto: " + (num1 * num2));
	        System.out.println("Diferencia: " + (num1 - num2));
	        if (num2 != 0) {
	            System.out.println("Cociente: " + (num1 / num2));
	            System.out.println("Resto: " + (num1 % num2));
	        } else {
	            System.out.println("El segundo número es cero. No se puede dividir.");
	        }
	        scanner.close();
	 }
	
	
}
