
public class Ejercicio05 {
	public static void main(String[] args) {
		int x;
		int minimo = 199;
		int maximo = 100;
		int suma = 0;
		
		for(int i = 0; i < 50; i++) {
			x = (int)(Math.random()*100+100);
			suma += x;
			System.out.print(x+" ");
				if(x > maximo) {
					maximo = x;
				}else if(x < minimo) {
					minimo = x;
				}
		}
		System.out.println();
		System.out.println("El numero mas grande es: "+maximo);
		System.out.println("El numero mas pequeño es: "+minimo);
		System.out.println("La media de los numeros es: "+(suma/50));
	}

}
