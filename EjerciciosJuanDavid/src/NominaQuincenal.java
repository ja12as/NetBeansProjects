import java.util.Scanner;
public class NominaQuincenal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            String nombre, entradaChar;
            double sueldoBruto, antiguedad, sueldoQuin, impuesto = 0, sueldoNeto;
            char desea;
            
        
           
             do{
                 System.out.println("ingrese el nombre del empleado");
                 nombre = entrada.next();
                 System.out.println("ingrese el sueldo quincenal:");
                 sueldoQuin = entrada.nextDouble();
                 System.out.println("ingrese su antiguedad:");
                 antiguedad = entrada.nextDouble();
                 sueldoBruto = (sueldoQuin /2) + antiguedad;
                 
                 System.out.println("desea ingresar otra quincena:");
                 entradaChar = entrada.next();
                 desea = entradaChar.charAt(0);
                 entrada.nextLine();
                        
              }while (desea == 'S' || desea == 's');
             System.out.println("el sueldo bruto de: " + nombre + " es de: " 
                                   +  sueldoBruto);                                                         
             }       
}
