/*
Elaborar un algoritmo que permita leer el tamaño de dos ángulos A y B; e imprima:
- si son iguales y que tipo de ángulo son
- si son diferentes y que tipo de ángulo es cada uno
 */
package capitulo_4_seleccion;
import java.util.*;
public class Angulo_A_B {
    int a, b;
    Scanner lea;
  Angulo_A_B()
  {
      a=0; b=0;
      lea =  new Scanner(System.in);
  }
    void Tangulo()
    {
        System.out.println("ingrese el tamaño del angulo A:");
        a = lea.nextInt();
        System.out.println("ingrese el tamaño del angulo B:");
        b = lea.nextInt();
        
        
            if (a == b)
       {
          System.out.println("Los angulos son iguales");
          if (a < 90)
             System.out.println("son Agudos");
          if (a == 90)
             System.out.println("son RectoS");
          if (a > 90 && a < 180)
             System.out.println("son Obtusos");
          if (a == 0 || a == 180 || a == 360)
             System.out.println("son Llanos o Planos");
          if (a > 180 && a < 360)
             System.out.println("son Concavos");
       }
       else
       {
          System.out.println("Los angulos son diferentes");
          if (a < 90)
             System.out.println("El angulo A es Agudo");
          if (a == 90)
             System.out.println("El angulo A es Recto");
          if (a > 90 && a < 180)
             System.out.println("El angulo A es Obtuso");
          if (a == 0 || a == 180 || a == 360)
             System.out.println("El angulo A es Llano o Plano");
          if (a > 180 && a < 360)
             System.out.println("El angulo A es Concavo");
          if (b < 90)
             System.out.println("El angulo B es Agudo");
          if (b == 90)
             System.out.println("El angulo B es Recto");
          if (b > 90 && b < 180)
             System.out.println("El angulo B es Obtuso");
          if (b == 0 || b == 180 || b == 360)
             System.out.println("El angulo B es Llano o Plano");
          if (b > 180 && b < 360)
             System.out.println("El angulo B es Concavo");
       }
           
    }
}
