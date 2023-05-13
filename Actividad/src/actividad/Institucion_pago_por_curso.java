/*En la Institución Señora de las Mercedes, los pagos por curso desaprobado son de 300000
pesos, con un cargo máximo de 1800000 pesos, independiente del número de cursos
tomados. Ejemplo si un alumno desaprueba 3 cursos pagaría 900000 pesos, mientras que
uno que desaprueba 8 cursos paga 1800000 pesos. Diseñe el algoritmo en el que las
entradas sean el número de cursos desaprobados y la salida sea el valor del pago total que
el alumno haga por los cursos desaprobados.*/
package actividad;
import java.util.*;
public class Institucion_pago_por_curso {
    int curso, precio;
    Scanner lea;
    
    Institucion_pago_por_curso()
    {
        curso = 0; precio =0;
        lea = new Scanner(System.in);
    }
    
    void desaprobados()
    {
        System.out.println(" ingrese el numerode  cursos desaprobados del estudiante: " ); 
        curso= lea.nextInt();
        
        if(curso>=6)
        {
            precio = 1800000;
            System.out.println("el precio a pagar por los cursos desaprobados es de: " + precio);
        }else
        {
            precio = curso* 300000;
            System.out.println("el precio a pagar por los cursos desaprobados es de: " + precio);
        }
    }
}
