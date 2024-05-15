package ejercicios2;
import java.util.Scanner;

public class ejercicio15 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese un carácter: ");
	        char digito = scanner.next().charAt(0);
	        if (digito >= '0' && digito <= '9') {
	            System.out.println("El carácter ingresado es un dígito entre 0 y 9.");
	        } else {
	            System.out.println("El carácter ingresado no es un dígito entre 0 y 9.");
	        }
	        scanner.close();
	    }
}
