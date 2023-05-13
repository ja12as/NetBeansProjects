/*Permita generar una factura correspondiente a la compra de un artículo del que se adquieren
una o varias unidades. El IVA a aplicar es del 10 % y si el precio bruto (precio de venta más IVA)
es mayor de 50000 pesos, se debe realizar un descuento del 5%.*/

package actividad;
import java.util.*;
public class Generar_factura {
    int   precio, cantidad, iva, descuento, total,suma;
  
    String nombre;
    Scanner lea;
    
    Generar_factura()
    {
        precio =0; cantidad = 0; iva = 10; descuento = 5; total = 0;
        suma=0;
        lea = new Scanner (System.in);
    }
    
    void factura()
    {
        System.out.println("ingrese el nombre del producto:");
        nombre= lea.next();
        System.out.println("ingrese la cantidad del producto:");
        cantidad = lea.nextInt();
        System.out.println("ingrese el precio del producto:");
        precio = lea.nextInt();
        total= precio* cantidad;
        if(total>=50000)
        {
            suma= (cantidad * precio);
            iva = (int) (suma*0.10);
            total= suma+iva;
            System.out.println("el valor a pagar es de: " + total);
            descuento = (int) (double) (total-0.5);
            System.out.println("y con el descuento es de: " + descuento);
        }else
        {
             suma= (cantidad * precio);
            iva = (int) (suma*0.10);
            total = suma+iva;
            System.out.println("el valor a pagar es de : " + total);
        }
    }

}
