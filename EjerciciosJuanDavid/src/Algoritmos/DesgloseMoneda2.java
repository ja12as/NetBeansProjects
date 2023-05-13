
package Algoritmos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class DesgloseMoneda2 {
public static void main(String[] args){   
BufferedReader  bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
int importe = 0;
int numeroBilletes50 = 0;
int numeroBilletes20 = 0;
int numeroBilletes10 = 0;
int numeroBilletes5 = 0;
int numeroMonedas2 = 0;
int numeroMonedas1;
int numeroUnidades = 0;
try{
    System.out.println("Introducir importe a desglosar en billetes y monedas:  ");
    importe = Integer.parseInt(bufferedReader.readLine());
}catch (Exception excepcion)
{ System.out.println(excepcion.getMessage());
}
for(int i= 1; i <= 6; i++)
{
    int importeBilletesMonedas = 0;
    switch (i)
    {
        case 1: importeBilletesMonedas = 50;
        break;
        case 2: numeroBilletes50 = numeroUnidades;
                 System.out.println(" despues de aplicar el desglose de billetes de 50 , obtenemos = " + numeroBilletes50 + 
            " billetes de 50. queda pendiente de desglosar = " + importe);
                 importeBilletesMonedas = 20;
                 break;
                 
        case 3: numeroBilletes20 = numeroUnidades;
                 System.out.println(" despues de aplicar el desglose de billetes de 20 , obtenemos = " + numeroBilletes20 + 
            " billetes de 20. queda pendiente de desglosar = " + importe);
                 importeBilletesMonedas = 10;
                 break; 
                 
        case 4: numeroBilletes10 = numeroUnidades;
                 System.out.println(" despues de aplicar el desglose de billetes de 10 , obtenemos = " + numeroBilletes10 + 
            " billetes de 10. queda pendiente de desglosar = " + importe);
                 importeBilletesMonedas = 5;
                 break;  
                 
        case 5: numeroBilletes5 = numeroUnidades;
                 System.out.println(" despues de aplicar el desglose de billetes de 5 , obtenemos = " + numeroBilletes5 + 
            " billetes de 5. queda pendiente de desglosar = " + importe);
                 importeBilletesMonedas = 2;
                 break;
                 
        case 6: numeroMonedas2 = numeroUnidades;
                 System.out.println(" despues de aplicar el desglose de monedas de 2 , obtenemos = " + numeroMonedas2 + 
            " monedas de 2. queda pendiente de desglosar = " + importe);
                 importeBilletesMonedas = 1;
                 break;   
    }
    numeroUnidades =0;
    if (importe >= importeBilletesMonedas)
    {
       numeroUnidades = importe / importeBilletesMonedas;
       importe%= (numeroUnidades * importeBilletesMonedas);
    }
    }
    numeroMonedas1 = numeroUnidades;
    System.out.println("obtenemos tambien " + numeroMonedas1+ " monedas de 1");
}
}

