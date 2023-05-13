/*
De acuerdo con la igualdad o desigualdad de sus lados los triángulos se clasifican en:
  Escaleno    todos sus lados son diferentes
  Isósceles    al menos dos de sus lados son iguales
  Equilátero   los tres lados son iguales. Note que un equilátero también es isósceles

Elaborar un algoritmo que lea el tamaño de los tres lados A, B y C de un triángulo e imprima que tipo de triángulo es. Utilizar if-then-else

 */
package capitulo_4_seleccion;
import java.util.*;
public class Triangulos {
    int  t1, t2, t3;
    Scanner lea;
    
    Triangulos()
    {
       t1 =0; t2 =0; t3 =0;
        lea= new Scanner(System.in);
    }
    
    void clasificacion()
    {
        System.out.println("ingrese las tres medidas de triangulo a conoser");
        System.out.println("ingrese el priemer valor");
        t1=lea.nextInt();
         System.out.println("ingrese el priemer valor");
         t2=lea.nextInt();
          System.out.println("ingrese el priemer valor");
          t3 =lea.nextInt();
          System.out.println("\\n--------------- Resultado ----------------");
          if(t1!=t2 & t1!=t3 & t2!=t3)
          {
              System.out.println("el tiangulo es Escaleno:");
          }
          
            if(t1==t2 & t1==t3 & t2==t3)
          {
              System.out.println("el tiangulo es Equilátero:");
          }
            
            else
            {
                System.out.println("el triangulo es Isósceles:");
            }
    }
}
