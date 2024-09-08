package ejercicio1pag20;

public class ejercicio13 {
    public static void main(String[] args) {
        int[] numeros = new int[100]; // Creamos un arreglo para almacenar los números del 1 al 100
        System.out.println("Números pares:"); // Mostramos un mensaje indicando que se imprimirán los números pares
        for (int i = 1; i <= 100; i++) { // Iteramos desde 1 hasta 100
            if (i % 2 == 0) { // Verificamos si el número es par
                System.out.println(i); // Imprimimos el número par
            }
        }
        System.out.println("Números impares:"); // Mostramos un mensaje indicando que se imprimirán los números impares
        for (int i = 1; i <= 100; i++) { // Iteramos desde 1 hasta 100
            if (i % 2 != 0) { // Verificamos si el número es impar
                System.out.println(i); // Imprimimos el número impar
            }
        }
    }
}