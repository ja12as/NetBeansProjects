import java.util.*;
public class CalcularSueldoDeUnEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String nombEmpleado;
        int horasTrabajadas;
        double cuotaDeHora, sueldo;
        
        System.out.println("ingrese el nombre del empleado");
        nombEmpleado = entrada.next();
        System.out.println("ingrese la cantidad de horas trabajadas");
        horasTrabajadas = entrada.nextInt();
        System.out.println("ingrese el valor para cada hora trabajada");
        cuotaDeHora = entrada.nextDouble();
        
        sueldo = horasTrabajadas * cuotaDeHora;
        
         System.out.println("el sueldo de " + nombEmpleado
                               + "es de "
                               + sueldo + "pesos colombianos");
    }
}
