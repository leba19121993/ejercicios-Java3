
package entregable8_herencia2;
public class Reptil extends Animal{
    private boolean presa=false;
    
    protected String trepar (double altura){
        if(altura>0)
            return "El reptil es capaz de trepar "+altura+" cm";
        else
            return "El reptil no es capaz de trepar";
    }
    protected String avanzar(double velocidad){
        if (velocidad>0){
            dezplazarse(true);
            return "El reptil es capaz de moverse a una velocidad de "+velocidad+" km/h";
        }
        else
            return "El reptil no es capaz de moverse";
    }
    protected String cazar(boolean presa){
        this.presa=presa;
        if(this.presa){
            comer(true);
            return "El reptil cazó a su presa y se alimento";
        }
        else{
            comer(false);
            return "El reptil NO pudo cazar a su presa y NO se alimento";
        }
    }
    
}
