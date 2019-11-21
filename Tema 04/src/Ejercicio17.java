

import java.util.Scanner;
public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x;
		
		System.out.println("Programa que calcula la ultima cifra:");
		System.out.println("Introduzca un numero: ");
		x = s.nextInt();
		
		System.out.println(x%10);	//Resto de 10 para calcular ultima cifra
									//añadir mas ceros para calcular penultima cifra, etc
		s.close();
	}
	
}
