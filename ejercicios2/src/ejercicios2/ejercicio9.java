package ejercicios2;
import java.util.Scanner;

public class ejercicio9 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int negativos = 0;
	        int positivos = 0;
	        int ceros = 0;
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Ingrese un número entero: ");
	            int num = scanner.nextInt();
	            if (num < 0) {
	                negativos++;
	            } else if (num > 0) {
	                positivos++;
	            } else {
	                ceros++;
	            }
	        }
	        System.out.println("Cantidad de números negativos: " + negativos);
	        System.out.println("Cantidad de números positivos: " + positivos);
	        System.out.println("Cantidad de ceros: " + ceros);
	        scanner.close(); 
	 }
	
}
