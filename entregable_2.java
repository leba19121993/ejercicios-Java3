
package entregable2;
import java.util.Scanner;
public class entregable_2 {
    public static void main (String[] args){
        int x,y;
        Scanner lopez =  new Scanner (System.in);
        Scanner ortiz =  new Scanner (System.in);
        System.out.println("Ingresa 1 valor");
        x = lopez.nextInt();
        System.out.println("Ingresa otro valor");
        y = ortiz.nextInt();
        if (x > y){
        System.out.println("El numero: " + x + " es mayor que " + y + "");
        
    }
        else {
            System.out.println(" El numero: " + x + " es menor que " + y + " ");
        }  
    
    
}    
}
