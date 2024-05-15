package ejercicios;

public class ejercicio4 {
	
	  public static void main(String[] args) {
	        short a = 10;
	        long b;
	        float c;
	        String d;

	        b = a;
	        c = b;
	        d = Float.toString(c);
	        a = Short.parseShort(d);

	        System.out.println("a: " + a);
	        System.out.println("b: " + b);
	        System.out.println("c: " + c);
	        System.out.println("d: " + d);
	        
	    }
}
