//Determine si un número es mayor que 10.

package actividad;
import java.util.*;
public class Determinar_numero {
    int numero;
    Scanner lea;
    
    Determinar_numero()
    {
        numero=0;
        lea = new Scanner(System.in);
    }
    
    void  numero()
    {
        System.out.println("ingrese el numero para determinar si es mayor que 10: ");
        numero= lea.nextInt();
        
        if(numero >10)
        {
            numero =numero;
            System.out.println("este numero es mayor que 10: ");
        }else{
            numero = numero;
            System.out.println("este numero es menor que 10: ");
        }
    }
    
}
