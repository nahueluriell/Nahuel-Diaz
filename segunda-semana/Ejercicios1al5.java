1)

import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] args) {
        resolverProblema();
    }
    
    static void resolverProblema() {
        ArrayList<String> ladoInicio = new ArrayList<>();
        ArrayList<String> ladoFinal = new ArrayList<>();
        ArrayList<String> bote = new ArrayList<>();
        
        ladoInicio.add("granjero");
        ladoInicio.add("lobo");
        ladoInicio.add("gallina");
        ladoInicio.add("maíz");
        
        while (!ladoInicio.isEmpty()) {
            // Movimiento del granjero y un acompañante al otro lado del río
            moverBote(ladoInicio, bote);
            
            // Verificar si el granjero está en el lado final con los elementos
            // que podrían ser comidos
            if (bote.contains("gallina") && bote.contains("maíz")) {
                System.out.println("La gallina se comió el maíz");
                break;
            }
            if (bote.contains("lobo") && bote.contains("gallina")) {
                System.out.println("El lobo se comió la gallina");
                break;
            }
            
            // Movimiento del granjero de regreso al lado de inicio
            moverBote(bote, ladoFinal);
        }
        
        System.out.println("Todos llegaron al otro lado del río");
    }
    
    static void moverBote(ArrayList<String> origen, ArrayList<String> destino) {
        if (origen.contains("granjero")) {
            origen.remove("granjero");
            destino.add("granjero");
        }
        if (!origen.isEmpty()) {
            String ocupante = origen.remove(0);
            destino.add(ocupante);
        }
        if (!origen.isEmpty()) {
            String ocupante = origen.remove(0);
            destino.add(ocupante);
        }
    }
}


2) 

public class Principal {
    public static void main(String[] args) {
        
        String[] trabajos = {"diseñadora de moda", "florista", "jardinera", "directora de orquesta"};
        String[] mujeres = {"Clara", "Luisa", "María", "Nélida"};

         
        String[][] permutaciones = {
            {"diseñadora de moda", "florista", "jardinera", "directora de orquesta"},
            {"diseñadora de moda", "florista", "directora de orquesta", "jardinera"},
            {"diseñadora de moda", "jardinera", "florista", "directora de orquesta"},
            {"diseñadora de moda", "jardinera", "directora de orquesta", "florista"},
            {"diseñadora de moda", "directora de orquesta", "florista", "jardinera"},
            {"diseñadora de moda", "directora de orquesta", "jardinera", "florista"},
            {"florista", "diseñadora de moda", "jardinera", "directora de orquesta"},
            {"florista", "diseñadora de moda", "directora de orquesta", "jardinera"},
            {"florista", "jardinera", "diseñadora de moda", "directora de orquesta"},
            {"florista", "jardinera", "directora de orquesta", "diseñadora de moda"},
            {"florista", "directora de orquesta", "diseñadora de moda", "jardinera"},
            {"florista", "directora de orquesta", "jardinera", "diseñadora de moda"},
            {"jardinera", "diseñadora de moda", "florista", "directora de orquesta"},
            {"jardinera", "diseñadora de moda", "directora de orquesta", "florista"},
            {"jardinera", "florista", "diseñadora de moda", "directora de orquesta"},
            {"jardinera", "florista", "directora de orquesta", "diseñadora de moda"},
            {"jardinera", "directora de orquesta", "diseñadora de moda", "florista"},
            {"jardinera", "directora de orquesta", "florista", "diseñadora de moda"},
            {"directora de orquesta", "diseñadora de moda", "florista", "jardinera"},
            {"directora de orquesta", "diseñadora de moda", "jardinera", "florista"},
            {"directora de orquesta", "florista", "diseñadora de moda", "jardinera"},
            {"directora de orquesta", "florista", "jardinera", "diseñadora de moda"},
            {"directora de orquesta", "jardinera", "diseñadora de moda", "florista"},
            {"directora de orquesta", "jardinera", "florista", "diseñadora de moda"}
        };

     
        for (String[] permutacion : permutaciones) {
         
            if (cumplePistas(permutacion)) {
           
                for (int i = 0; i < permutacion.length; i++) {
                    System.out.println(mujeres[i] + " trabaja como " + permutacion[i]);
                }
                break;
            }
        }
    }

 
    public static boolean cumplePistas(String[] permutacion) {
        // (a) Clara es violentamente alérgica a las plantas.
        if (permutacion[0].equals("jardinera")) {
            return false;
        }
        // (b) Luisa y la florista comparten el departamento
        if (permutacion[1].equals("florista") && !permutacion[2].equals("florista")) {
            return false;
        }
        // (c) A María y Luisa les gusta solamente la música rock
        if (!permutacion[1].equals("directora de orquesta") && !permutacion[2].equals("directora de orquesta")) {
            return false;
        }
        // (d) La jardinera, la diseñadora de modas y Nélida no se conocen entre sí
        if (permutacion[0].equals("jardinera") || permutacion[1].equals("diseñadora de moda") || permutacion[3].equals("jardinera")) {
            return false;
        }
        return true;
    }
}


3) 


public class Principal {
    public static void main(String[] args) {
        // Creamos un arreglo de booleanos para representar si cada frasco tiene veneno o no
        boolean[] frascos = new boolean[6];
        
        // Marcamos los frascos que sabemos que no tienen veneno
        frascos[0] = false; // Rojo
        frascos[2] = false; // Anaranjado
        
        // Aplicamos las restricciones que se dieron
        frascos[4] = true; // Violeta
        frascos[5] = true; // Azul
        
        // Aplicamos las restricciones adicionales
        frascos[1] = !frascos[2]; // Amarillo
        frascos[3] = !frascos[0]; // Verde
        
        // Mostramos los resultados
        System.out.println("Los frascos que tienen veneno son:");
        for (int i = 0; i < frascos.length; i++) {
            if (frascos[i]) {
                switch (i) {
                    case 0:
                        System.out.println("Rojo");
                        break;
                    case 1:
                        System.out.println("Amarillo");
                        break;
                    case 2:
                        System.out.println("Anaranjado");
                        break;
                    case 3:
                        System.out.println("Verde");
                        break;
                    case 4:
                        System.out.println("Violeta");
                        break;
                    case 5:
                        System.out.println("Azul");
                        break;
                }
            }
        }
    }
}


4)

import java.util.*;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la expresión matemática: ");
        String expresion = scanner.nextLine();

        try {
            double resultado = evaluarExpresion(expresion);
            System.out.println("El resultado es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    public static double evaluarExpresion(String expresion) {
        List<String> tokens = tokenizar(expresion);
        Queue<String> cola = new LinkedList<>(tokens);
        return evaluarExpresionRecursiva(cola);
    }

    private static List<String> tokenizar(String expresion) {
        List<String> tokens = new ArrayList<>();
        StringBuilder tokenActual = new StringBuilder();

        for (char c : expresion.toCharArray()) {
            if (Character.isDigit(c) || c == '.') {
                tokenActual.append(c);
            } else if (esOperador(c)) {
                if (tokenActual.length() > 0) {
                    tokens.add(tokenActual.toString());
                    tokenActual = new StringBuilder();
                }
                tokens.add(String.valueOf(c));
            } else if (Character.isWhitespace(c)) {
                continue;
            } else {
                throw new IllegalArgumentException("Carácter no válido: " + c);
            }
        }

        if (tokenActual.length() > 0) {
            tokens.add(tokenActual.toString());
        }

        return tokens;
    }

    private static boolean esOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '√';
    }

    private static double evaluarExpresionRecursiva(Queue<String> cola) {
        double izquierdo = Double.parseDouble(cola.poll());

        if (cola.isEmpty()) {
            return izquierdo;
        }

        String operador = cola.poll();
        double derecho = evaluarExpresionRecursiva(cola);

        switch (operador) {
            case "+":
                return izquierdo + derecho;
            case "-":
                return izquierdo - derecho;
            case "*":
                return izquierdo * derecho;
            case "/":
                if (derecho == 0) {
                    throw new ArithmeticException("División por cero");
                }
                return izquierdo / derecho;
            case "^":
                return Math.pow(izquierdo, derecho);
            case "√":
                if (izquierdo < 0) {
                    throw new ArithmeticException("Raíz cuadrada de número negativo");
                }
                return Math.sqrt(izquierdo);
            default:
                throw new IllegalArgumentException("Operador no válido: " + operador);
        }
    }
}


5) 

public class Principal {
    public static void main(String[] args) {
        int a = 2;
        int b = 12;
        
        // Desplazamiento a la izquierda por un número positivo
        int resultado1 = a << 2;
        System.out.println("Resultado de 2 << 2: " + resultado1); // = 8
        
        // Desplazamiento a la izquierda por un número negativo
        int resultado2 = a << -2;
        System.out.println("Resultado de 2 << -2: " + resultado2); // = -2147483648
        
        // Desplazamiento a la izquierda por un número positivo
        int resultado3 = b << -2;
        System.out.println("Resultado de 12 << -2: " + resultado3); // = 0
    }
}
