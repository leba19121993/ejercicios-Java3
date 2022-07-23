package sobrecargaconstructores_v1;

public class Estudiante_V1 {
    private String nombre, carrera;
    private long numCuenta;
    private int cuatrimestre;
    
    protected Estudiante_V1(String nombre, long numCuenta,String carrera, int cuatrimestre){
    this.nombre = nombre;
    this.numCuenta =numCuenta;
    this.carrera = carrera;
    this.cuatrimestre = cuatrimestre;
    }
    protected String imprimeDatos(){
       return "Nombre del estudiante: "+nombre+", Numero de cuenta: "+numCuenta+", Carrera: "+carrera+", Cuatrimestre: "+cuatrimestre;
             
    }
    
}
