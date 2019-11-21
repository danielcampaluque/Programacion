
import java.util.Scanner;
public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int h,m;
		
		System.out.println("Introduzca la hora: ");
		h = s.nextInt();
		
		System.out.println("Introduzca los minutos: ");
		m = s.nextInt();
		
		int seg = h*3600 + m*60;
		
		System.out.println("Quedan "+(86400 - seg)+" segundos para la medianoche");
		s.close();
	}

}
