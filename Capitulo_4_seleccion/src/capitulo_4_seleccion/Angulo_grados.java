/*
Elaborar un algoritmo que lea el tamaño de un ángulo en grados e imprimir si es:
	Agudo        si es menor a 90°
	Recto         si es igual a 90°
	Obtuso       si es mayor que 90° pero menor que 180°
	Llano          si es igual a 180°
	Cóncavo     si es mayor que 180° pero menor que 360°

 */
package capitulo_4_seleccion;
import java.util.*;
public class Angulo_grados {
    
    int tamaño;
    Scanner lea;
    Angulo_grados()
    {
        tamaño= 0;
        lea = new Scanner(System.in);
    }
    
     void grados()
     {
         System.out.println("ingrese el tamaño del angulo:");
         tamaño=lea.nextInt();
         
         if(tamaño<90)
         {
             System.out.println("el angulo es un AGUDO ya que mide " + tamaño);
         }
         
         else if(tamaño==90)
         {
             System.out.println("el angulo es un RECTO ya que mide " + tamaño);
         }
         
          else if(tamaño>90&&tamaño<180)
         {
             System.out.println("el angulo es un OBTUSO ya que mide " + tamaño);
         }
         
          else if(tamaño == 180)
         {
             System.out.println("el angulo es un LLANO ya que mide " + tamaño);
         }
         
          else if(tamaño >180 && tamaño< 360)
         {
             System.out.println("el angulo es un CONCAVO ya que mide " + tamaño);
         }
     }
}
