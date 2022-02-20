package expresiones.logicas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpresionesLogicas {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
    
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      BufferedReader nombre1= new BufferedReader(new InputStreamReader(System.in)); 
      Scanner s=new Scanner(System.in);     
      boolean salir= false;
      int opcion, semestre;
      double a, b, c, d, x, w, y, r1, r2, r3, n;
      String grupo;
      do{
          System.out.println("\n Expresiones logicas");
          
          System.out.println("\n1. batos a, b, c y d son iguales?");
          System.out.println("2. x< y< w");
          System.out.println("3. El semestre esta entre 1 y 9");
          System.out.println("4. Los dstos r1, r2 y r3 son diferentes?");
          System.out.println("5. El grupo es A o B?");
          System.out.println("6. El numero es par o es mayor que 3?");
          System.out.println("7. El numero impar o es mayor o igual que 12?");
          System.out.println("8. El nombre es Pepe o Luis o Mario?");
          System.out.println("9. No es cierto que x es menor que 7");
          System.out.println("10. La variable y no es mayor o igual que 3.2");
          System.out.println("11. Salir");
          
      try {
      System.out.println("\nElige una opcion");
      opcion=s.nextInt(); 
      switch(opcion){
       case 1:
           System.out.println("Has seleccionado la opcion 1: batos a, b, c y d son iguales");
           System.out.println("Introduzca los valores.");
                 System.out.print("a = "); 
                 a=s.nextInt();
                 System.out.print("b = ");
                 b=s.nextInt();
                   System.out.print("d= ");
                 d=s.nextInt();
                 System.out.print("c = ");
                 c=s.nextInt();
            if(a==b & b==c & c==d){
                 System.out.println("Los valores son iguales"); 
            }
            else{
               System.out.println("Los valiores son diferentes");   
            }
             break;  
       case 2:
           System.out.println("Has seleccionado la opcion 2:  x< y< w");
           System.out.println("Introduzca los valores.");
                 System.out.print("x = "); 
                 x=s.nextInt();
                 System.out.print("w = ");
                 w=s.nextInt();
                  System.out.print("y = ");
                 y=s.nextInt();
                 
              if( x<y & y<w){
                  System.out.println("x es mayor que y al igual que y es mayor que w");
              }
              if( x>y & y>w){
                  System.out.println("x es menor que y al igual que y es menor que w");
              }
            else{
                  System.out.println("Los valores son iguales:");
              }
             break;             
        case 3:
           System.out.println("Has seleccionado la opcion 3: El semestre esta entre 1 y 9");
           System.out.println("Introduzca el numero de semestre.");
                 System.out.print("Numero del semestre = "); 
                 semestre=s.nextInt();           
           if(semestre<=9 & semestre>=1 ){
               System.out.println("El semestre esta entre 1 y 9:"+  semestre);
           }
            else{
               System.out.println("El semesttre esta:");
           }
           break;
        
        case 4:
           System.out.println("Has seleccionado la opcion 4:  Los datos r1, r2 y r3 son diferentes?");
           System.out.println("Introduzca los valores.");
                 System.out.print("r1 = "); 
                 r1=s.nextInt();
                 System.out.print("r2 = ");
                 r2=s.nextInt();
                 System.out.print("r3 = ");
                 r3=s.nextInt();
          if(r1==r2 & r1==r3 ){
                 System.out.println("Los valores no son diferentes son iguales:"); 
            }
            else{
               System.out.println("Los valores son diferente");   
            }
             break;  
           
        case 5:
           System.out.println("Has seleccionado la opcion 5:  El grupo es A o B");
           System.out.println("Introduzca el grupo seleccionado");
             grupo = br.readLine();
                if(grupo.equals("A")){
                 System.out.println("El valor es A"); 
          } else{
            System.out.println("El valor es B"); 
          }  
             break;                                                                                                                                                                                                                                                                                                                                
           
        case 6:
           System.out.println("Has seleccionado la opcion 6: El numero es par o es mayor que 3");         
           System.out.println("Introduzca el numero");
                  System.out.print("n = ");
                  n=s.nextInt();
         if (n%2==0){
     System.out.println("El numero es par"); 
            }
     if (n<3){
     System.out.println("El numero es menor que 3"); 
            }
            else{
            }
           break;
       
        case 7:
           System.out.println("Has seleccionado la opcion 7: El numero impar o es mayor o igual que 12");
                 System.out.println("Introduzca el numero.");
                 System.out.print("n = "); 
                 n=s.nextInt();
    if (n%2!=0){
     System.out.println("El numero es impar"); 
            }
     if (n>=12){
     System.out.println("El numero es mayor o igual que 12"); 
            }
            else{
            }       
           break;
        case 8:
           System.out.println("Has seleccionado la opcion 8: El nombre es Pepe o Luis o Mario");
           System.out.println("Escriba su nombre");
            String nombre = nombre1.readLine(); 
            if(nombre.equals("Pepe") || nombre.equals("Luis") || nombre.equals("Mario") ){
               System.out.println("El nombre: "+nombre); 
         }
          else
          
           {
            System.out.println("No es ninguno de los nombres ");    
           }
     
           break;
         case 9:
           System.out.println(" No es cierto que x es menor que 7");
           System.out.println("Introduzca el valor de x");
                 System.out.print("x = "); 
                 x=s.nextInt();
            if(x>7){
                 System.out.println("x es mayor de 7"); 
            }
            else{
               System.out.println("x es menor de 7 ");   
            }
             break;
          case 10:
           System.out.println("La variable y no es mayor o igual que 3.2");
           System.out.println("Introduzca el valor de la variable");
                 System.out.print("x = "); 
                 y=s.nextInt();
            if(y<=3.2){
                 System.out.println("y es menor o igual a 3.2"); 
            }
            else{
               System.out.println("y es mayor de 3.2");   
            }
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


  
