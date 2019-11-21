
public class Ejercicio10 {
	public static void main(String[] args) {
		int columna;
		String caracter = "";
		int x;
		
		for(int fila = 1; fila <= 10; fila++) {
			columna = (int)(Math.random()*40+1);
			
			for(int i = 0 ; i < columna; i++) {
				x = (int)(Math.random()*6+1);
				
				switch(x) {
				case 1:
					caracter = "*";
					break;
				case 2:
					caracter = "-";
					break;
				case 3:
					caracter = "=";
					break;
				case 4:
					caracter = ".";
					break;
				case 5:
					caracter = "|";
					break;
				case 6:
					caracter = "@";
					break;
					default:
						;
				}
				System.out.print(caracter);
			}
			System.out.println();
	}
	}
}
