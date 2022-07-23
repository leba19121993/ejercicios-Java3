package accesoLocal;
public class ClaseSegura {
    private String nombre="No se ha ingresado nombre";
    private int edad;
    private int psw;
    
    
    
    private void setNombre(String nombre){
        this.nombre = nombre;
    }
     public String getNombre(){
         return this.nombre;
     }
     private void setEdad(int edad){
         this.edad = edad;
     }
     public int getEdad(){
         return this.edad;
     }
     private void setPsw(int psw){
         this.psw = psw;
     }
     private int getPsw(){
         return this.psw;
     }
     protected String modificaValores (int psw, String nombre, int edad, int pswNuevo){
         if (psw == getPsw()){
             setPsw(pswNuevo);
             setNombre(nombre);
             setEdad(edad);
             return "Se modificó el Nombre a: "+getNombre()
                     +"\nSe modificó la edad a: "+getEdad()
                     +"\nSe modifico el PSW: "+getPsw();
         }
         else {
             return "No se realizaron los cambios, password incorrecto";
         }
     }
    
}
