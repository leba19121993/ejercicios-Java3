package entregable7_herencia;
public class Animal {
    private boolean comida=false, dezplazamiento=false;
    protected String comer(boolean comida){
        this.comida = comida;
        if(comida)
            return "Este animal esta comiendo";
        else
            return "Este animal NO esta comiendo";
        
    }
    protected String dezplazarse (boolean dezplazamiento){
        this.dezplazamiento = dezplazamiento;
        if(dezplazamiento)
            return "Este animal se esta dezplazando";
        else
            return "Este animal NO se está desplazando";
        
    }
    protected String reproduciorse (String especie){
        switch (especie){
            case "Felino":
                 return "Mamifero";
            case "Reptil":
                return "Oviaparo";
            default:
                return "Especie desconocida";
        }
     }
        protected String vivir(Animal animal){
            if (animal.comida)
                if (animal.dezplazamiento)
                return "Este animal SI come y SI se dezplaza por lo tanto está vivo";
            else
               return "Este animal SI come y NO se dezplaza por lo tanto está vivo pero vulnerable";
            else
                if(animal.dezplazamiento)
                    return "Este animal NO come y si se desplaza por lo tanto esta vivo pero debilitado";
                else 
                    return "Este animal NO come y NO se dezplaza por lo tanto no está vivo";
        }
    }
