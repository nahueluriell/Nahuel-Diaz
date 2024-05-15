package ejercicios;

public class ejercicio8 {

	public static void main(String[] args) {
		
        int i = 43;
        int mascara = 32;
        
        int bit = i & mascara;
        bit >>= 5;
        
        mascara ^= 1;
        
        bit |= i & mascara;
        bit <<= 1;
        
        mascara &= (~bit) >>> 3;
        
        bit += (~(~0)<<1);
        
        mascara += bit + i;
        
        System.out.println("Valor de bit: " + bit);
        System.out.println("Valor de mascara: " + mascara);
    }
	
}
