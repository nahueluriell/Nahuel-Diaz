package ejerciciopag16;
import java.util.*;
import java.util.regex.*;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una expresión matemática:");
        String expresion = scanner.nextLine();
        if (esExpresionValida(expresion)) {
            double resultado = evaluarExpresion(expresion);
            System.out.println("El resultado es: " + resultado);
        } else {
            System.out.println("La expresión ingresada no es válida.");
        }
        scanner.close();
    }

    static boolean esExpresionValida(String expresion) {
        String regex = "^[0-9+\\-*/^()\\s.]+$";
        return Pattern.matches(regex, expresion);
    }

    static double evaluarExpresion(String expresion) {
        return new Object() {
            int pos = -1, ch;

            void siguienteCaracter() {
                ch = (++pos < expresion.length()) ? expresion.charAt(pos) : -1;
            }

            boolean esBlanco() {
                while (Character.isWhitespace(ch)) siguienteCaracter();
                return false;
            }

            double evaluar() {
                siguienteCaracter();
                double resultado = parsearOperando();
                System.out.println("Operando inicial: " + resultado);
                while (pos < expresion.length()) {
                    if (esBlanco()) continue;
                    char operador = (char) ch;
                    System.out.println("Operador actual: " + operador);
                    if (operador == '+' || operador == '-') {
                        siguienteCaracter();
                        double siguienteOperando = parsearOperando();
                        System.out.println("Siguiente operando: " + siguienteOperando);
                        if (operador == '+') resultado += siguienteOperando;
                        else resultado -= siguienteOperando;
                        System.out.println("Resultado parcial: " + resultado);
                    } else {
                        double siguienteOperando = parsearOperando();
                        System.out.println("Siguiente operando: " + siguienteOperando);
                        if (operador == '*') resultado *= siguienteOperando;
                        else if (operador == '/') resultado /= siguienteOperando;
                        else if (operador == '^') resultado = Math.pow(resultado, siguienteOperando);
                        System.out.println("Resultado parcial: " + resultado);
                    }
                }
                return resultado;
            }

            double parsearOperando() {
                esBlanco();
                if (ch == '(') {
                    siguienteCaracter();
                    double resultado = evaluar();
                    if (ch == ')') siguienteCaracter();
                    return resultado;
                }
                StringBuilder sb = new StringBuilder();
                while ((ch >= '0' && ch <= '9') || ch == '.') {
                    sb.append((char) ch);
                    siguienteCaracter();
                }
                return Double.parseDouble(sb.toString());
            }
        }.evaluar();
    }
}