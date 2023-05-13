/*Diseñe un algoritmo que pida dos números e imprima siempre la división del mayor entre
el menor.
*/
package actividad;
import java.util.*;
public class division_del_mayor_menor {
    int numero1, numero2, division;
    Scanner lea;
   
    division_del_mayor_menor()
    {
         numero1=0; numero2=0; division=0;
         lea = new Scanner(System.in);
    }
    void division()
    {
        System.out.println("ingrese el primer numero: ");
        numero1=lea.nextInt();
        System.out.println("ingrse el segundo numero:");
        numero2=lea.nextInt();
        
        if(numero2>numero1)
        {
            division= numero2/numero1;
            System.out.println("el resultado de la division es de: " + division);
        }else
        {
            division= numero1/numero2;
            System.out.println("el resultado de la division es de: " + division);
        }
        
       
    }
}
