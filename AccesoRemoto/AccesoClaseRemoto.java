package AccesoRemoto;
import accesoLocal.ClaseInsegura;
import accesoLocal.ClaseSegura;
public class AccesoClaseRemoto {
    public static void main(String[]args){
        ClaseInsegura personaSinSeguridad = new ClaseInsegura();
        ClaseSegura personaSegura = new ClaseSegura();
        personaSinSeguridad.edad=35;
        personaSinSeguridad.psw=1010;
        personaSinSeguridad.nombre="Inocencio";
        System.out.println("Desde AccesoClaseRemoto ubicado en otro paquete se pudieron modificar las"
                           + "variables del objeto Persona ! y:");
        System.out.println("Se modificó el nombre a: "+personaSinSeguridad.nombre);
        System.out.println("Se modificó la edad a: "+personaSinSeguridad.edad);
        System.out.println("Se modificó el PSW a:"+personaSinSeguridad.psw);
        personaSinSeguridad.setEdad(18);
        personaSinSeguridad.setPsw(1912);
        personaSinSeguridad.setNombre("Prudencio");
        System.out.println("\nDesde AccesoRemoto ubicado en otro paquete se pudieron modificar los "
                           +"getters y setters del objeto Persona! y:");
        System.out.println("Se modifico el Nombre a:"+personaSinSeguridad.getNombre());
        System.out.println("Se modificó la edad a: "+personaSinSeguridad.getEdad());
        System.out.println("Se modificoó el PSW a: "+personaSinSeguridad.getpsw());
        
        System.out.println("\nSe tuvo acceso restringuido a Persona 2 y:");
        System.out.println("Se pudo vizualizar su nombre: "+personaSegura.getNombre());
        System.out.println("Se pudo visuzalizar su edad: "+personaSegura.getEdad());
    }
    
}
