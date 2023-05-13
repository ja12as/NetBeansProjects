/*Calcular el total que una persona debe pagar por la compra de varias llantas, teniendo en cuenta 
que el precio de cada llanta es de $800.000 si se compran menos de 5 llantas y de $700.000 si se compran 5 o más.*/

package actividad;
import java.util.Scanner;
public class Conpras_de_llantas {
    int N_llantas,total,devuelta;
    Scanner lea;
    
    Conpras_de_llantas()
    {
       N_llantas = 0 ; total = 0 ;  devuelta = 0 ;
       lea= new Scanner(System.in);
    }
    
    void valor_a_pagar()
    {
        System.out.println("ingrese el numero de llanta que  dese comnprar:");
        N_llantas = lea.nextInt();
        
        if( N_llantas<= 5)
        {
            total = N_llantas *  800000;
            System.out.println("el valor a pagar es de: " + total );
        }else
        {
           total =  N_llantas * 700000;
            System.out.println("EL VALOR A PAGAR ES DE: " + total);
        }
        
        
            
            
    }
}
