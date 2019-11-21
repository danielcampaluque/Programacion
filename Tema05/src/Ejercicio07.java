
import java.util.Scanner;
public class Ejercicio07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int pass = 1010;
		int i = 0;
		int intentos = 4;
		
		do {
			System.out.println("Introduzca la combinacion: ");
			i = s.nextInt();
			if(i == pass) {
				System.out.println("La caja se ha abierto satisfactoriamente.");
			}else {
				System.out.println("Lo siento. La combinacion no es correcta.");
				intentos --;
			}
		}while( i != pass && intentos > 0);
		
		s.close();
		
		
	}

}
