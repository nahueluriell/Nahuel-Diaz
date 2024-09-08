package ejercicios2;
import java.util.Scanner;


public class ejercicio19 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el valor de x: ");
	        int x = scanner.nextInt();
	        System.out.println("Ingrese el valor de n: ");
	        int n = scanner.nextInt();
	        double suma = 0;
	        for (int i = 0; i <= n; i++) {
	            suma += Math.pow(x, i);
	        }
	        System.out.println("La suma de la progresión geométrica es: " + suma);
	        scanner.close();
	  }
}
