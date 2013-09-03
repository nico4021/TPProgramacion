/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user2
 */
    
import java.util.Calendar;
import java.util.Date;

public class ObtenerFechaHora {
    public String dameFechaHora() {
        Date fecha1 = new Date ();
        Calendar cal1 = Calendar.getInstance();
        String apasar = (cal1.get(Calendar.DATE)+"/"+cal1.get(Calendar.MONTH)+"/"+cal1.get(Calendar.YEAR));
        return apasar;
       }
      }