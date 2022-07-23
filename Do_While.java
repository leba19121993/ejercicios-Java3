package entregable3;
import java.util.Scanner;

public class Do_While {
    public static void main (String[] args){
        String opcion;
        String apellido;
        Scanner sc = new Scanner (System.in);
        do{
            System.out.println("Introduce un apellido");
            apellido = sc.next();
            System.out.println(apellido);
            System.out.println(" Si Deseas agregar otro apellido  presiona (@), si deseas salir presiona(0)");
            opcion = sc.next();
        }while ( opcion.equals("@") );            
        }
    }


