public class ejercicio12{
    public static void main(String[] args) {
    
    System.out.println("introduzca la nota del primer examen");
    double ex1=Double.parseDouble(System.console().readLine());
    
    System.out.println("que nota desea sacar al final del trimestre");
    double nota=Double.parseDouble(System.console().readLine());
    
    double nota2=((nota*100)-(ex1*40))/60;
    
    System.out.println("necesita sacar "+nota2);
    
    
    
    }
  }
