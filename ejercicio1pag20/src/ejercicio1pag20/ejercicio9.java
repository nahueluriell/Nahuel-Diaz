package ejercicio1pag20;

public class ejercicio9 {
    public static void main(String[] args) {
        int[] numerosPrimos = new int[25]; // Creamos un arreglo para almacenar los 25 números primos entre 1 y 100
        int contador = 0; // Inicializamos un contador para llevar la cuenta de los números primos encontrados
        for (int i = 2; i <= 100; i++) {
            if (esPrimo(i)) { // Verificamos si el número actual es primo
                numerosPrimos[contador] = i; // Almacenamos el número primo en el arreglo
                System.out.println("Número primo encontrado: " + numerosPrimos[contador] + " en el índice " + contador); // Mostramos el número primo encontrado y su índice
                contador++; // Incrementamos el contador de números primos encontrados
            }
        }
    }

    static boolean esPrimo(int num) {
        if (num <= 1) return false; // 1 y números negativos no son primos
        for (int i = 2; i <= Math.sqrt(num); i++) { // Verificamos si num es divisible por algún número desde 2 hasta su raíz cuadrada
            if (num % i == 0) return false; // Si num es divisible por i, no es primo
        }
        return true; // Si no encontramos ningún divisor, num es primo
    }
}