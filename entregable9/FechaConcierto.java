package entregable9;
import java.util.Scanner;

public class FechaConcierto {
    public static void main(String[] args){
        Concierto concierto = new Concierto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del concierto, el dia, mes(Texto) y año en que sucedio el concierto");
        String nombreConcierto = sc.next();
        int dia = sc.nextInt();
        String mesString = sc.next();
        int año = sc.nextInt();
        System.out.println("Introduce otro nombre de concierto, el dia, mes(numero) y año en que sucedio este concierto");
        String nombreConcierto2 = sc.next();
        int dia2 = sc.nextInt();
        int mes2 = sc.nextInt();
        int año2 = sc.nextInt();
        System.out.println(concierto.fechaConcierto(dia, mesString, año, nombreConcierto));
        System.out.println(concierto.fechaConcierto(dia2, mes2, año2, nombreConcierto2));
    }
    
}
