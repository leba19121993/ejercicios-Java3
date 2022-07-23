package sobrecargaconstructores_v1;

public class Inscrito extends Estudiante_V1{
    private String inscrito;
    
    protected Inscrito(String nombre, long numCuenta,String carrera, int cuatrimestre){
        super(nombre, numCuenta, carrera, cuatrimestre);
    }
    protected void setInscrito(String inscrito){
        this.inscrito = inscrito;
    }
    protected String imprimeDatos(){
        return super.imprimeDatos()+", Estudiante Inscrito. "+inscrito;
    }
    
}
