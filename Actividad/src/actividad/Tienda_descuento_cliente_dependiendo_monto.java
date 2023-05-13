/*En una tienda efectúa un descuento a los clientes dependiendo del monto de la compra. El
descuento se efectúa con base el siguiente criterio. Si la compra es menor a $ 200000 se
aplica un descuento del 10% y si el monto de la compra es mayor o igual a $ 200000 se aplica
un descuento del 20%. Diseñe un algoritmo que calcule el descuento y el total a pagar de la
compra.*/
package actividad;
import java.util.*;
public class Tienda_descuento_cliente_dependiendo_monto {
    int compra, descuento,total;
    Scanner lea;
    
    Tienda_descuento_cliente_dependiendo_monto()
    {
        compra = 0; descuento=0; total =0;
        lea = new Scanner(System.in);
    }
    
    void descuento()
    {
        System.out.println("ingresa el valor de la compra: ");
        compra = lea.nextInt();
        
        if(compra >=200000)
        {
            descuento= (int) (compra *0.20);
            total= compra-descuento;
            System.out.println("el descuento es de " + descuento);
            System.out.println("y el total a pagar es de: " + total);
        }else
        {
            descuento= (int) (compra *0.10);
            total= compra-descuento;
            System.out.println("el descuento es de " + descuento);
            System.out.println("y el total a pagar es de: " + total);
        }
    }
}
