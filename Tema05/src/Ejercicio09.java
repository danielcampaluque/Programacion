
import java.util.Scanner;
public class Ejercicio09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x,r;
		int cont = 1;
		System.out.println("Introduce un numero: ");
		x = s.nextInt();
		r = x;
		
		while(r>10) {
			r /= 10;
			cont++;
		}
		
		System.out.println("El numero "+x+" tiene: "+cont+" digitos.");
		s.close();
	}

}
