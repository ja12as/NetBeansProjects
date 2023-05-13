/*Diseñar un algoritmo que pida un número y muestre un mensaje indicando si el número es
par o impar.*/
package actividad;
import java.util.*;
public class Numero_par_impar {
    int num;
    Scanner lea = new Scanner(System.in);
    Numero_par_impar()
    {
       num=0; 
    }
    
   void numero()
    {
        System.out.println(" tecle el numero entero (0-9)");
         num = lea.nextInt();
         
        switch(num)
        {
             case 0:
             case 2:
             case 4:
             case 6:
             case 8:
             case 10:
                 System.out.println("el numero " + num + " es par");              
                 break;
                 
             case 1:
             case 3:
             case 5:
             case 7:
             case 9:
                 System.out.println("el numero " + num + " es impar");
                 break;
                 default:
                 System.out.println("no esta en el rango de 0 a 9");
                       
                 
        }     
    }

 
}
