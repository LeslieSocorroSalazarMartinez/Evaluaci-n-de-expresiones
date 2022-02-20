package expresiones.pkg1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Expresiones1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
      Scanner s=new Scanner(System.in);
      boolean salir= false;
      int opcion;
      double a , b , c , d , x , y, resultado, resultado1, resultado2;
      do{
System.out.println("\nInstrucciones: Desarrolle y resuelva el siguiente conjunto de expresiones");
          System.out.println("\n1. b*a-b^/4*c");
          System.out.println("2. (a*b)/3^2");
          System.out.println("3.(((b+c)/2*2*a+10)*3*b)-6");
          System.out.println("4. a^b^c");
          System.out.println("5. 3*x^4-5*x^3+x*12-17");
          System.out.println("6. (b+ d)/(c+4)");
          System.out.println("7. b^2-a*a*c");
          System.out.println("8. (x^2+y^2)^(1/2)");
          System.out.println("9. 7 * 10 – 50 mod 3 * 4 + 9");
          System.out.println("10 * (10 – 5) mod 3) * 4 + 9");
          System.out.println("11. Salir");  
      try {
      System.out.println("\nElige una opcion");
      opcion=s.nextInt();
      switch(opcion){
       case 1:
           System.out.println("Has seleccionado la opcion 1: b*a-b^/4*c");
           System.out.println("Introduzca los valores.");
                 System.out.print("a = "); 
                 a=s.nextInt();
                 System.out.print("b = ");
                 b=s.nextInt();
                 System.out.print("c = ");
                 c=s.nextInt();
            resultado = ((b * a) - (Math.pow(b, 2))) / (4 * c);
            System.out.println("El resultado es:"+ resultado); 
             break; 
       case 2:
           System.out.println("Has seleccionado la opcion 2: (a*b)/3^2");
           System.out.println("Introduzca los valores.");
                 System.out.print("a = "); 
                 a=s.nextInt();
                 System.out.print("b = ");
                 b=s.nextInt();
            resultado = ((a * b) / Math.pow(3, 2));
            System.out.println("El resultado es:"+ resultado); 
           break;  
        case 3:
           System.out.println("Has seleccionado la opcion 3:(((b+c)/2*2*a+10)*3*b)-6");
           System.out.println("Introduzca los valores.");
                 System.out.print("a = "); 
                 a=s.nextInt();
                 System.out.print("b = ");
                 b=s.nextInt();
                 System.out.print("c = ");
                 c=s.nextInt();
            resultado = ( (b + c) / ( ( 2 * ( 2 * a ) + 10 ) * ( 3 * b ) )  ) - 6;
            System.out.println("El resultado es:" +  resultado); 
           break;   
        case 4:
           System.out.println("Has seleccionado la opcion 4: a^b^c ");
           System.out.println("Introduzca los valores.");
                 System.out.print("a = "); 
                 a=s.nextInt();
                 System.out.print("b = ");
                 b=s.nextInt();
                 System.out.print("c = ");
                 c=s.nextInt();
            resultado1=Math.pow(a, b);
            resultado = Math.pow(resultado1, c);
            System.out.println("El resultado es:"+ resultado);     
             break;   
        case 5:
           System.out.println("Has seleccionado la opcion 5:  3*x^4-5*x^3+x*12-17");
           System.out.println("Introduzca los valores.");
                 System.out.print("x = "); 
                 x=s.nextInt();
            resultado =   3 * Math.pow(x, 4) - 5 * Math.pow(x, 3) + x * 12 - 17;
            System.out.println("El resultado es:"+ resultado);  
           break;
        case 6:
           System.out.println("Has seleccionado la opcion 6: (b+d)/(c+4)");         
           System.out.println("Introduzca los valores.");
                  System.out.print("b = "); 
                  b=s.nextInt();
                  System.out.print("d = ");
                  d=s.nextInt();
                  System.out.print("c = ");
                  c=s.nextInt();
            resultado = ( b +(d) ) / ( c + 4 );
            System.out.println("El resultado es:"+ resultado); 
           break; 
        case 7:
           System.out.println("Has seleccionado la opcion 7: b^2-a*a*c");
                 System.out.println("Introduzca los valores.");
                 System.out.print("a = "); 
                 a=s.nextInt();
                 System.out.print("b = ");
                 b=s.nextInt();
                 System.out.print("c = ");
                 c=s.nextInt(); 
            resultado = ( Math.pow(b, 2)) - (a * a * c);
            System.out.println("El resultado es:"+ resultado); 
           break;
        case 8:
           System.out.println("Has seleccionado la opcion 8: (x^2+y^2)^(1/2)");
           System.out.println("Introduzca los valores.");
                 System.out.print("x = "); 
                 x=s.nextInt();
                 System.out.print("y = ");
                 y=s.nextInt();    
            resultado1 = (Math.pow(x, 2) + Math.pow((y), 2));
            resultado=  Math.pow(resultado1,0.5);   
            System.out.println("El resultado es:"+  resultado); 
           break;
           case 9:
           System.out.println("Has seleccionado la opcion 9:  7 * 10 – 50 mod 3 * 4 + 9");
           resultado = 7 * 10 - 50; 
           resultado1= 3 * 4 + 9;
           resultado2 =resultado % resultado1;
           System.out.println("El resultado es:"+  resultado2); 
           break;
         case 10:
           System.out.println("Has seleccionad la opcion 10: 10. (7 * (10 – 5) mod 3) * 4 + 9");
           resultado= 7 * (10-5);
           resultado1 = resultado % 3;
           resultado2= resultado1 * 4 + 9;
            System.out.println("El resultado es:"+ resultado2); 
             break; 
        case 11:
            salir=true;
             break;
        default:
           System.out.println("Solo numeros entre en 1 y el 11");     
      }
      }catch(InputMismatchException e){
 System.out.println("Inserta un numero");
       s.next();
      }
      }
      while(!salir);
    } 
}
