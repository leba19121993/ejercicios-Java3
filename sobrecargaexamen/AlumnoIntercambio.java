package sobrecargaexamen;

import java.util.Calendar;

public class AlumnoIntercambio extends Alumno{
private int mes;
Calendar fecha = Calendar.getInstance();
int mesHoy = fecha.get(Calendar.MONTH)+1;
int añoHoy = fecha.get(Calendar.YEAR);
private String pais;


protected AlumnoIntercambio(String nombre, String numCuenta, String carrera, int cuatrimestre){
    super(nombre,numCuenta,carrera,cuatrimestre);
}
protected AlumnoIntercambio(String nombre, String numCuenta, String carrera){
    super(nombre, numCuenta,carrera);
}
protected AlumnoIntercambio(String nombre, int cuenta){
       super(nombre, cuenta);
 }

 protected String fechaInscripcion(String mesString, int año){
      switch(mesString){
            case "enero":
            case "Enero": mes = 1;
                          break;
            case "febrero":
            case "Febrero": mes = 2;
                          break;              
            case "marzo":
            case "Marzo": mes = 3;
                          break;
            case "abril":
            case "Abril": mes = 4;
                          break;
            case "mayo":
            case "Mayo": mes = 5;
                          break;
            case "junio":
            case "Junio": mes = 6;
                          break;
            case "julio":
            case "Julio": mes = 7;
                          break;
            case "agosto":
            case "Agosto": mes = 8;
                          break;
            case "septiembre":
            case "Septiembre": mes = 9;
                          break;
            case "octubre":
            case "Octubre": mes = 10;
                          break;
            case "noviembre":
            case "Noviembre": mes = 11;
                          break;
            case "diciembre":
            case "Diciembre": mes = 12;
                          break;           
            default: return "Mes incorrecto";
  }
      return fechaInscripcion(mesString,año);
 }

    
protected void setPais(String pais){
        this.pais = pais;
 }
 protected String imprimeDatos(){
        return super.imprimeDatos()+",Pais: "+pais;
 }
 
 protected String fechaInscripcion(int mesString, int año){
     return +mes+" /"+año;
 }
 
 
}
