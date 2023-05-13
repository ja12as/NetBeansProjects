/*Dados 3 números, determine si la suma de dos de ellos
es igual al tercer número.*/
package actividad;

import java.util.*;
public class Tres_numeros {
   int n1, n2, n3, total, suma;
   Scanner lea;
   
   Tres_numeros()
   {
      n1 =0; n2=0; n3=0; total=0; suma=0;
      lea=new Scanner(System.in);
   }
   void suma()
   {
       System.out.println("si dado el caso la suma de los dos primeros numero es igual al tecero no se sumara el tercero:"); 
       System.out.println("==============================================================================================");
       System.out.println("ingrese el primer numero de la suma: ");
       n1= lea.nextInt();
       System.out.println("ingrese el segundo numero de la suma: ");
       n2= lea.nextInt();
       System.out.println("ingrese el tercer numero de la suma: ");
       n3 =lea.nextInt();
       suma= n1+n2;
       if(suma==n3) 
       {
          total= n1+n2;
           System.out.println("la suma de los dos numero es de: " + suma+" donde el tercer numero es de: " + n3);
       }else
       {
           total= n1+n2+n3;
           System.out.println("la suma de los  tres numeros es de: " + total);
       }
       
   }// cierra el metodo
   }// cierra la clase

