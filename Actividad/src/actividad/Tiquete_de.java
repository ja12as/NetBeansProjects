/*Determine el valor de un tiquete de ida y vuelta por avión, conociendo la distancia a recorrer,
el precio por kilómetro y la clase en la que viaja el usuario. Si la distancia a recorrer es superior a 1000km, 
y la clase en la que viaja el usuario es clase ejecutiva, la aerolínea hace un descuento del 40%.*/

package actividad;
import  java.util.*;
public class Tiquete_de {
    int precio, kilometro, descuento, total, opcion;
    String clase, nombre;
    Scanner lea;
    
    Tiquete_de()
    {
        precio = 0; kilometro =0; descuento =0; total=0;
        lea = new Scanner(System.in);
    }
    
    void tiquete()
    {
        System.out.println("==========================================");
        System.out.println("Tipos de clases de la aerolínea AVIANCA: ");
        System.out.println("==========================================");
        System.out.println("1-Ejecutiva: ");
        System.out.println("2-primera clase");
        System.out.println("3-privado");
        System.out.println("==========================================");
        System.out.println("ingrese la opcion dada de la clase: ");
        opcion = lea.nextInt();
        System.out.println("==========================================");
        System.out.println("ingrese el nombre del destino: ");
        nombre= lea.next();
        System.out.println("==========================================");
        System.out.println("ingrese la distancia a recorrer: ");
        kilometro= lea.nextInt();
        System.out.println("===========================================");
       
       
          switch (opcion) {
            case 1:
                    if(kilometro>=1000)
                    {
                         precio= kilometro*1000;
                         descuento= (int) (precio*0.40);
                         total= precio- descuento;
                    System.out.println("el precio de ida y vuelta a " + nombre+ " es de "+ total+ " en la clase Ejecutivo");
                        
                    }else
                    {
                        precio= (kilometro*1000);
                    System.out.println("el precio de ida y vuelta a " + nombre+ " es de "+ precio+ " en la clase ejecutivo");
                        
                    }
                break;
            case 2:
               precio= (kilometro*1500);
                    System.out.println("el precio de ida y vuelta a " + nombre+ " es de "+ precio+ " en primera clase ");
                break;
            case 3:
                precio= (kilometro*2500);
                    System.out.println("el precio de ida y vuelta a " + nombre+ " es de "+ precio + " en la clase privado");
                break;
           
            default:
                break;
    }   
            
    }    
}
