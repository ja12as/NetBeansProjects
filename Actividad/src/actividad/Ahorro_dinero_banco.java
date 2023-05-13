/*Una persona desea saber si continúa ahorrando su dinero en el banco o si lo retira, teniendo
en cuenta la cantidad que gana por concepto de interés mensual sobre el dinero ahorrado.
Si la ganancia por concepto de interés mensual es mayor o igual a $20000 decidirá continuar
ahorrando y en ese caso deseará saber cuánto dinero tendrá, al cabo de un mes, en su
cuenta. Si la ganancia por concepto de interés mensual es inferior a $20000, decidirá retirar
el dinero del banco. Diseñe un algoritmo que resuelva el problema planteado.
 */
package actividad;

import java.util.*;
public class Ahorro_dinero_banco {
    int  ahorro,interes, total;
    Scanner lea;
    Ahorro_dinero_banco()
    {
     ahorro =0; interes=0; total=0;
        lea = new Scanner(System.in);
    }
    void intereses()
    {
        System.out.println("ingrese el ahorro que tiene en el banco:");
        ahorro=lea.nextInt();
        
        if(ahorro<=2000000)
        {
            interes= (int) (ahorro*0.01);
            total= interes + ahorro;
            System.out.println(" el interés mensual sobre el dinero ahorrado es: " + interes);
            System.out.println("el total de ahorroo mensual es de:" + total);
        }else
        {
            interes= (int) (ahorro*0.05);
            total= interes + ahorro;
            System.out.println(" el interés mensual sobre el dinero ahorrado es: " + interes);
            System.out.println("el total de ahorroo mensual es de:" + total); 
        }
    }
}
