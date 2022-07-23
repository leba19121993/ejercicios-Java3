package sobrecargacontructores;

public class Empleado {
    private String nombre;
    private long numEmpleado;
    private double salario =0.0;
    private int id =0;
    
    protected Empleado(String nombre, long numEmpleado, double salario){
        this.nombre = nombre;
        this.numEmpleado =numEmpleado;
        this.salario = salario;
        id =1;
    }
    protected Empleado(String nombre, long numEmpleado){
        this.nombre = nombre;
        this.numEmpleado =numEmpleado;
        id =2;
    }
    protected Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
        id =3;        
    }
    protected Empleado(long numEmpleado, double salario){
        this.numEmpleado =numEmpleado;
        this.salario = salario;
        id =4;
    }
    protected Empleado(String nombre){
        this.nombre = nombre;
        id =5;       
    }
    protected Empleado(long numEmpleado){
        this.numEmpleado =numEmpleado;
        id =6;
    }
    protected String imprimirDatos(){
        switch(id){
            case 1: return "Nombre Empleado: "+nombre+", Numero Empleado: "+numEmpleado+", Sueldo Empleado: "+salario;
            case 2: return "Nombre Empleado: "+nombre+", Numero Empleado: "+numEmpleado;
            case 3: return "Nombre Empleado: "+nombre+", Sueldo Empleado: "+salario;
            case 4: return "Numero Empleado: "+numEmpleado+", Sueldo Empleado: "+salario;
            case 5: return "Nombre Empleado: "+nombre;
            case 6: return "Numero Empleado: "+numEmpleado;
            default: return "Empleado no encontrado";
     }
    }
    
    
}
