package ejercicio1pag20;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = scanner.nextLine(); // Solicitamos al usuario que ingrese una cadena de caracteres
        int contadorVocales = contarVocales(cadena); // Contamos las vocales en la cadena ingresada
        System.out.println("El número de vocales en la cadena es: " + contadorVocales); // Mostramos el número de vocales en la consola
    }

    static int contarVocales(String cadena) {
        int contador = 0; // Inicializamos un contador para contar las vocales
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = Character.toLowerCase(cadena.charAt(i)); // Convertimos el caracter a minúscula para comparar con las vocales
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') { // Verificamos si el caracter es una vocal
                contador++; // Incrementamos el contador si encontramos una vocal
            }
        }
        return contador; // Retornamos el contador que contiene el número de vocales en la cadena
    }
}