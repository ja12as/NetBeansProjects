/*

Elaborar un algoritmo que permita leer el tamaño de un ángulo en grados e imprima el seno y coseno.
Debe convertirse los grados leídos a radianes antes de calcular el seno y coseno.

 */
package capitulo_3_secuencia;

import java.util.*;
public class Angulo_en_grados {
    
    int seno, coseno, tamaño, angulo;
    double pi;
    Scanner lea;
    
    
    Angulo_en_grados()
    {
      seno=0; coseno=0; tamaño=0; angulo=0;  pi =0 ;
      lea = new Scanner(System.in);
    }
    
    void seno_coseno()
    {
        System.out.println("ingrese el tamaño del angulo");
        tamaño = lea.nextInt();
         pi= 3.14159265;
        angulo = (int) (tamaño *(pi/180));
        seno =0;
        coseno=0;
        
        
                
    }
}
