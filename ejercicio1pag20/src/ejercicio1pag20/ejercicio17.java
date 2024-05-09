package ejercicio1pag20;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[20]; // Creamos un vector de enteros con 20 elementos
        for (int i = 0; i < vector.length; i++) { // Iteramos sobre el vector para ingresar los datos
            System.out.print("Ingrese el número en la posición " + i + ": "); // Solicitamos al usuario que ingrese el número en la posición actual
            vector[i] = scanner.nextInt(); // Almacenamos el número ingresado en la posición actual del vector
        }
        boolean continuar = true; // Inicializamos la variable para controlar el bucle de menú
        while (continuar) { // Bucle principal del programa
            System.out.println("Menú:"); // Mostramos el menú de opciones
            System.out.println("1. Consultar dato en una posición");
            System.out.println("2. Asignar dato en una posición");
            System.out.println("3. Modificar dato en una posición");
            System.out.println("4. Eliminar dato en una posición");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: "); // Solicitamos al usuario que seleccione una opción del menú
            int opcion = scanner.nextInt(); // Leemos la opción seleccionada por el usuario

            switch (opcion) { // Evaluamos la opción seleccionada por el usuario
                case 1: // Consultar dato en una posición
                    System.out.print("Ingrese la posición a consultar: "); // Solicitamos al usuario que ingrese la posición a consultar
                    int posConsulta = scanner.nextInt(); // Leemos la posición ingresada por el usuario
                    if (posConsulta >= 0 && posConsulta < vector.length) { // Verificamos que la posición sea válida
                        System.out.println("El dato en la posición " + posConsulta + " es: " + vector[posConsulta]); // Mostramos el dato en la posición especificada
                    } else {
                        System.out.println("La posición ingresada no es válida."); // Mensaje de error si la posición no es válida
                    }
                    break;
                case 2: // Asignar dato en una posición
                    System.out.print("Ingrese la posición a asignar: "); // Solicitamos al usuario que ingrese la posición a asignar
                    int posAsignar = scanner.nextInt(); // Leemos la posición ingresada por el usuario
                    if (posAsignar >= 0 && posAsignar < vector.length) { // Verificamos que la posición sea válida
                        System.out.print("Ingrese el dato a asignar: "); // Solicitamos al usuario que ingrese el dato a asignar
                        int datoAsignar = scanner.nextInt(); // Leemos el dato ingresado por el usuario
                        vector[posAsignar] = datoAsignar; // Asignamos el dato en la posición especificada
                        System.out.println("Dato asignado correctamente en la posición " + posAsignar); // Mensaje de éxito
                    } else {
                        System.out.println("La posición ingresada no es válida."); // Mensaje de error si la posición no es válida
                    }
                    break;
                case 3: // Modificar dato en una posición
                    System.out.print("Ingrese la posición a modificar: "); // Solicitamos al usuario que ingrese la posición a modificar
                    int posModificar = scanner.nextInt(); // Leemos la posición ingresada por el usuario
                    if (posModificar >= 0 && posModificar < vector.length) { // Verificamos que la posición sea válida
                        System.out.print("Ingrese el nuevo dato: "); // Solicitamos al usuario que ingrese el nuevo dato
                        int nuevoDato = scanner.nextInt(); // Leemos el nuevo dato ingresado por el usuario
                        vector[posModificar] = nuevoDato; // Modificamos el dato en la posición especificada
                        System.out.println("Dato modificado correctamente en la posición " + posModificar); // Mensaje de éxito
                    } else {
                        System.out.println("La posición ingresada no es válida."); // Mensaje de error si la posición no es válida
                    }
                    break;
                case 4: // Eliminar dato en una posición
                    System.out.print("Ingrese la posición a eliminar: "); // Solicitamos al usuario que ingrese la posición a eliminar
                    int posEliminar = scanner.nextInt(); // Leemos la posición ingresada por el usuario
                    if (posEliminar >= 0 && posEliminar < vector.length) { // Verificamos que la posición sea válida
                        vector[posEliminar] = 0; // Eliminamos el dato en la posición especificada asignándole el valor 0
                        System.out.println("Dato eliminado correctamente de la posición " + posEliminar); // Mensaje de éxito
                    } else {
                        System.out.println("La posición ingresada no es válida."); // Mensaje de error si la posición no es válida
                    }
                    break;
                case 5: // Salir del programa
                    continuar = false; // Cambiamos el valor de la variable para salir del bucle
                    System.out.println("Saliendo del programa."); // Mensaje de salida
                    break;
                default: // Opción no válida
                    System.out.println("Opción no válida."); // Mensaje de error
                    break;
            }
        }
        scanner.close(); // Cerramos el scanner para evitar fugas de recursos
    }
}