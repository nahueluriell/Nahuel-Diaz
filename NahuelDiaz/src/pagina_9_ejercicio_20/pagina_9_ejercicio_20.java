package pagina_9_ejercicio_20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej_20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de artículos
        System.out.print("Ingrese el número de artículos: ");
        int numArticulos = 0;
        while (true) {
            try {
                numArticulos = scanner.nextInt();
                if (numArticulos <= 0) {
                    throw new IllegalArgumentException("El número de artículos debe ser mayor que 0.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número entero válido.");
                scanner.next();  // Limpiar el buffer
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                scanner.next();  // Limpiar el buffer
            }
        }
        scanner.nextLine();  // Limpiar el buffer después de nextInt()

        // Inicializar arreglos para artículos
        String[] nombres = new String[numArticulos];
        int[] cantidades = new int[numArticulos];
        double[] precios = new double[numArticulos];

        // Ingresar datos de cada artículo
        for (int i = 0; i < numArticulos; i++) {
            System.out.print("Ingrese el nombre del artículo #" + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.print("Ingrese la cantidad de " + nombres[i] + ": ");
            while (true) {
                try {
                    cantidades[i] = scanner.nextInt();
                    if (cantidades[i] < 0) {
                        throw new IllegalArgumentException("La cantidad no puede ser negativa.");
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, ingrese un número entero válido para la cantidad.");
                    scanner.next();  // Limpiar el buffer
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    scanner.next();  // Limpiar el buffer
                }
            }

            System.out.print("Ingrese el precio unitario de " + nombres[i] + ": ");
            while (true) {
                try {
                    precios[i] = scanner.nextDouble();
                    if (precios[i] < 0) {
                        throw new IllegalArgumentException("El precio no puede ser negativo.");
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, ingrese un número decimal válido para el precio.");
                    scanner.next();  // Limpiar el buffer
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    scanner.next();  // Limpiar el buffer
                }
            }
            scanner.nextLine();  // Limpiar el buffer después de nextDouble()
        }

        // Mostrar la factura
        System.out.println("\n--- Factura ---");
        double total = 0;
        for (int i = 0; i < numArticulos; i++) {
            double subtotal = cantidades[i] * precios[i];
            total += subtotal;
            System.out.printf("Artículo #%d: %-20s | Cantidad: %d | Precio Unitario: %.2f | Subtotal: %.2f\n",
                i + 1, nombres[i], cantidades[i], precios[i], subtotal);
        }

        System.out.printf("\nTotal a pagar: %.2f\n", total);

        scanner.close();
    }
}
