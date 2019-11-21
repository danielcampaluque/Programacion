
import java.util.Scanner;
public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a,b;
		int aux;
		
		System.out.println("Introduce dos numeros para ver sus numeros comprendidos.");
		System.out.println("Introduce el primer numero: ");
		a = s.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		b = s.nextInt();
		
		if(a > b) {
			aux = a;
			a = b;
			b = aux;	
		}
		
		for(int i = a; i < b; i += 7) {
			System.out.print(i+" ");
		}
		s.close();
	}

}
