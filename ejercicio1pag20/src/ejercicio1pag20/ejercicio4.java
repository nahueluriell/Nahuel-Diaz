package ejercicio1pag20;

public class ejercicio4 {
    public static void main(String[] args) {
        int[] divisiblesPor3 = new int[34]; // Creamos un arreglo para almacenar los números divisibles por 3
        int contador = 0; // Inicializamos un contador para seguir el índice del arreglo
        for (int i = 0; i <= 100; i++) { // Iteramos sobre los números del 0 al 100
            if (i % 3 == 0) { // Verificamos si el número es divisible por 3
                divisiblesPor3[contador] = i; // Almacenamos el número divisible por 3 en el arreglo
                System.out.println("Número divisible por 3 " + divisiblesPor3[contador] + " en el índice " + contador); // Mostramos el número y su índice
                contador++; // Incrementamos el contador para avanzar al siguiente índice del arreglo
            }
        }
    }
}