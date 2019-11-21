
import java.util.Scanner;
public class Ejercicio06 {
	public static void main(String[] args) {
		int h;
		double g=9.81;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca la altura: ");
		h = s.nextInt();
		
		double seg= Math.sqrt(2*h/g);
		
		System.out.printf("El objeto tardará %.2f segundos en caer",seg);
		s.close();
	}
	
}
