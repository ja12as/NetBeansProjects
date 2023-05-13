/*Dados dos ángulos de un triángulo se puede calcular el tercer ángulo. Se sabe que
la suma de los ángulos de un triángulo es 180° , por ejemplo, sean A y B los ángulos conocidos,
entonces  C = 180 - (A+B). Elaborar un algoritmo que lea los ángulos A y B e imprima el ángulo C.*/
package capitulo_3_secuencia;
import java.util.*;
public class angulo1 {
    int a, b, c, total;
    Scanner lea;
  angulo1()
 {
  a = 0; b = 0; c = 0; total = 0;  
  lea = new Scanner(System.in);
 }
 
 void Triangulo_180()
 {
      
     System.out.println("debe ingresar el valor de A y B para  darle el valor de C y  poder  dar un  triangulo de 180°: ");
      System.out.println("ingrese el valor de A: ");
      a=lea.nextInt();
      System.out.println("ingrese el valor de B: ");
      b=lea.nextInt();
      
     c= (a+b)-180;
     System.out.println("el valor de C es de: " + c);
   
 }
    
}
