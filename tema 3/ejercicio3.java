public class ejercicio3{
    public static void main(String[] args) {
    
    
    System.out.println("ponga la cantidad de pesetas que desea pasar a euros");
    
    double peseta=Double.parseDouble(System.console().readLine());
    double euro=peseta/166.386;
    
    System.out.printf(" en euros son: %.2f\n",euro);
    
    
    }
  }
