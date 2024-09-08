package ejercicios;

public class ejercicio9 {

	 public static void main(String[] args) {
	        String mensaje;
	        char caracter;
	        int encriptado = 79 >> 2;
	        
	        encriptado = (~((-160) >> 3) << 2) + 3;
	        caracter = (char) encriptado;
	        mensaje = String.valueOf(caracter);
	        
	        encriptado = (((encriptado >> 1 ) ^ 30) << 1) -7;
	        caracter = (char) encriptado;
	        mensaje += String.valueOf(caracter);
	        
	        System.out.println("Mensaje descifrado: " + mensaje);
	    }
	
}
