
 
import java.util.Scanner;
public class Ejercicio23 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int contador=0;
		int sumatotal=0;
		int n;
		
		System.out.println("Introduzca numeros hasta llegar a 10000: ");
		do {
			n = s.nextInt();
			sumatotal += n;
			contador++;
			
			if(sumatotal > 10000) {
				System.out.println("Total de numeros introducidos: "+contador);
				System.out.println("Media de numeros: "+(sumatotal/contador));
				System.out.println("Total acumulado:"+sumatotal);
			}
		}while(sumatotal < 10000);
		s.close();
	}

}
