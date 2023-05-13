/*Una empresa quiere hacer una compra de varios artículos de un mismo producto a una
fábrica. La empresa, dependiendo del monto total de la compra, decidirá qué hacer para
pagar al fabricante. Si el monto total de la compra excede de $500 000 la empresa tendrá
la capacidad de invertir de su propio dinero un 60% del monto de la compra, pedir prestado
al banco un 30% y el resto lo pagara solicitando un crédito al fabricante. Si el monto total
de la compra no excede de $500 000 la empresa tendrá capacidad de invertir de su propio
dinero un 70% y el restante 30% lo pagara solicitando crédito al fabricante. El fabricante
cobra por concepto de intereses un 20% sobre la cantidad que se le pague a crédito.*/
package actividad;
import java.util.*;

public class Empresa_comprar_producto_fabricante {
    int empresa, banco, credito, compra, interes, total;
    Scanner lea;
    
    Empresa_comprar_producto_fabricante()
    {
        empresa=0; banco=0; credito=0; compra=0; interes=0;total=0;
        lea= new Scanner(System.in);
    }
    
     void comprar_fabricante()
     {
         System.out.println("de cuanto es la compra de artuculo: ");
         compra=lea.nextInt();
         
         
         if(compra>500000)
         {
             empresa = (int) (compra*0.60);
             banco= (int) (compra * 0.30);
             credito = (int) (compra *0.10);
             interes = (int) (credito*0.20);
             total= empresa+banco+credito+interes;
             
             System.out.println("la empresa tendrá capacidad de invertir " + empresa);
             System.out.println("pedir prestado al banco un " + banco);
             System.out.println(" y el resto lo pagara solicitando un crédito al fabricante de " + credito);
             System.out.println("y el interes es de: " + interes);
             System.out.println("y el total a pagar es de: "+ total);
         }else
         {
             empresa = (int) (compra*0.70);
             credito = (int) (compra *0.30);
             interes = (int) (credito*0.20);
             total= empresa+banco+credito+interes;
             
             System.out.println("la empresa tendrá capacidad de invertir " + empresa);
             System.out.println(" y el resto lo pagara solicitando un crédito al fabricante de " + credito);
             System.out.println("y el interes es de: " + interes);
             System.out.println("y el total a pagar es de: "+ total);
         }
     }
}
