package ejercicios2;
import java.util.Scanner;

public class ejercicio13 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número inicial para buscar números primos: ");
        int numeroInicial = scanner.nextInt();
        System.out.println("Ingrese la cantidad de números primos que desea obtener: ");
        int cantidadPrimos = scanner.nextInt();
        int encontrados = 0;
        int num = numeroInicial;
        while (encontrados < cantidadPrimos) {
            if (esPrimo(num)) {
                System.out.println(num);
                encontrados++;
            }
            num++;
        }
        scanner.close();
	}
    
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
        
    }
}
