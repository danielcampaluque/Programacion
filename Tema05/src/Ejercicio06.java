
import java.util.Scanner;
public class Ejercicio06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 320;
		
		do {
			System.out.print(i+", ");
			i-=20;
		}while(i >= 160);
		s.close();
	}

	
}