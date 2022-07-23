package entregable7_herencia;
public class Serpiente extends Reptil {
    private String especie = "Reptil";
    protected String getEspecie(){
        return this.especie;
    }
    protected String enCautiverio(boolean dueño){
        if(dueño)
            return "La serpeinte está en cautiverio";
        else
            return "La serpiente NO esta en cautiverio";
    }
}
