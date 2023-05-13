/*Calcule el valor a pagar por la entrada a cine de un grupo de personas, sabiendo que si el grupo
está conformado por más de 5 personas se aplica un descuento del 20%*/
package actividad;
import java.util.*;
public class entrada_cine {
    int n_persona, descuento,total, presio_unitario,suma;
    Scanner lea;
    
   entrada_cine()
   {
       n_persona =0; descuento= 0; total= 0; presio_unitario=35000;suma=0;
       lea = new Scanner(System.in);
   }
   
   void cine()
   {
       System.out.println("numero de persona que desea ingresar al cine: ");
       n_persona=lea.nextInt();
       if(n_persona>5)
       {
           suma= (n_persona*35000);
           descuento = (int) (suma*0.20);
           total = suma-descuento;
           System.out.println("el precio a pagar es de: " + total);
       }else
       {
       total= (n_persona*35000);
         System.out.println("el precio a pagar es de: " + total);
       }
       
   }
}
