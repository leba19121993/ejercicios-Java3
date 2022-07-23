package accesoLocal;
public class AccesoClases {
    public static void main(String[]args){
        
        
        
        
        ClaseInsegura personaSinSeguridad = new ClaseInsegura();
        ClaseSegura personaSegura = new ClaseSegura();
             
              
        
        personaSinSeguridad.edad=50;
        personaSinSeguridad.psw=2222;
        personaSinSeguridad.nombre="Anonymous";
        
        
        
        
        System.out.println("Se tuvo acceso a las variables del objeto Persona 1 y:");
        System.out.println("Se modificó el Nombre a: "+personaSinSeguridad.nombre);
        System.out.println("Se modificó la edad a: "+personaSinSeguridad.edad);
        System.out.println("Se modificó el PSW a: "+personaSinSeguridad.psw);
        
        
        
        
        
        
        personaSinSeguridad.setEdad(30);
        personaSinSeguridad.setPsw(1912);
        personaSinSeguridad.setNombre("Tom");
        System.out.println("\nSe tuvo acceso a los getters y setters del objeto Persona 1 y:");
        System.out.println("Se modificó el Nombre a: "+personaSinSeguridad.getNombre());
        System.out.println("Se modificó la edad: "+personaSinSeguridad.getEdad());
        System.out.println("Se modificó el PSW a: "+personaSinSeguridad.getpsw());
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\nSe tuvo acceso de forma segura a Persona 2 mediante un password y: ");
        System.out.println(""+personaSegura.modificaValores(0,"Ignacio",28,4444));
        
    }
}
