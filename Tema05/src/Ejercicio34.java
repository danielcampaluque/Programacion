
 
import java.util.Scanner;
public class Ejercicio34 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		long n1 = s.nextLong();
		
		System.out.println("Introduzca otro numero: ");
		long n2 = s.nextLong();
		
		long x1 = n1;
		long x2 = n2;
		long volteado1 = 0;
		long volteado2 = 0;
		long pares = 0;
		long impares = 0;
		int longitud = 0;
		int digito1;
		int digito2;
		
		//voltear numero 1
		while(x1 > 0) {
			volteado1 = (volteado1 * 10)+(x1 % 10);
			x1 /= 10;
			longitud++;
		}
		
		//voltear numero 2
		while(x2 > 0) {
			volteado2 = (volteado2 * 10)+(x2 % 10);
			x2 /= 10;
		}
		
		//Comparar digitos
		while(longitud > 0) {
			//Primer numero
			digito1 = (int)(volteado1%10);
			if(digito1%2 == 0) {
				pares = pares*10 + digito1;
			}else {
				impares = impares*10 + digito1;
			}
			//Segundo numero
			digito2 = (int)(volteado2%10);
			if(digito2%2 != 0) {
				impares = impares*10 + digito2;
			}else {
				pares = pares*10 + digito2;
			}
			volteado1 = volteado1/10;
			volteado2 = volteado2/10;
			longitud--;
		}
		
		System.out.println("El numero formado por los digitos pares es : "+pares);
		System.out.println("El numero formado por los digitos impares es: : "+impares);
		s.close();
	}

}
