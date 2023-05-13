/*Diseñe un algoritmo que determinen si un punto (dadas sus coordenadas) se encuentra en
el interior de una circunferencia con centro en el origen y radio 3. (La ecuación de una
circunferencia con centro en el origen y radio 3 está dada por la ecuación X^2+y^2=9. Un
punto se encuentra en el interior de la circunferencia si X^2+y^2<9).*/
package actividad;
import java.util.Scanner;

public class Determinar_punto_circuferencia_centro_radio {
    int x, y,r,suma,total;
    Scanner lea;
    
    Determinar_punto_circuferencia_centro_radio()
    {
        x=0; y=0;r=0;suma=0;total=0;
        lea=new Scanner(System.in);
    }
    
    void centro_redio()
    {
        System.out.println("ingrese el valor de x");
        x=lea.nextInt();
        System.out.println("ingrese el valor de y");
        y=lea.nextInt();
        
        suma= (x*x)+(y*y);
        total = suma;
        System.out.println("""
                           se encuentra en
                           el interior de una circunferencia con centro en el origen y radio   """  +  suma);
        
    }
}
