package ejercicio1pag20;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de caracteres: "); // Solicitamos al usuario que ingrese una cadena de caracteres
        String cadena = scanner.nextLine(); // Leemos la cadena ingresada por el usuario
        String cadenaAlReves = ""; // Inicializamos una cadena vacía para almacenar la cadena al revés
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaAlReves += cadena.charAt(i); // Construimos la cadena al revés caracter por caracter
        }
        System.out.println("La cadena al revés es: " + cadenaAlReves); // Mostramos la cadena al revés en la consola
    }
}