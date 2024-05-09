package ejercicio1pag20;

public class ejercicio6 {
    public static void main(String[] args) {
        int[] numerosPares = new int[20]; // Creamos un arreglo para almacenar los primeros 20 números pares
        int suma = 0; // Inicializamos una variable para almacenar la suma de los números pares
        for (int i = 0; i < 20; i++) {
            numerosPares[i] = (i + 1) * 2; // Calculamos y almacenamos el número par en el arreglo
            suma += numerosPares[i]; // Sumamos el número par al total
            System.out.println("Número par " + numerosPares[i] + " en el índice " + i); // Mostramos cada número par y su índice
        }
        System.out.println("Suma de los primeros 20 números pares: " + suma); // Mostramos la suma de los números pares
    }
}