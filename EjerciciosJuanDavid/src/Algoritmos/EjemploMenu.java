
package Algoritmos;
import java.io.BufferedReader;
import java.io.InputStreamReader; 
public class EjemploMenu {
public static void main(String[] args){ 
BufferedReader  bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
String opcion;
try{
    do{
        System.out.println("------Menu------");
        System.out.println("1.- Mantenimiento clientes");
        System.out.println("2.- Introduccion de facturas");
        System.out.println("3.- listado de facturas");
        System.out.println("4.- finalizar");
        System.out.println("introduzca numero opcion escogida: ");
        opcion = bufferedReader.readLine();
        switch(opcion)
        {
            case "1": System.out.println("Ejecuta mantenimiento de clientes");
            break;
            case "2": System.out.println("Ejecuta intruduccion de factura");
            break;
            case "3": System.out.println("Ejecuta listado de facturas");
            break;
            case "4": System.out.println(" ha optado por cerrar la aplicacion");
            System.exit(0);
            break;
        }
                
    }while(opcion.compareTo("4")!=0);
        
}catch(Exception excepcion)
{System.out.println(excepcion.getMessage());
}
}
}
