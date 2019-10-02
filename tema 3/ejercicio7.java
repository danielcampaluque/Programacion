public class ejercicio7{
    public static void main(String[] args) {
      
      System.out.println("introduzca la base imponible de la factura");
      
      double base=Double.parseDouble(System.console().readLine());
      
      System.out.println("base imponible: "+base);
      System.out.println("iva : "+base*0.21);
      System.out.println("total:"+base*1.21);
      
      
      
      
      
      
    }
  }

