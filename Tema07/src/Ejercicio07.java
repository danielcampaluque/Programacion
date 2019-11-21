
import java.util.Scanner;
public class Ejercicio07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int numero[] = new int[100];
		int x;
		int y;
		int linea = 0;
		
		for(int i = 0; i < 100; i++) {
			numero[i] = (int)(Math.random()*21);
			System.out.print(numero[i]+" ");
			if(linea == 15) {
				System.out.println();
				linea = 0;
			}
			linea++;
		}
		
		System.out.println();
		System.out.println("Introduce dos valores de los mostrados para cambiarlos.");
		x = s.nextInt();
		y = s.nextInt();
		
		System.out.println("---------------------------------------");
		System.out.println("Valores intercambiados:");
		linea = 0;
		
		for(int i = 0; i < 100; i++) {
			if(numero[i] == x) {
				System.out.print("**"+y+"** ");
			}else if(numero[i] == y) {
				System.out.print("**"+x+"** ");
			}else {
				System.out.print(numero[i]+" ");
			}
			if(linea == 15) {
				System.out.println();
				linea = 0;
			}
			linea++;
		}
		s.close();
	}

}
