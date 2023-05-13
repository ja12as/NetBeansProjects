import java.util.*;
public class CalcularPromedioDeUnAlumno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombreAlumno;
        double calif1, calif2, calif3, calif4, promedio;
        System.out.println("ingrese el nombre del alumno");
        nombreAlumno = entrada.next();
        System.out.println("ingrese calificacion 1");
        calif1 = entrada.nextDouble();
        System.out.println("ingrese calificacion 2");
        calif2 = entrada.nextDouble();
        System.out.println("ingrese calificacion 3");
        calif3 = entrada.nextDouble();
        System.out.println("ingrese calificacion 4");
        calif4 = entrada.nextDouble();
        promedio = (calif1 + calif2 + calif3 + calif4)/4;
        System.out.println("el alumno" + nombreAlumno
                                       + "tiene promedio"  
                                       +promedio);
        
      
    }
}
