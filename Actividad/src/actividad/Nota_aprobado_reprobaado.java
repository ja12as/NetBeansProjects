/*Diseñe un algoritmo que calcule el promedio de tres notas e imprima un mensaje de
aprobado, si el promedio es mayor o igual a 3.0 o imprima reprobado, en caso contrario.*/
package actividad;
import java.util.*;
public class Nota_aprobado_reprobaado {
    int nota1, nota2, nota3, promedio, total, suma;
    Scanner lea;
    
    Nota_aprobado_reprobaado()
    {
        nota1=0; nota2=0; nota3=0; promedio=0; total=0; suma=0;
        lea = new Scanner(System.in);
    }
    
    void promedio()
    {
        System.out.println("ingrese la primera nota:");
        nota1 = lea.nextInt();
        System.out.println("ingrese la segunda nota:");
        nota2 = lea.nextInt();
        System.out.println("ingrese la tercera nota ");
        nota3 = lea.nextInt();
        suma= nota1+nota2+nota3;
        promedio= suma/3;
        if(promedio>=30)
        {
          promedio= promedio;
            System.out.println("el promedio es de " +promedio + " y usted aprobo el grado:");
        }else
        {
             promedio= promedio;
            System.out.println("el promedio es de " +promedio + " y usted reprobo el grado = bruto =");
        }
        
    }
}
