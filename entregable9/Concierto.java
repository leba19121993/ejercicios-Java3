package entregable9;
import java.util.Calendar;

public class Concierto {
    Calendar fecha = Calendar.getInstance();
    int diaHoy = fecha.get(Calendar.DATE);
    int mesHoy = fecha.get(Calendar.MONTH)+1;
    int añoHoy = fecha.get(Calendar.YEAR);
    String nombreConcierto;
    private int mes;
    protected String fechaConcierto(int dia, String mesString, int año, String nombreConcierto ){
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
        return fechaConcierto(dia,mes, año, nombreConcierto);
        }
    
    protected String fechaConcierto(int dia, int mes, int año, String nombreConcierto){
        if(año > añoHoy){
            return ""+nombreConcierto+" / "+dia+"-"+mes+"-"+año;    
        }
        else{
            if (año == añoHoy)
                if (mes >= mesHoy)
                if (dia >= diaHoy)    
                    return ""+nombreConcierto+" / "+dia+"-"+mes+"-"+año;
        }
        return "Error, Concierto realizado";    
    }
}
