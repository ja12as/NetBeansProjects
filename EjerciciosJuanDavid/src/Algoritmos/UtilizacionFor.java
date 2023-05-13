
package Algoritmos;
import java.io.BufferedReader;
import java.io.InputStreamReader; 
public class UtilizacionFor {
public static void main(String[] args){ 
BufferedReader  bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
String cadenaRepeticion ="s";
String cadenaAConvertir = "";
int numero;
int contador;
int acumulador;
try{
    for(contador =1, acumulador =0;(cadenaRepeticion.charAt(0)== 'S' || cadenaRepeticion.charAt(0)== 's') &&(contador <= 5); contador++)
    {
        System.out.println("Introduccir numero: ");
        cadenaAConvertir =bufferedReader.readLine();
        numero = Integer.parseInt(cadenaAConvertir);
        acumulador+=numero;
        System.out.println("Introducir otro numero (S/N : ");
        cadenaRepeticion = bufferedReader.readLine();
    }
    System.out.println("se a introduccido un valor de  " + (contador - 1)+ "  numeros");
    System.out.println("el valor acumulado de todos ellos es de : " + acumulador);
}catch (Exception excepcion)
{System.out.println(excepcion.getMessage());
}
}
}