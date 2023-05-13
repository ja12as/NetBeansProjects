/*Diseñe un algoritmo para resolver una ecuación de primer grado ax + b = 0 dados los
coeficientes a y b.
 */
package actividad;

import java.util.*;
public class Ecuacion_grado {
    int a,b,suma;
    double x;
    Scanner lea;
    
    Ecuacion_grado()
    {
        a = 0; b=0; suma =0;x=0;
        lea= new Scanner(System.in);
    }
    
    void coeficientes()
    {
        System.out.println("ingrese el numero que va en la letra A:");
        a=lea.nextInt();
        System.out.println("ingresa el numero que va en la letra B:");
        b=lea.nextInt();
        
        x=b/a;
        System.out.println("el resultado es " + x);
        
    }
}
