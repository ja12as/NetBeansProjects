/*Calcule el salario neto semanal de un trabajador en función del número de horas semanales trabajadas y
el valor de la hora, teniendo en cuenta que si el empleado trabaja más de 45 horas semanales se le hace 
un aumento del 30%.*/

package actividad;

import java.util.*;
public class salario_neto_semanal {
    int horas_trabajadas, valor_hora ,suma, aumento,total;
    Scanner lea;
    
    salario_neto_semanal()
    {
        horas_trabajadas=0; valor_hora=0; aumento=0;total=0;suma=0;
        lea= new Scanner(System.in);
    }
    
    void salario()
    {
        System.out.println("ingrese las horas semanales trabajadas: ");
        horas_trabajadas= lea.nextInt();
        System.out.println("ingrese el valor por horas: ");
        valor_hora = lea.nextInt();
        
        if(horas_trabajadas>45)
        {
            suma = horas_trabajadas*valor_hora;
             aumento = (int) (suma*0.20);
             total= suma+ aumento;
            System.out.println("el salario semanal del empleado es de: " + suma);
            aumento = 30+total;
            System.out.println("y el aumento es de: " + total);
        }else
        {
            total=horas_trabajadas*valor_hora;
            System.out.println("el salario semanal del empleado es de: " + total);
        }
    }
}
