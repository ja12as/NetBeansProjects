/*
Elaborar un algoritmo que permita leer el tamaño de un ángulo en radianes o en grados 
(debe preguntar en que lo va a leer); e imprima su equivalencia (en grados o radianes según corresponda),
el seno y el coseno. Utilizar if-then-else.

 */
package capitulo_4_seleccion;
import java.util.*;
public class Angulo_radianes_grados {
   double angulo, senAng, cosAng, angRadianes, angGrados;
       char   resp;
       String entradaChar;
    Scanner lea;
    Angulo_radianes_grados()
    {
         angulo=0; senAng=0; cosAng=0; angRadianes=0; angGrados=0;
          resp=0;  
          lea = new Scanner(System.in);
    }
    
    void angulo_rad_gra()
    {
         System.out.println("¿En que tiene el tamaño del angulo?");
       System.out.print("¿En Grados (G), Radianes (R)?: ");
       entradaChar = lea.next();
       resp = entradaChar.charAt(0);

       System.out.print("Teclee angulo: ");
       angulo = lea.nextDouble();

    // Calcular
       if (resp == 'R' || resp == 'r')
       {
          angRadianes = angulo * (Math.PI/180);
          System.out.println("Equivalen a " + angRadianes + " Radianes");
          senAng = Math.sin(angRadianes);
          cosAng = Math.cos(angRadianes);
       }
       else
       {
          angGrados = angulo * (180/Math.PI);
          System.out.println("Equivalen a " + angGrados + " Grados");
          senAng = Math.sin(angulo);
          cosAng = Math.cos(angulo);
       }

    // Imprimir salida
       System.out.println("\n--------------- Resultados ---------------");
       System.out.println("Seno = " + senAng);
       System.out.println("Coseno = " + cosAng);
    }
}
