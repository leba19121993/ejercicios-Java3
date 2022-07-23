package entregable8_herencia2;
public class Gato extends Felino {
    private String nombre;
    private String especie = "Felino";
    protected void setNombre(String nombre){
        this.nombre = nombre;
    }
    protected String getNombre(){
        return this.nombre;
    }
    protected String getEspecie(){
        return this.especie;
    }
    protected String domesticado(boolean dueño){
        if(dueño)
            return "El gato "+nombre+" está domesticado";
        else
            return "El gato "+nombre+" NO está domesticado";
    }
}
