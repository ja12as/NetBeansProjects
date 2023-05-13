/*
Dados los lados A y B de un triángulo rectángulo, según el teorema de Pitágoras,
el cuadrado de la hipotenusa (C), es igual a la suma del cuadrado de los catetos (lados).
       c² = a² + b²
Elaborar un algoritmo que lea el tamaño de los lados A y B, y calcule e imprima C (hipotenusa).
*/
package capitulo_3_secuencia;

import java.util.*;
public class Hipotenusa {
  
    int a, b, c, total;
    Scanner lea;
    
Hipotenusa()
{
    a = 0; b = 0; c = 0; total = 0;
    lea = new Scanner(System.in);
}
 
void triangulo_rectangulo()
{
    System.out.println("ingrese el valor de A: ");
    a=lea.nextInt();
    System.out.println("ingrese el valor de B: ");
    b=lea.nextInt();
    
    c= (int) Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    System.out.println("el resultado de la hipotenusa es : " + c);
    System.out.println("A ="+a+ ",B =" +b+ ", C="+c );
}

}
