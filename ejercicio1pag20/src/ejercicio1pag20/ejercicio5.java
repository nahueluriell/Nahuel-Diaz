package ejercicio1pag20;

public class ejercicio5 {
    public static void main(String[] args) {
        int[] arregloOriginal = new int[5]; // Creamos un arreglo original con 5 elementos
        for (int i = 0; i < 5; i++) {
            arregloOriginal[i] = i + 1; // Llenamos el arreglo original con números del 1 al 5
        }
        int[] copiaArreglo = arregloOriginal.clone(); // Creamos una copia del arreglo original
        System.out.println("Copia del arreglo:"); // Imprimimos un mensaje indicando que se mostrará la copia del arreglo
        for (int i = 0; i < 5; i++) {
            System.out.println("Número " + copiaArreglo[i] + " en el índice " + i); // Mostramos cada número de la copia del arreglo junto con su índice
        }
    }
}