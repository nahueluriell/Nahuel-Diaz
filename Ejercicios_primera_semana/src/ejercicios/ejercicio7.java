package ejercicios;

public class ejercicio7 {
   
	

    public static void main(String[] args) {
        // Línea 1
        boolean resultado1 = !(true ^ 10 > 5) & !(!true || !(false ^ false));
        System.out.println("Resultado de la línea 1: " + resultado1);

        // Línea 2
        boolean resultado2 = (10 < 5) && (false) || (false == true) ^ 8.3f >= 8.3f;
        System.out.println("Resultado de la línea 2: " + resultado2);

        // Línea 3
        boolean resultado3 = 5 < 11 ^ 5 > 15 | 2 == 2 & false ^ !true ^ 10 <= 10;
        System.out.println("Resultado de la línea 3: " + resultado3);

        // Línea 4
        boolean resultado4 = !(true && true || false ^ !(4==3) & 3 > 1 ^ !true);
        System.out.println("Resultado de la línea 4: " + resultado4);
    }
	
	
}
