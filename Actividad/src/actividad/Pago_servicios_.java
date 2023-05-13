/*Una persona debe pagar $30000 de energía, $20000 de gas, $20000 de acueducto y
alcantarillado, $90000 de teléfono, internet y televisión, 700000 del colegio de los hijos. Diseñe
un algoritmo para determinar si esta persona alcanzará a pagar todo lo anterior con su salario y
si es así, cuánto le quedará para otros gastos.*/
package actividad;
import java.util.*;

public class Pago_servicios_ {
    int energia, gas,  acueducto, tecnologia, colegio,salario, total, restante;
    Scanner lea;
    
    Pago_servicios_()
    {
        energia=0;  gas=0; acueducto =0; tecnologia=0; colegio=0; salario=0;
                total=0; restante=0;
                lea= new Scanner(System.in);
    }
    
    void servicios()
    {
        System.out.println("ingrese el costo del servicio de la energia: ");
        energia= lea.nextInt();
        System.out.println("ingrese el costo del servicio del gas: ");
        gas = lea.nextInt();
        System.out.println("ingrese el costo del servicio del acueducto: ");
        acueducto = lea.nextInt();
        System.out.println("ingrese el costo del servicio del telefono, internet, television: ");
        tecnologia = lea.nextInt();
        System.out.println("ingrese el costo del servicio del cologio: ");
        colegio = lea.nextInt();
        System.out.println("ingrese el salario qure gana mensualmente: ");
        salario = lea.nextInt();
        total=energia+ gas+  acueducto+ tecnologia+ colegio;
        
        if(total>salario)
        {
            total = total;
             restante = salario - total;
            System.out.println("el gasto en los servicios y la colegiatura es de: " + total);
        System.out.println("el restante que le queda despues de pagar todo es de: " + restante);
        
        }else
        {
              total = total;
                restante = total-salario;
               System.out.println("el gasto en los servicios y la colegiatura es de: " + total);
               System.out.println("ya que su salario no alcanso queda deviendo: " + restante);
        }
        
    }// cierra metodo
}// cierra clase
