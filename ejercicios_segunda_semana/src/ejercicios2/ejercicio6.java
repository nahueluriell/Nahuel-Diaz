package ejercicios2;
import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cinco números enteros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int minimo = Math.min(Math.min(Math.min(Math.min(num1, num2), num3), num4), num5);
        int maximo = Math.max(Math.max(Math.max(Math.max(num1, num2), num3), num4), num5);
        System.out.println("El número menor es: " + minimo);
        System.out.println("El número mayor es: " + maximo);
        scanner.close();
    }
	
}
