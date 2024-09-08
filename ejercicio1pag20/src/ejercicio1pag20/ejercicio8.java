package ejercicio1pag20;

public class ejercicio8 {
    public static void main(String[] args) {
        int[] numeros = {-2, 5, 8, -9, 10, 15, -4}; // Definimos un arreglo con los números dados
        int sumaPositivos = 0; // Inicializamos una variable para almacenar la suma de los elementos positivos
        int sumaNegativos = 0; // Inicializamos una variable para almacenar la suma de los elementos negativos
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) { // Si el número es positivo
                sumaPositivos += numeros[i]; // Sumamos el número al total de positivos
                System.out.println("Elemento positivo encontrado: " + numeros[i] + " en el índice " + i); // Mostramos el elemento positivo y su índice
            } else if (numeros[i] < 0) { // Si el número es negativo
                sumaNegativos += numeros[i]; // Sumamos el número al total de negativos
                System.out.println("Elemento negativo encontrado: " + numeros[i] + " en el índice " + i); // Mostramos el elemento negativo y su índice
            }
        }
        System.out.println("Suma de los elementos positivos: " + sumaPositivos); // Mostramos la suma de los elementos positivos
        System.out.println("Suma de los elementos negativos: " + sumaNegativos); // Mostramos la suma de los elementos negativos
    }
}