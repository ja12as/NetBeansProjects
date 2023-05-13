/*En un supermercado se hace una promoción, mediante la cual el cliente obtiene un
descuento dependiendo del color de una bolita que se escoge al azar. Si la bolita escogida
es de color rojo se hace un descuento es del 10% sobre el total de la compra, si la bolita es
de otro color, el descuento es del 20%. Diseñar un algoritmo que obtenga cuánto dinero se
le descuenta al cliente.*/
package actividad;

import java.util.*;
public class Descuento_supermercado_bolita {
    int compra, total, roja, amarillo,blanco,verde,descuento;
    Scanner lea;
    
    Descuento_supermercado_bolita()
    {
       compra=0; total=0; roja=0; amarillo=0;blanco=0;verde=0;descuento=0;
       lea = new Scanner(System.in);
    }
    
   void al_azar()
   {
       System.out.println("ingrese el valor a pagar: ");
       compra= lea.nextInt();
       System.out.println("-----------------------------------------------------------------------------------");
       System.out.println("este supermercado tiene un descuento dependiendo el color de la bolita que elija");
       System.out.println("los colores son");
       System.out.println("-----------------------------------------------------------------------------------");
       System.out.println("r-rojo");
       System.out.println("a-amarillo");
       System.out.println("b-blanco");
       System.out.println("v-verde");
       System.out.println("-----------------------------------------------------------------------------------");
       System.out.println("ingresa el color de lo bolita");
       descuento=lea.nextInt();
       
       if(descuento=='r'||descuento=='R')
       {
           
           roja=(int) (compra-0.10);
           total= roja;
           System.out.println("el valor a pagar es de"+ total);
       }
       
       if(descuento=='a'||descuento=='A')
       {
           amarillo = (int) (compra-0.20);
           total=amarillo;
           System.out.println("el valor a pagar es de " + total);
       }
       
       if(descuento=='B'||descuento=='b')
       {
           blanco = (int) (compra-0.20);
           total=blanco;
           System.out.println("el valor a pagar es de "+ total);
       }
       
       if(descuento=='v'||descuento=='V')
       {
           verde = (int) (compra-0.20);
           total=verde;
           System.out.println("el valor a pagar es de" + total);
       }
       
   }
}

