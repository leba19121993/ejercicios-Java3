package entregable8_herencia2;
public abstract class Felino extends Animal {
    private boolean presa=false;
    protected String saltar(double altura){
        if(altura>30)
            return "El Felino escapaz de saltar "+altura+" cm";
        else
            return "El Felino no es capaz de saltar mas de 30 cm";
    }
    protected String correr(double velocidad){
        if(velocidad>0){
            dezplazarse(true);
            if(velocidad>25)
                return "El Felino es capaz de correr a una velocidad de "+velocidad+" km/h";
            else
                return "El Felino no es capaz de correr a una velocidad mayor de 25km/h";
        }
        else
            return "el Felino no es capaz de moverse";
    }
    protected String cazar(boolean presa){
        this.presa=presa;
        if(this.presa){
            comer(true);
            return "El Felino cazó a su presa y se alimento";
            
        }
        else{
            comer(false);
            return "El felino NO pudo cazar a su presa y NO se alimento";
        }
    }
}
