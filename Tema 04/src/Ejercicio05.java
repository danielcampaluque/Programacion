
import java.util.Scanner;
public class Ejercicio05 {
	public static void main(String[] args) {
double a,b;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero para 'a' y 'b': ");
		a = s.nextDouble();
		b = s.nextDouble();
		
		if (a == 0) {
			System.out.println("____________________________________");
			System.out.println("El n�mero 'a' no puede ser 0");
		}
		if (b < 0) {
			System.out.println("____________________________________");
			System.out.println("El n�mero 'b' no puede ser negativo");
		} else {
			System.out.println("____________________________________");
			System.out.println("x = "+ (-b/a));
			
		}
		s.close();
	}

}
