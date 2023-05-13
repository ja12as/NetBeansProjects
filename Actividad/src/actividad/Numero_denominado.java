/*Diseñe un algoritmo que pida dos números denominados X y Y. Si Y es diferente de cero
entonces asígnele a Z el resultado de la división de X entre Y. Si Y es cero, muestre un
mensaje de error indicando que no es posible dividir entre cero.
Nota: se debe de emplear estructuras selectivas o condicionales dobles en el diseño de los
algoritmos en caso que se requieran.
 */
package actividad;

import java.util.*;
public class Numero_denominado {
   int  x,y,div,total;
   Scanner lea;
   Numero_denominado()
   {
    x=0; y=0; div=0; total=0;
    lea=new Scanner(System.in);
   }
   
   void division()
   {
       System.out.println("ingrese el valor de x");
       x=lea.nextInt();
       System.out.println("ingresa el valor de y ");
       y=lea.nextInt();
       
       if(y==0)
       {
           total= y;
           System.out.println("ERROR...no se puede dividir con " +y);
       }
       
       else
       {
           total=x/y;
           System.out.println("el resultado de la division es de " + total);
       }
   }
}
