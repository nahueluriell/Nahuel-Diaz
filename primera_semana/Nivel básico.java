1) 
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su peso en la Tierra
        System.out.print("Ingrese su peso en la Tierra (en kg): ");
        double pesoEnLaTierra = scanner.nextDouble();

        // Calcular el peso efectivo en la Luna (17% del peso en la Tierra)
        double pesoEnLaLuna = pesoEnLaTierra * 0.17;

        // Mostrar el peso efectivo en la Luna al usuario
        System.out.println("Su peso efectivo en la Luna es: " + pesoEnLaLuna + " kg");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}


2)

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        int numero;
        do {
            // Solicitar al usuario un número entero de 5 dígitos
            System.out.print("Ingrese un número entero de 5 dígitos: ");
            numero = scanner.nextInt();

            // Verificar si el número tiene 5 dígitos
            if (numero < 10000 || numero > 99999) {
                System.out.println("Error: El número debe tener 5 dígitos. Inténtelo de nuevo.");
            }
        } while (numero < 10000 || numero > 99999); // Repetir hasta que se ingrese un número de 5 dígitos

        // Calcular la suma de los dígitos del número
        int suma = 0;
        int tempNumero = numero;
        while (tempNumero > 0) {
            int digito = tempNumero % 10; // Obtener el último dígito
            suma += digito; // Sumar el dígito a la suma total
            tempNumero /= 10; // Eliminar el último dígito del número
        }

        // Mostrar la suma de los dígitos por consola
        System.out.println("La suma de los dígitos del número " + numero + " es: " + suma);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}


3)

public class Principal {
    public static void main(String[] args) {
        System.out.println("Número\tCuadrado\tCubo");
        for (int i = 0; i <= 10; i++) {
            int cuadrado = i * i;
            int cubo = i * i * i;
            System.out.println(i + "\t" + cuadrado + "\t\t" + cubo);
        }
    }
}



4)

public class Principal {
    public static void main(String[] args) {
        int contador = 0;
        
        for (int i = 31; i <= 126; i++) {
            System.out.print((char) i + " "); // Imprimir el carácter correspondiente al valor ASCII
            
            contador++;
            
            // Salto de línea cada 15 caracteres
            if (contador == 15) {
                System.out.println(); // Salto de línea
                contador = 0; // Reiniciar el contador de columnas
            }
        }
    }
}


5)


public class Principal {
    public static void main(String[] args) {
        int limite = 20; // Número de términos de Fibonacci que se desea generar

        // Definir los primeros dos términos de la sucesión
        int x1 = 1;
        int x2 = 1;

        // Imprimir los dos primeros términos
        System.out.println("Los primeros " + limite + " números de la sucesión de Fibonacci son:");
        System.out.print(x1 + " " + x2 + " ");

        // Calcular y mostrar los términos siguientes
        for (int i = 3; i <= limite; i++) {
            int xn = x1 + x2;
            System.out.print(xn + " ");
            x1 = x2;
            x2 = xn;
        }
    }
}


6)

public class Principal {
    public static void main(String[] args) {
        long poblacionActual = 7309784505L; // Población actual
        long crecimientoAnual = 24807909L; // Crecimiento poblacional por año

        System.out.println("Población mundial después de:");
        for (int i = 1; i <= 5; i++) {
            poblacionActual += crecimientoAnual;
            System.out.println("Año " + i + ": " + poblacionActual);
        }
    }
}



7)

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad en pesos: ");
        int cantidad = scanner.nextInt();

        int[] denominaciones = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] cantidadDenominaciones = new int[10];

        for (int i = 0; i < denominaciones.length; i++) {
            cantidadDenominaciones[i] = cantidad / denominaciones[i];
            cantidad %= denominaciones[i];
        }

        System.out.println("Cantidad mínima de billetes y monedas:");
        for (int i = 0; i < denominaciones.length; i++) {
            if (cantidadDenominaciones[i] > 0) {
                if (denominaciones[i] >= 1000) {
                    System.out.println(cantidadDenominaciones[i] + " billetes de $" + denominaciones[i]);
                } else {
                    System.out.println(cantidadDenominaciones[i] + " monedas de $" + denominaciones[i]);
                }
            }
        }

        scanner.close();
    }
}



8).

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo como un entero: ");
        int radio = scanner.nextInt();

        double diametro = 2 * radio;
        double circunferencia = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;

        System.out.println("Diámetro: " + diametro);
        System.out.println("Circunferencia: " + circunferencia);
        System.out.println("Área: " + area);

        scanner.close();
    }
}



9) 

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        long factorial = calcularFactorial(numero);

        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }

    public static long calcularFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos.");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long resultado = 1;
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}

10)

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto del préstamo: ");
        double montoPrestamo = scanner.nextDouble();

        System.out.println("Ingrese el porcentaje de interés anual: ");
        double interesAnual = scanner.nextDouble();

        System.out.println("Ingrese el valor que desea abonar por mes: ");
        double abonoPorMes = scanner.nextDouble();

        double saldo = montoPrestamo;
        int meses = 0;

        while (saldo > 0) {
            double interesMensual = saldo * (interesAnual / 100) / 12;
            saldo += interesMensual - abonoPorMes;
            meses++;
        }

        int anios = meses / 12;
        meses = meses % 12;

        System.out.println("Se tardará " + anios + " años y " + meses + " meses en pagar el préstamo.");

        scanner.close();
    }
}



11)

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la duración de la llamada en minutos: ");
        int duracionLlamada = scanner.nextInt();

        double costoLlamada = calcularCostoLlamada(duracionLlamada);

        System.out.println("El monto a pagar por la llamada telefónica es: $" + costoLlamada);

        scanner.close();
    }

    public static double calcularCostoLlamada(int duracionLlamada) {
        double costoBase = 5.0; // Costo base por hasta 5 minutos
        double costoAdicionalPorMinuto = 0.5; // Costo adicional por minuto

        if (duracionLlamada <= 5) {
            return costoBase;
        } else {
            return costoBase + (duracionLlamada - 5) * costoAdicionalPorMinuto;
        }
    }
}



12)

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un año para determinar si es bisiesto: ");
        int anio = scanner.nextInt();

        boolean esBisiesto = determinarBisiesto(anio);

        if (esBisiesto) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }

        scanner.close();
    }

    public static boolean determinarBisiesto(int anio) {
        // Si es múltiplo de 4
        if (anio % 4 == 0) {
            // Si es múltiplo de 100 y no es múltiplo de 400, no es bisiesto
            if (anio % 100 == 0 && anio % 400 != 0) {
                return false;
            }
            // Si no es múltiplo de 100 o es múltiplo de 400, es bisiesto
            return true;
        }
        return false; // No es múltiplo de 4, por lo tanto no es bisiesto
    }
}

13)

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero para determinar si es capicúa: ");
        int numero = scanner.nextInt();

        boolean esCapicua = esCapicua(numero);

        if (esCapicua) {
            System.out.println(numero + " es un número capicúa.");
        } else {
            System.out.println(numero + " no es un número capicúa.");
        }

        scanner.close();
    }

    public static boolean esCapicua(int numero) {
        int original = numero;
        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        return original == invertido;
    }
}


14)
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la fecha en formato 'dd mm aaaa': ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anio = scanner.nextInt();

        String fechaEnTexto = convertirFechaATexto(dia, mes, anio);

        System.out.println("La fecha es: " + fechaEnTexto);

        scanner.close();
    }

    public static String convertirFechaATexto(int dia, int mes, int anio) {
        String[] nombresMeses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        
        String textoDia = Integer.toString(dia);
        String textoMes = nombresMeses[mes - 1]; // Indices de array comienzan desde 0
        String textoAnio = Integer.toString(anio);

        return textoDia + " de " + textoMes + " de " + textoAnio;
    }
}




15) 

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de segundos: ");
        int segundos = scanner.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;

        System.out.println(segundos + " segundos son equivalentes a:");
        System.out.println(horas + " horas, " + minutos + " minutos y " + segundosRestantes + " segundos.");

        scanner.close();
    }
}


16) 
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la hora en formato hh:mm:ss: ");
        String horaActual = scanner.nextLine();

        System.out.println("Ingrese la cantidad de segundos: ");
        int segundos = scanner.nextInt();

        String nuevoTiempo = calcularNuevoTiempo(horaActual, segundos);

        System.out.println("El tiempo dentro de " + segundos + " segundos será: " + nuevoTiempo);

        scanner.close();
    }

    public static String calcularNuevoTiempo(String horaActual, int segundos) {
        String[] partesHora = horaActual.split(":");
        int horas = Integer.parseInt(partesHora[0]);
        int minutos = Integer.parseInt(partesHora[1]);
        int segundosActuales = Integer.parseInt(partesHora[2]);

        int totalSegundosActuales = horas * 3600 + minutos * 60 + segundosActuales;
        int totalSegundosFuturo = totalSegundosActuales + segundos;

        int horasFuturo = totalSegundosFuturo / 3600;
        int minutosFuturo = (totalSegundosFuturo % 3600) / 60;
        int segundosFuturo = totalSegundosFuturo % 60;

        return String.format("%02d:%02d:%02d", horasFuturo, minutosFuturo, segundosFuturo);
    }
}



17)

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.println("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        System.out.println("Ingrese el valor de c: ");
        double c = scanner.nextDouble();

        resolverEcuacionSegundoGrado(a, b, c);

        scanner.close();
    }

    public static void resolverEcuacionSegundoGrado(double a, double b, double c) {
        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces son reales y diferentes:");
            System.out.println("x1 = " + raiz1);
            System.out.println("x2 = " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La raíz es real y única:");
            System.out.println("x = " + raiz);
        } else {
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("Las raíces son complejas:");
            System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
        }
    }
}


18) 

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero para convertir a binario: ");
        int numero = scanner.nextInt();

        String binario = convertirABinario(numero);

        System.out.println("El número " + numero + " en binario es: " + binario);

        scanner.close();
    }

    public static String convertirABinario(int numero) {
        if (numero == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();

        while (numero > 0) {
            int residuo = numero % 2;
            binario.insert(0, residuo); // Inserta el residuo al principio de la cadena binaria
            numero /= 2; // División entera
        }

        return binario.toString();
    }
}


19)

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la velocidad en kilómetros por hora (km/h): ");
        double velocidadKmh = scanner.nextDouble();

        double velocidadMs = convertirAKmPorSegundo(velocidadKmh);

        System.out.println("La velocidad es: " + velocidadMs + " metros por segundo (m/s)");

        scanner.close();
    }

    public static double convertirAKmPorSegundo(double velocidadKmh) {
        return velocidadKmh * 1000 / 3600; // 1 km/h = 1000 m / 3600 s
    }
}



20)

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de artículos vendidos: ");
        int cantidadArticulos = scanner.nextInt();

        int[] numerosArticulos = new int[cantidadArticulos];
        int[] cantidades = new int[cantidadArticulos];
        double[] preciosUnitarios = new double[cantidadArticulos];
        double total = 0;

        // Entrada de datos
        for (int i = 0; i < cantidadArticulos; i++) {
            System.out.println("Ingrese el número del artículo " + (i + 1) + ": ");
            numerosArticulos[i] = scanner.nextInt();

            System.out.println("Ingrese la cantidad del artículo " + (i + 1) + ": ");
            cantidades[i] = scanner.nextInt();

            System.out.println("Ingrese el precio unitario del artículo " + (i + 1) + ": ");
            preciosUnitarios[i] = scanner.nextDouble();

            total += cantidades[i] * preciosUnitarios[i];
        }

        // Imprimir factura
        System.out.println("\n=== Factura ===");
        System.out.println("Nro de artículo | Cantidad | Precio unitario");
        for (int i = 0; i < cantidadArticulos; i++) {
            System.out.println(numerosArticulos[i] + "               | " + cantidades[i] + "        | $" + preciosUnitarios[i]);
        }
        System.out.println("\nTotal a pagar: $" + total);

        scanner.close();
    }
}