
public class Ejercicio09 {
	public static void main(String[] args ) {
		int x;
		int contador = 0;
		
		do {
			x = (int)(Math.random()*50)*2;
			System.out.print(x+" ");
			contador++;
			
		}while(x != 24);
		
		System.out.println();
		System.out.println("Se han generado "+contador+" numeros.");
	}
}
