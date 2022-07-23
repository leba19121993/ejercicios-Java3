package sobrecargaexamen;

import java.util.Scanner;


public class DatosAlumno{
    public static void main(String[] args){
      int cuatrimestre = 0, mesinscripcion=0, añoInscripcion=0;
      String nombre , numCuenta, carrera, mesInscripcionString, pai­s;
      Scanner sc = new Scanner(System.in);
      
    System.out.println("Introduce tu nombre, numero de cuenta, carrera, mes de inscripcion y tu pais: ");
    nombre = sc.next();
    numCuenta = sc.next();
    carrera = sc.next();
    mesInscripcionString = sc.next();
    pai­s = sc.next();
    
    System.out.println("Introduce tu cuatrimestre, mes de inscripcion y año de inscipcion: ");
    try{
    cuatrimestre = sc.nextInt();
    mesinscripcion = sc.nextInt();
    añoInscripcion = sc.nextInt();
    }
    
    catch(Exception e){
        System.out.println("Introduce los datos de forma numerica no en texto");
        }
    
    AlumnoIntercambio abel = new AlumnoIntercambio(nombre, numCuenta, carrera, cuatrimestre);
    abel.setPais(pai­s);
    abel.fechaInscripcion(cuatrimestre, añoInscripcion);
    abel.fechaInscripcion(carrera, añoInscripcion);
    abel.fechaInscripcion(mesinscripcion, añoInscripcion);
    abel.fechaInscripcion(mesInscripcionString,añoInscripcion);
    System.out.println(abel.imprimeDatos()+abel.fechaInscripcion(cuatrimestre, añoInscripcion));
    
    
  }  
}

   