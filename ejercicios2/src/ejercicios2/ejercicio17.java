package ejercicios2;
import java.util.Scanner;


public class ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.println("Ingrese el divisor: ");
        int divisor = scanner.nextInt();
        int resultado = dividir(dividendo, divisor);
        System.out.println("El resultado de la división es: " + resultado);
        scanner.close();
    }
    
    public static int dividir(int dividendo, int divisor) {
        int cociente = 0;
        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }
        return cociente;
        
    }
}
