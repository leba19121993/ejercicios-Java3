package sobrecargacontructores;

public class VerificaEmpleado{
    public static void main(String[]args){
        Empleado Alberto = new Empleado("Alberto",741852l,3500);
        Empleado Horacio = new Empleado("Horacio",963258l);
        Empleado Juan = new Empleado("Juan",4500.0);
        Empleado Pamela = new Empleado(852145l,8500);
        Empleado Laura = new Empleado("Laura");
        Empleado Elton = new Empleado(741852l);

        System.out.println(Alberto.imprimirDatos());
        System.out.println(Horacio.imprimirDatos());
        System.out.println(Juan.imprimirDatos());
        System.out.println(Pamela.imprimirDatos());
        System.out.println(Laura.imprimirDatos());
        System.out.println(Elton.imprimirDatos());
    }
    
}
