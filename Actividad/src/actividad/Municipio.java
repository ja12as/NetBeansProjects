/*El municipio como parte de un programa social asumirá el pago de una cantidad de dinero por
la compra de viviendas de interés social, teniendo en cuenta la cantidad de años que lleve el
propietario (quien comprará la vivienda) como residente del municipio y el valor de la vivienda,
según la siguiente tabla:

Años de residencia del  ==   Valor de la vivienda        ==   Cantidad de dinero
 propietario                                                  aportada por el municipio


Entre 10 y 15 años      ==   120 millones o menos        ==   12 millones            
Entre 15 y 20 años      ==   Entre 120 y 130 millones    ==   10 millones
Más de 20 años          ==   Entre 130 y 140 millones    ==   8 millones



Diseñe un algoritmo que determine cuanto tiene que pagar el propietario por la contra de una
vivienda de interés social.
 */
package actividad;
import java.util.*;
public class Municipio {
 int valor_vivienda, dinero_minicipio,año, total;

 Scanner lea;
 
 Municipio()
 {
     valor_vivienda=0; dinero_minicipio=0;año=0;total=0;
     lea = new Scanner(System.in);
 }
 
 void vivienda_interes_social()
 {
     System.out.println("ingrese los años de recidencia ");
     año= lea.nextInt();
     
    
}// cierra el metodo
}// cierre la clase