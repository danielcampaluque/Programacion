
import java.util.Scanner;
public class Ejercicio03 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	int i = 0;
	
	do {
		System.out.print(i+", ");
		i+=5;
	} while(i <= 100);
	
	s.close();
}


}
