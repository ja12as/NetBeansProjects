/*Diseñar un algoritmo que determine el sueldo de un trabajador teniendo en cuenta las horas
extras trabajadas, sabiendo que cuando las horas de trabajo exceden de 40, el resto se
consideran horas extras y que éstas se pagan al doble de una hora normal.*/

package actividad;
import java.util.*;
 class Sueldo_trabajador_horas_extras {
    int horas_trabajada, pago_horas ,suma, total, horas_extras;
    Scanner lea;
    
    Sueldo_trabajador_horas_extras()
    {
        horas_trabajada=0;pago_horas=0;suma=0; total=0;
        lea = new Scanner(System.in);
    }   
    void horas_extras()
    {
        System.out.println("ingrese el precio por horas trabajadas");
        pago_horas= lea.nextInt();
        System.out.println("ingrese las horas trabajadas");
        horas_trabajada= lea.nextInt();
         suma = pago_horas*horas_trabajada;
         
        if(horas_trabajada>40   )
        {
           
            horas_extras= pago_horas*2;
            total = suma+ horas_extras;
            System.out.println("el pago de las horas normales+ horas extras  trabajadas es de:  " + total);
        }else
        {
           total= suma;
            System.out.println("el pago por su trabajo es de: " + total);
        }
    }
}
