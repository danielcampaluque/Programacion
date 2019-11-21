
import java.util.Scanner;
public class Ejercicio08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int temperatura[] = new int[12];
		
		System.out.println("Introduce la temperatura media de cada mes.");
		
		for(int i = 1; i <= 12; i++) {
			System.out.println("Mes nº"+i+": ");
			temperatura[i-1] = s.nextInt();
		}
		System.out.println("------------------------------");
		
		for(int i = 0; i < 12; i++) {
			for( int j = temperatura[i]; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}

}
