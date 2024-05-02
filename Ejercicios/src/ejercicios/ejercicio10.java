package ejercicios;

public class ejercicio10 {
	
    public static void main(String[] args) {
        long color = 2295136255L;
        int rojo = (int) (color >> 24); //  rojo
        int verde = (int) ((color >> 16) & 0xFF); //  verde
        int azul = (int) ((color >> 8) & 0xFF); //  azul
        int alfa = (int) (color & 0xFF); //  alfa
        
        System.out.println("Valor rojo: " + rojo);
        System.out.println("Valor verde: " + verde);
        System.out.println("Valor azul: " + azul);
        System.out.println("Valor alfa: " + alfa);
    }
	
    
}
