/*Una empresa tiene una campaña de fidelización de clientes de tal forma que realiza un
descuento del 10% sobre el valor de la compra del cliente, siempre y cuando lleve más de 5 años
como cliente de la empresa. Diseñe un algoritmo que determine cuanto se le descontaría a un
cliente por una compra realizada.
 */
package actividad;

import java.util.*;
public class Campaña_fidelizacion_cliente {
    double años, compra,total, descuento;
  Scanner lea;
            
  Campaña_fidelizacion_cliente() 
  {
      años =0; compra=0; total=0; descuento=0;
      lea = new Scanner(System.in);
  }
  
  void compra_realizada()
  {
      System.out.println("ingrese los años de ser cliente de la empresa: ");
      años = lea.nextInt();
      System.out.println("ingrese el total de la compra del cliente: ");
      compra = lea.nextInt();
      
      if(años >= 5)
      {
          descuento= compra*0.10;
          total = compra-descuento;
          System.out.println("el total a pagar por ser cliente fiel de esta empresa es de: " + total);
      }else
      {
          total = compra;
          System.out.println("el total de su compra es de: "+  total);
      }
  }
}
