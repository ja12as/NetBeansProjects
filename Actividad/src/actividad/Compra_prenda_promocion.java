/*
 Determine el precio final que debe pagar una persona por la compra de una prenda y el valor
que se le descontará teniendo en cuenta que el almacén donde realiza la compra tiene la
siguiente promoción para sus prendas de vestir: las prendas que tienen un precio superior a
50000 pesos se les aplicará un descuento de 10%.
 */
package actividad;
import java.util.*;
public class Compra_prenda_promocion {
 int  precio, total ,descuento;
 String nombre,entradaChar;
 Scanner  lea;
 char desea;
 
 Compra_prenda_promocion()
 {
    precio = 0;total=0;descuento=0;
     lea= new Scanner(System.in);
 }
 
 void compra_prenda()
 {
     do{
        precio++; 
     System.out.println("ingrese el nombre del producto: ");
     nombre =lea.next();
     System.out.println("ingrese el precio unitario del producto: ");
     precio= lea.nextInt();
     
    
      
    System.out.println("¿desea ingresar otro producto?");
            entradaChar = lea.next();
            desea = entradaChar.charAt(0);
            lea.nextLine();
        }while (desea == 'S' || desea == 's');
        
     if(precio>=50000)
     {
         descuento= (int) (precio*0.10);
         total= precio-descuento;
         System.out.println("el precio de el o la " + nombre+ " aplicando el desuento es de :" + total);
     }else
     {
         total=precio;
         System.out.println("el precio de el o la " + nombre+ " es de : " + total);
     }
     
 }// cierra void
}// cierra clase
