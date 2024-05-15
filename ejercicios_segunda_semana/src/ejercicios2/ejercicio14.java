package ejercicios2;
import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un carácter: ");
        char caracter = scanner.next().charAt(0);
        if (esVocal(caracter)) {
            System.out.println("El carácter ingresado es una vocal.");
        } else {
            System.out.println("El carácter ingresado no es una vocal.");
            scanner.close();
        }
    }
    
    public static boolean esVocal(char caracter) {
        caracter = Character.toLowerCase(caracter);
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}
