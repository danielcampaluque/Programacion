
public class Ejercicio10 {
	public static void main(String[] args) {
		int numero[] = new int[20];
		int aux[] = new int[20];
		int contador = 0;
		
		for(int i = 0; i < 20; i++) {
			numero[i] = (int)(Math.random()*101);
			if(numero[i]%2 == 0) {
				aux[contador] = numero[i];
				contador++;
			}
			System.out.print(numero[i]+" | ");
		}
		
		System.out.println();
		System.out.println("-------------------------------------------------------------------");
		
		for(int i= 0; i < 20; i++) {
			if(numero[i]%2 != 0) {
				aux[contador] = numero[i];
				contador++;
			}
			System.out.print(aux[i]+" | ");
		}
	}

}
