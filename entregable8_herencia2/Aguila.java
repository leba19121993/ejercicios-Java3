package entregable8_herencia2;

public class Aguila extends Ave{
    private String especie2 = "Ave";
    
    protected String getEspecie2(){
        return this.especie2;
    }
    protected String enCautiverio(boolean domesticada){
        if(domesticada)
            return "El Aguila está en cautiverio";
        else
            return "El aguila es libre";
    }
    
}
