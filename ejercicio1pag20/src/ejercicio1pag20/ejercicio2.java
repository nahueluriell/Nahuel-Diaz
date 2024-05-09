package ejercicio1pag20;

public class ejercicio2 {
    public static void main(String[] args) {
        int[] arreglo = new int[11]; // Creamos un arreglo de enteros con 11 elementos
        for (int i = 0; i < 11; i++) {
            arreglo[i] = i + 4; // Asignamos a cada elemento del arreglo el valor de 'i' más 4
            System.out.println("Número " + arreglo[i] + " en el índice " + i); // Mostramos el número almacenado y su índice
        }
    }
}