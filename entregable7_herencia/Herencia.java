package entregable7_herencia;
public class Herencia {
    public static void main(String[] args) {
        Gato gato = new Gato();
        
        System.out.println("A la clase Gato se le puede asignar nombre, en este caso será Garfield");
        gato.setNombre("Garfield");
        
        System.out.println("Con la clase Gato se puede conseguir el nombre: "+gato.getNombre());
        System.out.println("Con la clase Gato se puede saber su especie: "+gato.getEspecie());
        System.out.println("A la clase Gato se le puede asignar un dueño para convertirse en gato domestico");
        System.out.println(gato.domesticado(false));
        System.out.println("Y se le puede quitar al dueño para convertirse en gato NO domestico");
        System.out.println(gato.domesticado(false));
        
        System.out.println("\nMediante la herencia de la clase felino el gato  Garfield tiene:");
        System.out.println("la capacidad de saltar" +gato.saltar(40));
        System.out.println("La capacidad de correr" +gato.correr(55));
        System.out.println("la capacidad de cazar" +gato.cazar(true));
        
        System.out.println("\nMediante la herencia de la clase Animal el gato Garfield tiene:");
        System.out.println("La capacidad de comer:" +gato.comer(false));
        System.out.println("La capacidad de desplazarse:" +gato.dezplazarse(false));
        System.out.println("La capacidad de saber como es su origen:" +gato.reproduciorse(gato.getEspecie()));
        System.out.println("La capacidad de saber si esta vivo:" +gato.vivir(gato));
        
        
        Serpiente serpiente = new Serpiente();
        
        System.out.println("\n\nCon la clase Serpiente se puede saber su especie: ");
        System.out.println("A la clase Serpiente se le  puede asignar un dueño para convertirse en cautiverio");
        System.out.println(serpiente.enCautiverio(false));
        System.out.println("Y se le puede quitar al dueño para convertirse en una serpiente libre");
        System.out.println(serpiente.enCautiverio(true));
        
        System.out.println("\nMediante la  herencia de la clase Reptil la serpiente tiene: ");
        System.out.println("la capacidad de trepar: "+serpiente.trepar(250));
        System.out.println("La capacidad de avanzar: "+serpiente.avanzar(6));
        System.out.println("La capacidad de cazar: "+serpiente.cazar(false));
        
        System.out.println("\nMediante la herencia de la clase Animal, la serpiente tiene:");
        System.out.println("La capacidad de comer:" +serpiente.comer(true));
        System.out.println("La capacidad de desplazarse:" +serpiente.dezplazarse(false));
        System.out.println("La capacidad de saber como es su origen:" +serpiente.reproduciorse(serpiente.getEspecie()));
        System.out.println("La capacidad de saber si esta vivo:" +serpiente.vivir(serpiente));
        
        
    }
    
}
