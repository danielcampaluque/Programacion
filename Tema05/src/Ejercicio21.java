
import java.util.Scanner;
public class Ejercicio21 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		int medimp = 0;
		int maypar = 0;
		int contador = 0;
		int sumaimp = 0;
		
		System.out.println("Introduce numeros (negativo para terminar): ");
		
		do {
			n = s.nextInt();
			
			if(n >= 0) {
				contador++;
				if(n % 2 == 0) {
					
					if(n > maypar) {
						maypar = n;
					}
				}else if(n % 2 != 0){
					medimp++;
					sumaimp += n;
				}
			}
		}while(n >= 0);
		
		System.out.println("Total de numeros introducidos: "+contador);
		System.out.println("La media de los numeros impares es: "+(sumaimp/medimp));
		System.out.println("El mayor de los pares es: "+maypar);
		s.close();
	}
}
