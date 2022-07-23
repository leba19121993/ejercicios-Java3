
package testfamilia;

public class Humano {
    private String nombre;
    private String cabello;
    private String ojos;
    
protected Humano(String nombre, String cabello, String ojos){
    this.nombre = nombre;
    this.ojos = ojos;
    this.cabello = cabello;
}
public Humano(Humano ella, Humano el, String nombre){
    this.nombre = nombre;
    this.cabello = ella.cabello;
    this.ojos = el.ojos;
}

public String perfil(){
    return ": "+nombre+" Ojos: "+ojos+" Cabello: "+cabello;
}
public Humano engendrar(Humano conyuge, String nombreHijo){
    Humano nuevoSer = new Humano(this, conyuge, nombreHijo);
    return nuevoSer;
 }
    
}
