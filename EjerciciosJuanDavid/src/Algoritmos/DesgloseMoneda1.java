
package Algoritmos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class DesgloseMoneda1 {
public static void main(String[] args){   
BufferedReader  bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
int importe = 0;
int numeroBilletes50 = 0;
int numeroBilletes20 = 0;
int numeroBilletes10 = 0;
int numeroBilletes5 = 0;
int numeroMonedas2 = 0;
int numeroMonedas1 = 0;
try{
    System.out.println("Introducir importe a desglosar en billetes y monedas:  ");
    importe = Integer.parseInt(bufferedReader.readLine());
}catch (Exception excepcion)
{ System.out.println(excepcion.getMessage());
}
if (importe >= 50)
{
    numeroBilletes50 = importe / 50;
    importe %= (numeroBilletes50 * 50);
}
    System.out.println(" despues de aplicar el desglose de billetes de 50 , obtenemos = " + numeroBilletes50 + 
            " billetes de 50. queda pendiente de desglosar = " + importe);
    
if (importe >= 20)
{
    numeroBilletes20 = importe / 20;
    importe%= (numeroBilletes20 * 20);
}
    System.out.println(" despues de aplicar el desglose de billetes de 20 , obtenemos = " + numeroBilletes20 + 
            " billetes de 20. queda pendiente de desglosar = " + importe);
    
if (importe >= 10)
{
    numeroBilletes10 = importe / 10;
    importe%= (numeroBilletes10 * 10);
}
    System.out.println(" despues de aplicar el desglose de billetes de 10 , obtenemos = " + numeroBilletes10 + 
            " billetes de 10. queda pendiente de desglosar = " + importe);   
    
if (importe >= 5)
{
    numeroBilletes5 = importe / 5;
    importe%= (numeroBilletes5 * 5);
}
    System.out.println(" despues de aplicar el desglose de billetes de 5 , obtenemos = " + numeroBilletes5 + 
            " billetes de 5. queda pendiente de desglosar = " + importe);    
    
if (importe >= 2)
{
    numeroMonedas2 = importe / 2;
    importe%= (numeroMonedas2 * 2);
}
    System.out.println(" despues de aplicar el desglose de monedas de 2 , obtenemos = " + numeroMonedas2 + 
            " monedas de 2. queda pendiente de desglosar = " + importe); 
    
numeroMonedas1 = importe;
    System.out.println("obtenemos tambien = " + numeroMonedas1+ " monedas de 1");
}
}