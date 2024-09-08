package ejercicio1pag20;

public class ejercicio3 {
    public static void main(String[] args) {
        int[] numerosPares = new int[50]; // Creamos un arreglo para almacenar los 50 primeros números pares
        int contador = 0; // Inicializamos un contador para seguir el índice del arreglo
        for (int i = 2; i <= 100; i += 2) { // Iteramos sobre los números pares del 2 al 100
            numerosPares[contador] = i; // Almacenamos el número par en el arreglo
            System.out.println("Número par " + numerosPares[contador] + " en el índice " + contador); // Mostramos el número par y su índice
            contador++; // Incrementamos el contador para avanzar al siguiente índice del arreglo
        }
    }
}