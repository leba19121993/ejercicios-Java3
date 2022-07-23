package entregable8_herencia2;
public class Ave extends Animal{
    
    private boolean presa2=false;
    private boolean comida2=false, dezplazamiento2=true;
    protected String volar(double altura){
        if(altura > 0){
            dezplazarse(true);
            return "El ave tiene la capacidad de volar";
            
        }
        else{
            return "El ave no tiene la capacidad de volar";
        }
    }
    protected String cazar2(boolean presa){
        this.presa2 = presa2;
        if(presa){
            comer(true);
            return "El ave cazó a su presa y se alimentó";
        }
        else{
            comer(false);
            return "El ave NO cazó a su presa y NO se alimento";
        }
    }
    protected String vivir2(Ave ave){
            if (ave.comida2)
                if (ave.dezplazamiento2)
                return "Esta ave SI come y SI caza por lo tanto está vivo";
            else
               return "Esta ave SI come pero NO caza por lo tanto está vivo pero vulnerable";
            else
                if(ave.dezplazamiento2)
                    return "Esta ave NO come pero si caza por lo tanto esta vivo pero debilitado";
                else 
                    return "Esta ave NO come y NO caza por lo tanto no está vivo";
        }
    
}
