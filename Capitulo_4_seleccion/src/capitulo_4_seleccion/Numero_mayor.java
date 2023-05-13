/*Elabore un algoritmo que lea cuatro números e imprima el mayor. Se supone que son números diferentes, por lo tanto,
no se debe averiguar si son iguales o si son diferentes. Lo vamos a solucionar de dos formas.*/
package capitulo_4_seleccion;

import java.util.*;
public class Numero_mayor {
    int numeroM,n1,n2,n3,n4;
    Scanner lea;
    Numero_mayor()
    {
        numeroM =0; n1=0; n2=0; n3=0; n4=0;
        lea = new Scanner(System.in);
    }
    
    void cuatro()
    {
        System.out.println("ingresa el primer numero");  
       n1=lea.nextInt();
          System.out.println("ingresa el segundo numero");  
          n2= lea.nextInt();
            System.out.println("ingresa el tercer numero"); 
            n3=lea.nextInt();
              System.out.println("ingresa el cuarto numero");  
              n4=lea.nextInt();
              
              if(n1>n2 && n1>n3 && n1>n4)
              {
                  numeroM = n1;
                  System.out.println("el numero mayor es " + n1);
              }
              
                 
              if(n2>n1 & n2>n3 & n2>n4)
              {
                  numeroM = n2;
                  System.out.println("el numero mayor es " + n2);
              }
              
                 
              if(n3>n2 & n3>n1 & n3>n4)
              {
                  numeroM = n3;
                  System.out.println("el numero mayor es " + n3);
              }
              
                 
              if(n4>n2 & n4>n3 & n4>n1)
              {
                  numeroM = n4;
                  System.out.println("el numero mayor es " + n4);
              }
    }
}
