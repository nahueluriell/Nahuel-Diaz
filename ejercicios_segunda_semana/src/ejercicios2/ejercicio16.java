package ejercicios2;
import java.util.Scanner;

public class ejercicio16 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el primer número: ");
	        int num1 = scanner.nextInt();
	        System.out.println("Ingrese el segundo número: ");
	        int num2 = scanner.nextInt();
	        int resultado = multiplicar(num1, num2);
	        System.out.println("El resultado de la multiplicación es: " + resultado);
	        scanner.close(); 
	  }
	    
	    public static int multiplicar(int num1, int num2) {
	        int resultado = 0;
	        for (int i = 0; i < num2; i++) {
	            resultado += num1;
	        }
	        return resultado;
	    }
}
