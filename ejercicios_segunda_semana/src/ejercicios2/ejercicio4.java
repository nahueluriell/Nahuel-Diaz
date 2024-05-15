package ejercicios2;
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("El primer número es mayor que el segundo.");
        } else if (num1 < num2) {
            System.out.println("El primer número es menor que el segundo.");
        } else {
            System.out.println("Ambos números son iguales.");
        }
        scanner.close();
    }
	
}
