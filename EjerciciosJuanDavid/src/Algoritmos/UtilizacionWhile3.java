
package Algoritmos;
import java.io.BufferedReader;
import java.io.InputStreamReader;    
public class UtilizacionWhile3 {
public static void main(String[] args){ 
BufferedReader  bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
String cadenaRepeticion, cadenaAConvertir;
int numero;
int contador =0;
int acumulador =0;
try{
    do{
        System.out.println("introducir numero : ");
        cadenaAConvertir = bufferedReader.readLine();
        numero = Integer.parseInt(bufferedReader.readLine());
        contador++;
        acumulador+=numero;
        System.out.println("introducir otro numero (S/N : ");
        cadenaRepeticion = bufferedReader.readLine();
    }while((cadenaRepeticion.charAt(0)== 's' || cadenaRepeticion.charAt(0) == 'S' ) && ((contador+1)<=5));
        System.out.println("se a introducido un total de " + contador + " numero");
        System.out.println("el valor acumulado de todos ello es de: " + acumulador);
      
}catch (Exception excepcion)
{System.out.println(excepcion.getMessage());
}
}
}