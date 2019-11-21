
import java.util.Scanner;
public class Ejercicio06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int numero[] = new int[15];
		
		System.out.println("Programa que rota un array");
		
		for(int i = 0; i < 15; i++) {
			System.out.println("Introduce nº"+(i+1)+": ");
			numero[i] = s.nextInt();
		}
		System.out.println("----------------");
		System.out.println("Array rotado:");
		
		int aux= numero[14];
		
		for(int i = 14; i > 0; i--) {
			numero[i] = numero[i-1];
		}
		numero[0] = aux;
		
		for(int i = 0; i < 15; i++) {
			System.out.print(numero[i]+" ");
		}
		s.close();
		
	}

}
 