package sobrecargaconstructores_v1;
import java.util.Scanner;
public class EstudianteInscrito {
    public static void main(String[] args){
     String nombre, carrera,inscrito;
     long numCuenta=0;
     int cuatrimestre=0; 
       
     Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el Nombre del estudiante y Carrera");
              
        nombre = sc.next();
        carrera = sc.next();
       
        System.out.println("Introduce tu numero de cuenta y cuatrimestre");
        try{
            numCuenta = sc.nextLong();
            cuatrimestre = sc.nextInt();
        }
        
        catch(Exception e){
            System.out.println("Introduce numero de cuenta y cuatrimestre de forma numerica");
        }
        
        System.out.println("¿Se encuentra inscrito?");
        inscrito = sc.next();
        
        Inscrito EstudianteInscrito = new Inscrito(nombre, numCuenta,carrera,  cuatrimestre);
        EstudianteInscrito.setInscrito(inscrito);
        System.out.println(EstudianteInscrito.imprimeDatos());
    
    
    
      }
}
