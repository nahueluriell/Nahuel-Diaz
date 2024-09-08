package ejercicios2;
import java.util.Scanner;

public class ejercicio8 {

	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();
        if (num2 != 0 && num1 % num2 == 0) {
            System.out.println("El primer número es múltiplo del segundo.");
        } else {
            System.out.println("El primer número no es múltiplo del segundo o el segundo número es cero.");
        }
        scanner.close();
    }

	
}
