/*Diseñar un algoritmo que dado como dato el sueldo de un trabajador, aplique un aumento
del 15% si su sueldo es inferior a $1000000 y 12% en caso contrario, luego imprima el nuevo
sueldo del trabajador.*/
package actividad;

import java.util.*;
public class Aumento_sueldo_trabajador {
    int sueldo, aumento,total;
    Scanner lea;
    
    Aumento_sueldo_trabajador()
    {
        sueldo = 0; aumento =0; total =0;
        lea = new Scanner(System.in);
    }
    
    void sueldo_final()
    {
        System.out.println("ingrese su sueldo");
        sueldo=lea.nextInt();
        
        if(sueldo>=1000000)
        {
            aumento = (int) (sueldo*0.12);
            total = sueldo+aumento;
            System.out.println("el sueldo mas el aumento le queda en " + total); 
        }
        
        else
        {
          aumento = (int) (sueldo*0.15);
          total = sueldo+aumento;
            System.out.println("el sueldo mas el aumento le queda en " + total);
        }
    }
    
}
