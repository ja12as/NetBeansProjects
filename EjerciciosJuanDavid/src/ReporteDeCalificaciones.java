import java.util.Scanner;
public class ReporteDeCalificaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, entradaChar;
        double calf1 = 0, calf2 = 0, calf3 = 0, promedio;
        char desea;
        int aprobado = 0,
        reprobado = 0;
        if (aprobado >= 70){
            promedio = (calf1 + calf2 + calf3) / 3;
        } else if(reprobado < 70);
        
                
        do{
            System.out.println("ingrese el nombre del estudiente: ");
            nombre = entrada.next();
            System.out.println("ingrese califiacion 1 :");
            calf1 = entrada.nextDouble();
            System.out.println("ingrese califiacion 2 :");
            calf2 = entrada.nextDouble();
            System.out.println("ingrese califiacion 3 :");
            calf3 = entrada.nextDouble();
            promedio = (calf1 + calf2 + calf3) / 3;
            System.out.println("deseas ingresar a otro estudiante:");
            entradaChar = entrada.next();
            desea = entradaChar.charAt(0);
            entrada.nextLine();
        }while( desea == 'S' || desea == 's');
      
        
              System.out.println(" el alumno(a) : " + nombre 
                                                + " su promedio es de" + promedio 
                                                +  " y su estado es: " + aprobado ); 
        
    }
}
