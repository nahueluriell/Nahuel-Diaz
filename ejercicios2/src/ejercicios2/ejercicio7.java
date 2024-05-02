package ejercicios2;
import java.util.Scanner;

public class ejercicio7 {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese un número entero: ");
	        int num = scanner.nextInt();
	        if (num % 2 == 0) {
	            System.out.println("El número ingresado es par.");
	        } else {
	            System.out.println("El número ingresado es impar.");
	        }
	        scanner.close();
	  }
	
	
}
