/*Diseñar un algoritmo que dada la edad de una persona, imprima si es mayor o menor de
edad.*/
package actividad;
import java.util.*;

public class Edad_mayor_menor {
    int edad;
    Scanner lea;
    
    Edad_mayor_menor()
    {
        edad =0;
        lea= new Scanner(System.in);
    }
        void edad()
        {
            System.out.println("ingrese la edad de la persona");
            edad=lea.nextInt();
            
            if(edad>=18)
            {
               edad= edad;
                System.out.println("por tener " + edad+ " años  usted es un mayor de edad");
                
            }else
            {
                 edad= edad;
                System.out.println("por tener " + edad+ " años  usted es un menor de edad");
              
            }
        }
    
}
