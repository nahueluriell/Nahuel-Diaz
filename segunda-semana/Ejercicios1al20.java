1)

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Crear un vector para almacenar 10 números enteros
        int[] numeros = new int[10];
        
        // Pedir al usuario que ingrese los 10 números enteros
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Ingrese un número entero válido.");
                System.out.print("Ingrese el número en la posición " + i + ": ");
                scanner.next(); // Limpiar el buffer del scanner
            }
            numeros[i] = scanner.nextInt();
        }
        
        // Mostrar los datos del vector junto con sus índices correspondientes
        System.out.println("\nDatos del vector:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}


2)

public class Principal {
    public static void main(String[] args) {
        // Crear un arreglo para almacenar los números enteros entre 4 y 14
        int[] numeros = new int[11]; // 11 elementos para incluir del 4 al 14
        
        // Llenar el arreglo con los números enteros comprendidos entre 4 y 14
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 4;
        }
        
        // Mostrar los datos del arreglo junto con sus índices correspondientes
        System.out.println("Datos del arreglo:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
    }
}


3)

public class Principal {
    public static void main(String[] args) {
        // Crear un arreglo para almacenar los números pares entre 1 y 100
        int[] numerosPares = new int[50]; // 50 números pares entre 1 y 100
        
        // Llenar el arreglo con los números pares comprendidos entre 1 y 100
        int numero = 2;
        for (int i = 0; i < numerosPares.length; i++) {
            numerosPares[i] = numero;
            numero += 2; // Incrementar para obtener el siguiente número par
        }
        
        // Mostrar los datos del arreglo junto con sus índices correspondientes
        System.out.println("Datos del arreglo:");
        for (int i = 0; i < numerosPares.length; i++) {
            System.out.println("Índice " + i + ": " + numerosPares[i]);
        }
    }
}


4)

public class Principal {
    public static void main(String[] args) {
        // Crear un arreglo para almacenar los números divisibles por 3 entre 0 y 100
        int[] numerosDivisiblesPor3 = new int[34]; // Hay 34 números entre 0 y 100 que son divisibles por 3
        
        // Llenar el arreglo con los números divisibles por 3 comprendidos entre 0 y 100
        int contador = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                numerosDivisiblesPor3[contador] = i;
                contador++;
            }
        }
        
        // Mostrar los datos del arreglo junto con sus índices correspondientes
        System.out.println("Datos del arreglo:");
        for (int i = 0; i < numerosDivisiblesPor3.length; i++) {
            System.out.println("Índice " + i + ": " + numerosDivisiblesPor3[i]);
        }
    }
}


5) 

public class Principal {
    public static void main(String[] args) {
        // Crear un arreglo para almacenar cinco números enteros consecutivos
        int[] arregloOriginal = new int[5];
        
        // Llenar el arreglo con cinco números enteros consecutivos
        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloOriginal[i] = i + 1;
        }
        
        // Mostrar el arreglo original
        System.out.println("Arreglo original:");
        mostrarArreglo(arregloOriginal);
        
        // Hacer una copia del arreglo original en otro arreglo
        int[] arregloCopia = new int[arregloOriginal.length];
        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloCopia[i] = arregloOriginal[i];
        }
        
        // Mostrar el arreglo copia
        System.out.println("\nArreglo copia:");
        mostrarArreglo(arregloCopia);
    }
    
    // Método para mostrar los elementos de un arreglo
    public static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Índice " + i + ": " + arreglo[i]);
        }
    }
}


6)

public class Principal {
    public static void main(String[] args) {
        // Crear un arreglo para almacenar los veinte primeros números pares
        int[] numerosPares = new int[20];
        
        // Llenar el arreglo con los veinte primeros números pares
        int numero = 2;
        for (int i = 0; i < numerosPares.length; i++) {
            numerosPares[i] = numero;
            numero += 2; // Incrementar para obtener el siguiente número par
        }
        
       
        int suma = 0;
        for (int i = 0; i < numerosPares.length; i++) {
            suma += numerosPares[i];
        }
        
     
        System.out.println("La suma de los veinte primeros números pares es: " + suma);
    }
}


7)

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Crear un arreglo para almacenar cinco números
        double[] numeros = new double[5];
        
        // Solicitar al usuario que ingrese cinco números y almacenarlos en el arreglo
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: Ingrese un número válido.");
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                scanner.next(); // Limpiar el buffer del scanner
            }
            numeros[i] = scanner.nextDouble();
        }
        
       
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        
       
        double promedio = suma / numeros.length;
        
   
        System.out.println("El promedio de los números ingresados es: " + promedio);
        
       
        scanner.close();
    }
}

8)

public class Principal {
    public static void main(String[] args) {
        // Asignar los números al arreglo
        int[] numeros = {-2, 5, 8, -9, 10, 15, -4};
        
        // Calcular la suma de los elementos positivos y negativos
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
            }
        }
        
        // Informar la suma de los elementos positivos y negativos
        System.out.println("Suma de los elementos positivos: " + sumaPositivos);
        System.out.println("Suma de los elementos negativos: " + sumaNegativos);
    }
}


9)

public class Principal {
    public static void main(String[] args) {
        // Crear un arreglo para almacenar los números primos
        int[] numerosPrimos = new int[25]; // Hay 25 números primos entre 1 y 100
        
        // Índice para almacenar los números primos en el arreglo
        int indice = 0;
        
        // Iterar sobre los números del 1 al 100 y verificar si son primos
        for (int i = 2; i <= 100; i++) {
            if (esPrimo(i)) {
                numerosPrimos[indice] = i;
                indice++;
            }
        }
        
        // Mostrar los datos del arreglo junto con sus índices correspondientes
        System.out.println("Números primos entre 1 y 100:");
        for (int i = 0; i < indice; i++) {
            System.out.println("Índice " + i + ": " + numerosPrimos[i]);
        }
    }
    
    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}


10)

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Pedir al usuario que ingrese una cadena
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine().toLowerCase(); // Convertir la cadena a minúsculas para simplificar
        
        // Contar el número de vocales en la cadena
        int contadorVocales = contarVocales(cadena);
        
        // Informar el número de vocales
        System.out.println("El número de vocales en la cadena es: " + contadorVocales);
        
 
        scanner.close();
    }
    
    // Función para contar el número de vocales en una cadena
    public static int contarVocales(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (esVocal(caracter)) {
                contador++;
            }
        }
        return contador;
    }
    
    // Función para verificar si un carácter es una vocal
    public static boolean esVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}


11)

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Pedir al usuario que ingrese una cadena de caracteres
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = scanner.nextLine();
        
        // Mostrar la cadena al revés
        String cadenaAlReves = reversoCadena(cadena);
        System.out.println("Cadena al revés: " + cadenaAlReves);
        
        // Cerrar el scanner
        scanner.close();
    }
    
    // Función para obtener el reverso de una cadena
    public static String reversoCadena(String cadena) {
        StringBuilder reverso = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            reverso.append(cadena.charAt(i));
        }
        return reverso.toString();
    }
}

12)

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String cadena = scanner.nextLine();
        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();

        if (cadena.equalsIgnoreCase(cadenaInvertida)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
    }
}

13)

public class ParesImpares {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        System.out.println("Números pares:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }

        System.out.println("Números impares:");
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
        }
    }
}




14)

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la dimensión del vector:");
        int dimension = scanner.nextInt();
        int[] vector = new int[dimension];

        for (int i = 0; i < dimension; i++) {
            System.out.println("Introduce el número para la posición " + i + ":");
            vector[i] = scanner.nextInt();
        }

        Arrays.sort(vector);

        System.out.println("Vector ordenado:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Índice: " + i + " Valor: " + vector[i]);
        }
    }
}



15)

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la dimensión del vector:");
        int dimension = scanner.nextInt();
        int[] vector = new int[dimension];

        for (int i = 0; i < dimension; i++) {
            System.out.println("Introduce el número para la posición " + i + ":");
            vector[i] = scanner.nextInt();
        }

        Arrays.sort(vector);

        System.out.println("Vector ordenado:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Índice: " + i + " Valor: " + vector[i]);
        }

        System.out.println("Valor máximo: " + vector[vector.length - 1]);
        System.out.println("Valor mínimo: " + vector[0]);
    }
}



16)

import java.util.Arrays;
import java.util.Scanner;

public class ContarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la dimensión del vector:");
        int dimension = scanner.nextInt();
        int[] vector = new int[dimension];

        int positivos = 0, negativos = 0, ceros = 0;

        for (int i = 0; i < dimension; i++) {
            System.out.println("Introduce el número para la posición " + i + ":");
            vector[i] = scanner.nextInt();

            if (vector[i] > 0) {
                positivos++;
            } else if (vector[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        Arrays.sort(vector);

        System.out.println("Vector ordenado:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Índice: " + i + " Valor: " + vector[i]);
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}



17)

import java.util.Scanner;

public class MenuVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[20];
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Consultar posición");
            System.out.println("2. Asignar valor a posición");
            System.out.println("3. Modificar valor en posición");
            System.out.println("4. Eliminar valor en posición");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Introduce la posición (0-19): ");
                int posicion = scanner.nextInt();

                if (posicion < 0 || posicion >= 20) {
                    System.out.println("Posición no válida.");
                    continue;
                }

                switch (opcion) {
                    case 1:
                        System.out.println("Valor en la posición " + posicion + ": " + vector[posicion]);
                        break;
                    case 2:
                    case 3:
                        System.out.print("Introduce el valor a asignar: ");
                        vector[posicion] = scanner.nextInt();
                        System.out.println("Valor asignado.");
                        break;
                    case 4:
                        vector[posicion] = 0;
                        System.out.println("Valor eliminado.");
                        break;
                }
            }
        } while (opcion != 5);

        System.out.println("Programa finalizado.");
    }
}



18)

import java.util.Scanner;

public class CopiarUltimasPosiciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arregloOriginal = new int[10];
        int[] arregloCopia = new int[5];

        for (int i = 0; i < arregloOriginal.length; i++) {
            System.out.println("Introduce el valor para la posición " + i + ":");
            arregloOriginal[i] = scanner.nextInt();
        }

        System.arraycopy(arregloOriginal, 5, arregloCopia, 0, 5);

        System.out.println("Arreglo copia:");
        for (int i = 0; i < arregloCopia.length; i++) {
            System.out.println("Índice: " + i + " Valor: " + arregloCopia[i]);
        }
    }
}



19)

import java.util.Scanner;

public class PromedioClase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de alumnos:");
        int n = scanner.nextInt();
        double[] notas = new double[n];
        double suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Introduce la nota del alumno " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
            suma += notas[i];
        }

        double promedio = suma / n;
        System.out.println("Nota promedio: " + promedio);

        System.out.println("Alumnos por encima del promedio:");
        for (int i = 0; i < n; i++) {
            if (notas[i] > promedio) {
                System.out.println("Alumno " + (i + 1) + " con nota: " + notas[i]);
            }
        }
    }
}


20)

import java.util.Scanner;

public class PromedioClase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de alumnos:");
        int n = scanner.nextInt();
        double[] notas = new double[n];
        double suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Introduce la nota del alumno " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
            suma += notas[i];
        }

        double promedio = suma / n;
        System.out.println("Nota promedio: " + promedio);

        System.out.println("Alumnos por encima del promedio:");
        for (int i = 0; i < n; i++) {
            if (notas[i] > promedio) {
                System.out.println("Alumno " + (i + 1) + " con nota: " + notas[i]);
            }
        }
    }
}

