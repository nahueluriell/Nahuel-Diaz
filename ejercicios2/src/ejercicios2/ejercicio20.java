package ejercicios2;
import java.util.Scanner;


public class ejercicio20 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el valor de n: ");
	        int n = scanner.nextInt();
	        double suma = 0;
	        for (int i = 1; i <= n; i++) {
	            suma += (double) i / Math.pow(2, i);
	        }
	        System.out.println("El resultado de la serie es: " + suma);
	  scanner.close();
	  }
}
