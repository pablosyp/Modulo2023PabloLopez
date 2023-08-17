
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Tiempo {
    Calendar fecha = new GregorianCalendar();
        String ano = Integer.toString(fecha.get(Calendar.YEAR));
        String mes = Integer.toString(fecha.get(Calendar.MONTH));
        String dia = Integer.toString(fecha.get(Calendar.DATE));
        
        String fechacompleta = ano+"/"+mes+"/"+dia;
        
        Calendar hora = new GregorianCalendar();
        String H = Integer.toString(hora.get(Calendar.HOUR_OF_DAY));
        String M = Integer.toString(hora.get(Calendar.MINUTE));
        String S = Integer.toString(hora.get(Calendar.SECOND));
        
        String horacompleta = H+":"+M+":"+S;
}
