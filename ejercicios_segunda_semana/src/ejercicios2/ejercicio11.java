package ejercicios2;
import java.util.Scanner;

public class ejercicio11 {

	 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el valor límite: ");
	        int x = scanner.nextInt();
	        int sumaAcumulada = 0;
	        int n = 0;
	        while (sumaAcumulada <= x) {
	            n++;
	            sumaAcumulada += n;
	        }
	        System.out.println("El valor de n para el cual la suma excede a " + x + " es: " + n);
	        scanner.close();
	    }

	
}
