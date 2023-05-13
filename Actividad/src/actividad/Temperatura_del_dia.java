/*Dada la temperatura máxima del mes y la temperatura del día, actualice el valor de la máxima,
si la temperatura del día es mayor que dicho valor.*/

package actividad;
import java.util.*;
public class Temperatura_del_dia {
    double temperatura_dia, temperatura_mes, temperatura_mayor;
            Scanner lea;
    Temperatura_del_dia()
    {
        
          temperatura_dia   = 0; temperatura_mes =0;temperatura_mayor=0;
    }
    
    
    void temperatura()
    {
        System.out.println(" ingrese la temperatura del dia: ");
        temperatura_dia= lea.nextDouble();
        System.out.println(" ingrese la temperatura del mes: ");
        temperatura_mes= lea.nextDouble();
        
        if(temperatura_dia>temperatura_mes)
        {
            temperatura_mayor = temperatura_dia;
            System.out.println("la temperartura maxima del mes es de: " + temperatura_mayor);
        }else
        {
            temperatura_mayor=temperatura_mes;
            System.out.println("la temperatura maxima del mes es de: " + temperatura_mayor);
        }
    }
}
