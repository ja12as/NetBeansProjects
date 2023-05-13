
package Algoritmos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class DesgloseMoneda5 {
public static void main(String[] args){   
BufferedReader  bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
int [] importeBilletesMonedas = {50, 20, 10, 5, 2, 1};
int []numeroUnidades = new int[6];
int importe =0;
try{
    System.out.println("Introducir importe a desglosar en billetes y monedas numero 4:  ");
    importe = Integer.parseInt(bufferedReader.readLine());
}catch (Exception excepcion)
{ System.out.println(excepcion.getMessage());
}
for (int i = 0; i <= 5; i++)
{
    numeroUnidades[i] =0;
    if(importe >= importeBilletesMonedas[i])
    {
        numeroUnidades[i]= importe/ importeBilletesMonedas[i];
        importe%= (numeroUnidades[i] * importeBilletesMonedas[i]);
    }
    System.out.println("despues de aplicar el desglose de billetes de " 
    + importeBilletesMonedas[i]+ " , obtenemos " + numeroUnidades[i]+
    " billetes de " + importeBilletesMonedas[i] + " queda pendiente de desglosar " + importe  );
}
}
}
