/*Diseñar un algoritmo que calcule el pago que hacen un grupo de personas por la entrada a
un concierto, teniendo en cuenta que si el grupo es menor de 10 personas el pago es de
200000 pesos por persona y para grupos de 10 personas o más el pago es 150000 pesos por
persona.*/
package actividad;

import java.util.*;
public class Calcular_entrada_concierto_precio {
int n_persona, total;
Scanner lea;
    
 Calcular_entrada_concierto_precio()
 {
  n_persona=0; total=0;
  lea = new Scanner(System.in);
 }
 
 
 void entrada_concierto()
 {
  System.out.println("ingrese el numero de persona que dese comprar la boleta: ");
  n_persona= lea.nextInt();
  
  if(n_persona>10)
  {
   total= n_persona*150000;
   System.out.println("el precio a pagar es de: " + total);
  }else
  {
   total= n_persona*200000;
   System.out.println("el precio a pagar es de: " + total); 
  }
 }// cierra el metodo
}// cierra la clase
