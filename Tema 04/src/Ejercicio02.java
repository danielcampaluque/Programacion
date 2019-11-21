
import java.util.Scanner;
public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Introduce la hora: ");
		hora = s.nextInt();
		
		if(hora >= 6 && hora <= 12) {
			System.out.println("Buenos dias.");
		}else if(hora >= 13 && hora <= 20) {
			System.out.println("Buenas tardes.");
		}else if(hora >= 21 && hora <= 24) {
			System.out.println("Buenas noches.");
		}else if(hora >= 0 && hora <= 5) {
			System.out.println("Buenas noches.");
		}else {
			System.out.println("La hora introducida no es correcta.");
	}
		s.close();
	}

}
