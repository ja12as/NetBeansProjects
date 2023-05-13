//Determine el mayor de dos números o indique si los números son iguales.

package actividad;
import java. util.*;
public class Mayor_de_dos_numeros {
    int n1, n2;
    Scanner lea;
    
    Mayor_de_dos_numeros()
    {
       n1 =0 ; n2 = 0;
       lea=new Scanner(System.in);
    }
    
    void numero()
    {
        System.out.println("ingrese el primer numero: ");
        n1 = lea.nextInt();
        System.out.println("ingrese el segundo numero: ");
        n2 = lea.nextInt();
        
        if(n1>n2)
        {
            
            System.out.println("el numero " + n1 + "  es mayor que "+ n2);
        }else
        {
             System.out.println("el numero " + n2 + "  es mayor que "+ n1);
        }
    }
}
