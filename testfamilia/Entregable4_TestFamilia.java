package testfamilia;

/**
 *
 * @author abell
 */
public class Entregable4_TestFamilia {
    public static void main(String args[]){
        Humano Roberto = new Humano ("Roberto", "quebrado","negros");
        System.out.println("Padre" + Roberto.perfil());
        Humano Cristina = new Humano ("Cristina", "ondulado", "cafe");
        System.out.println("Madre" + Cristina.perfil());
        Humano Abel = Cristina.engendrar(Roberto, "Abel");
        System.out.println("Hijo de Roberto y Cristina" + Abel.perfil());
        Humano Brenda = Roberto.engendrar(Cristina,"Brenda");
        System.out.println("Hija de Roberto y Cristina" + Brenda.perfil());
    }
}
