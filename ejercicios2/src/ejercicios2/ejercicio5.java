package ejercicios2;
import java.util.Scanner;

public class ejercicio5 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el primer número entero: ");
	        int num1 = scanner.nextInt();
	        System.out.println("Ingrese el segundo número entero: ");
	        int num2 = scanner.nextInt();
	        System.out.println("Ingrese el tercer número entero: ");
	        int num3 = scanner.nextInt();
	        int suma = num1 + num2 + num3;
	        double promedio = suma / 3.0;
	        int producto = num1 * num2 * num3;
	        int menor = Math.min(Math.min(num1, num2), num3);
	        int mayor = Math.max(Math.max(num1, num2), num3);
	        System.out.println("Suma: " + suma);
	        System.out.println("Promedio: " + promedio);
	        System.out.println("Producto: " + producto);
	        System.out.println("Menor: " + menor);
	        System.out.println("Mayor: " + mayor);
	        scanner.close();  
	 }
	
	
}
