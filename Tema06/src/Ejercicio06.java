
import java.util.Scanner;
public class Ejercicio06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = (int)(Math.random()*100+1);
		int intentos = 5;
		int respuesta;
		
		System.out.println("Averigua el numero que estoy pensando, tienes 5 intentos.");
		
		do {
			System.out.println("Introduce un numero(Quedan "+intentos+" intentos): ");
			System.out.println(x);
			respuesta = s.nextInt();
			
			if(respuesta > x) {
				System.out.println("Intentalo de nuevo, el numero es menor que "+respuesta);
				intentos--;
			}else if(respuesta < x) {
				System.out.println("Intentalo de nuevo, el numero es mayor que "+respuesta);
				intentos--;
			}
			
		}while(respuesta != x && intentos > 0);
		
		if(respuesta == x) {
			System.out.println("Enhorabuena, has acertado el numero.");
		}else {
			System.out.println("Te has quedado sin intentos.");
		}
		s.close();
	}

}
