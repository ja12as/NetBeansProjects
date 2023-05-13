/*El volumen de un cilindro se calcula multiplicando la constante Pi (π=3.14159265)
por el cuadrado del radio de la base(r) por la altura(h). 
          v = πr²h
Elaborar un algoritmo que lea el radio de la base y la altura de un cilindro,
que calcule e imprima el volumen.
*/
package capitulo_3_secuencia;

import java.util.*;
public class Volumen_de_cilindro {
    
    float  altura, radio,volumen;
    double pi;
    Scanner lea;
    
Volumen_de_cilindro()
{
    pi=0; altura=0; radio=0; volumen=0;
    lea = new Scanner(System.in);
}

void volumen()
{
    System.out.println("INGRESE LA BASE DEL CILINDRO:");
    radio = lea.nextFloat();
    System.out.println("ingrse la altura del cilindro:");
    altura= lea.nextFloat();
    
    pi= 3.14159265;
     volumen = (float) (pi * (radio*2)*altura);
     System.out.println("el volumen del cilindro es de :" + volumen);
}
}
