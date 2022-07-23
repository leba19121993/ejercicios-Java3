package entregable3;
import java.util.Scanner;
public class While {
    public static void main (String[] args) {
        int n = 0, repeat; 
        String apellido;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu apellido");
        apellido = sc.next();
        System.out.println("Introduce un numero");
        repeat = sc.nextInt();
        while ( n < repeat ) {
            System.out.println(apellido);
            n = n + 1;
        }
    }
}
