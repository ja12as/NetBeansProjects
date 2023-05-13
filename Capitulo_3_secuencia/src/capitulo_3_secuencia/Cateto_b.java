/*Dados el cateto A y la hipotenusa C, el cateto B se calcula
         b² = c² - a²
Elaborar un algoritmo que lea el tamaño del cateto A y la hipotenusa C; y calcule e imprima el tamaño del cateto B.

*/
package capitulo_3_secuencia;
import java.util.*;
public class Cateto_b {
   
    int a, b, c;
    Scanner lea;
    
Cateto_b()
{
    a =0; b=0; c=0;
    lea = new Scanner(System.in);
}

void cateto()
{
    System.out.println("ingrese el cateto A:");
    a = lea.nextInt();
    System.out.println("ingrese la hipotenusa: ");
    c = lea.nextInt();
    
    b =  (int) Math.sqrt(Math.pow(c,2) - Math.pow(a,2));
    System.out.println("el valor de cateto B es de: " + b);
}
}
