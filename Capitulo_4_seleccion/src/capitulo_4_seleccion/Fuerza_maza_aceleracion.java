/*
         a
Elaborar un algoritmo que pregunte lo que desea calcular; fuerza (F), masa (m) o aceleración (a). 
Si es F, se leen los datos m y a. Si es a, se leen los datos F y m. Si es m, se leen los datos F y a.
Utilizar if-then.

 */
package capitulo_4_seleccion;
import java.util.*;
public class Fuerza_maza_aceleracion {
   int f, m, a, resp,total;
    Scanner lea;
    
    Fuerza_maza_aceleracion()
    {
        f=0; a=0; m=0; total =0; resp=0;
        lea = new Scanner(System.in);
    }
    
    void fma()
    {
        System.out.println("que desea calcular");
        System.out.println("1-fuerza");
        System.out.println("2-masa");
        System.out.println("3-aceleracion");
        System.out.println(" ingrese lo que desea calcular");
        resp=lea.nextInt();
        
        if(resp==1)
        {
            System.out.println("ingrese el valor de la masa");
            m=lea.nextInt();
            System.out.println("ingrexse el valor de la aceleracion");
            a=lea.nextInt();
            
            f= m*a;
            System.out.println("la fuerza es de "+ f);
        }
        
          if(resp==2)
        {
            System.out.println("ingrese el valor de la fuerza");
            f=lea.nextInt();
            System.out.println("ingresee el valor de la aceleracion");
            a=lea.nextInt();
            m= f/a;
            System.out.println("la masa ees de " + m);
        }
          
            if(resp==3)
        {
            System.out.println("ingrese el valor de la fuerza");
            f=lea.nextInt();
            System.out.println("ingrese el valor de la masa");
            m= lea.nextInt();
            a=f/m;
            System.out.println(" la aceleracion es de "+ a);
        
        }
        
        }
    }


