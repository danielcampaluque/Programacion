
import java.util.Scanner;
public class Ejercicio04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int horas;
		int aux;
		
		System.out.println("Introduzca las horas trabajadas esta semana: ");
		horas = s.nextInt();
		
		if (horas <= 40) {
			System.out.println("Esta semana ha ganado: "+horas*12+"€");
		
		}else if(horas > 40) {
			aux = horas - 40;
			System.out.println("Esta semana ha ganado: "+(aux*16 + 40*12)+"€");
		}
		s.close();
	}

}
