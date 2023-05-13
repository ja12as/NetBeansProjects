
package Algoritmos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class DivisionRestasSucesivas {
public static void main(String[] args){   
BufferedReader  bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
int dividendo = 0;
int divisor = 1;
int cosiente;
int resto;
try{
    System.out.println("introducir dividiendo");
    dividendo = Integer.parseInt(bufferedReader.readLine());
    System.out.println("introducir divisor");
    divisor = Integer.parseInt(bufferedReader.readLine());
}catch(Exception excepcion)
{System.out.println(excepcion.getMessage());
}
cosiente = 0;
while (dividendo >= divisor)
{
    dividendo -= divisor;
    cosiente++;
}
resto= dividendo;
    System.out.println("el cosiente es : " + cosiente + " y el resto : " + resto);
}        
}