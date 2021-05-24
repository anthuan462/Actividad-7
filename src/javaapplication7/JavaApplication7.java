
package javaapplication7;
import java.util.Scanner;
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);   
    //numeros primos
    
    int limite;
    
    System.out.println("Ingresa un numero");
    limite = leer.nextInt();
    
    System.out.println("Numeros Primos :");
    for(int i=1;i<limite;i++){
        int count=0;
    for(int j=1;j<=i;j++){
           
         if(i%j==0)
             count++;
        }
        if(count==2)
            System.out.println(i);
    }
        
    
    }
     
    
    
 }
