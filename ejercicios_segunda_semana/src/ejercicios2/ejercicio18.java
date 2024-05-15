package ejercicios2;
import java.util.Scanner;

public class ejercicio18 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        int contador = 0;
        System.out.println("Ingrese los números, para terminar escriba 'fin': ");
        while (true) {
            String input = scanner.next();
            if (input.equals("fin")) {
                break;
            }
            int num = Integer.parseInt(input);
            if (num == numero) {
                contador++;
            }
        }
        System.out.println("La cantidad de veces que aparece el número " + numero + " es: " + contador);
        scanner.close();
	}
}
