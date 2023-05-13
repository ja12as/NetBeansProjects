/*Diseñe un algoritmo que lea el valor unitario de venta de un producto y la cantidad de
unidades vendidas. Si dicha cantidad es mayor que 5, entonces se hará un descuento el 10%
sobre el valor de la venta.
*/
package actividad;
import java.util.*;
public class Valor_unitario_venta_producto_cantidad {
    int precio,n_producto, total,suma,descuento;
    Scanner lea;
  Valor_unitario_venta_producto_cantidad()
  {
     precio =0; n_producto=0;total =0;suma=0; descuento=0;
     lea = new Scanner(System.in);
  }
  
  void venta_producto()
  {
      System.out.println("ingrese el precio del producto: ");
      precio =lea.nextInt();
      System.out.println("ingrese la cantidad delproducto que desea llevar: ");
      n_producto= lea.nextInt();
      
      if(n_producto>5)
      {
          suma = (precio*n_producto);
          descuento = (int) (suma * 0.10);
          total = suma-descuento;
          System.out.println("el valor a pagar es de: " + total);
      }else
      {
            total = precio*n_producto;
           System.out.println("el valor a pagar es de: " + total);
      }
  }
    
}
