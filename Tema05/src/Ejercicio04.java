
import java.util.Scanner;
public class Ejercicio04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		for(int i = 360; i >= 160; i-=20) {
			System.out.print(i+", ");
		}
		s.close();
	}

}
