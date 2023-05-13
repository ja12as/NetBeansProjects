/*Determine la cantidad total a pagar por una llamada telefónica de acuerdo a las siguientes
premisas:
a. Toda llamada que dure menos de 3 minutos vale 100 pesos.
b. Cada minuto adicional a partir de los 3 primeros cuesta 50 pesos.*/
package actividad;
import java.util.*;
public class Llamada_telefonica {
  int minuto, total, precio;
Scanner lea;  

Llamada_telefonica()
{
    minuto =0; total=0; precio=50;
    lea= new Scanner(System.in);
}

void llamada()
{
    System.out.println("cual fue la duracion de la llamada en minuto: ");
    minuto= lea.nextInt();
    
    if(minuto<=3)
    {
      total=100;
        System.out.println("el precio a pagar por los " + minuto+ " minutos es de: " +total );
    }else
    {
        total=(minuto*precio)+ 100;
        
               
        System.out.println("el precio a pagar por los " +minuto + "  minutos es de: " + total);
        
    }
}// cierra el void

}// cierra la clase
