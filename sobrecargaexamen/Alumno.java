package sobrecargaexamen;

public class Alumno {
 private String nombre, carrera, numCuenta, pais;
 private int cuatrimestre, mes, año, cuenta;
 private char id;

 protected Alumno(String nombre, String numCuenta, String carrera, int cuatrimestre){
 this.nombre = nombre;
 this.numCuenta = numCuenta;
 this.carrera = carrera;
 this.cuatrimestre = cuatrimestre;
 id = 'x';
 }
 protected Alumno(String nombre, String numCuenta, String carrera){
 this.nombre = nombre;
 this.numCuenta = numCuenta;
 this.carrera = carrera;
 id = 'y';
 }
 
 protected Alumno(String nombre, int cuenta){
     this.nombre = nombre;
     this.cuenta = cuenta;
     id = 'c';
 }
         
 protected String imprimeDatos(){
 switch(id){
 case 'x': return "Nombre: "+nombre+", Numero de cuenta: "+numCuenta+",Carrera :"
+carrera+",Cuatrimestre:"+cuatrimestre;
 case 'y': return "Nombre: "+nombre+", Numero de cuenta: "+numCuenta+", Carrera:"
+carrera;
 case 'c': return "Nombre: "+nombre+", Numero de cuenta: "+numCuenta;
 default: return "Perona no identificada";
 
 }
 }   
}
