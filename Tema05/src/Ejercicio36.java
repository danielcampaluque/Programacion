
import java.util.Scanner;
public class Ejercicio36 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero positivo: ");
		long numero = s.nextLong();
		
		long n = numero;
		long volteado = 0;
		boolean capicua = false;
		
		//voltear numero
		while(n > 0) {
			volteado = (volteado * 10)+(n % 10);
			n /= 10;
		}
		//Comprobamos numeros		
		if(volteado == numero) {
			capicua = true;
		}
		
		if(capicua) {
		System.out.println("El "+numero+" es capicua");
		}else {
			System.out.println("El "+numero+" no es capicua");
		}
		s.close();
	}

}
