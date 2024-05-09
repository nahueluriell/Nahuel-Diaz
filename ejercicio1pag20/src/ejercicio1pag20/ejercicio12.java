package ejercicio1pag20;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: "); // Solicitamos al usuario que ingrese una palabra o frase
        String cadena = scanner.nextLine(); // Leemos la cadena ingresada por el usuario
        if (esPalindromo(cadena)) { // Verificamos si la cadena es un palíndromo utilizando el método esPalindromo
            System.out.println("La cadena es un palíndromo."); // Mostramos un mensaje indicando que la cadena es un palíndromo
        } else {
            System.out.println("La cadena no es un palíndromo."); // Mostramos un mensaje indicando que la cadena no es un palíndromo
        }
    }

    static boolean esPalindromo(String cadena) {
        cadena = cadena.replaceAll("\\s+", "").toLowerCase(); // Eliminamos los espacios y convertimos la cadena a minúsculas
        int longitud = cadena.length(); // Obtenemos la longitud de la cadena
        for (int i = 0; i < longitud / 2; i++) { // Iteramos hasta la mitad de la longitud de la cadena
            if (cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) { // Verificamos si los caracteres opuestos son diferentes
                return false; // Si son diferentes, la cadena no es un palíndromo
            }
        }
        return true; // Si el bucle termina sin retornar false, la cadena es un palíndromo
    }
}