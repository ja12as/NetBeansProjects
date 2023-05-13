
package Algoritmos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class DesgloseMoneda4 {
public static void main(String[] args){   
BufferedReader  bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
int importe = 0;
int numeroBilletes50 = 0;
int numeroBilletes20 = 0;
int numeroBilletes10 = 0;
int numeroBilletes5 = 0;
int numeroMonedas2 = 0;
int numeroMonedas1;
try{
    System.out.println("Introducir importe a desglosar en billetes y monedas numero 4:  ");
    importe = Integer.parseInt(bufferedReader.readLine());
}catch (Exception excepcion)
{ System.out.println(excepcion.getMessage());
}
Integer[] aglutinaInteger = new Integer[1];
aglutinaInteger[0] = new Integer(importe);
for(int i= 1; i <= 6; i++)
{
    switch(i)
    {
        case 1: numeroBilletes50 = desglosar(50, aglutinaInteger);
            System.out.println("despues de aplicar el desglose de billetes de 50, obtenemos " + numeroBilletes50 +
                    " billetes de 50. queda pendiente de desglosar " + aglutinaInteger[0].intValue());
        break;  
        
         case 2: numeroBilletes20 = desglosar(20, aglutinaInteger);
            System.out.println("despues de aplicar el desglose de billetes de 20, obtenemos " + numeroBilletes20 +
                    " billetes de 20. queda pendiente de desglosar " + aglutinaInteger[0].intValue());
        break;
        
         case 3: numeroBilletes10 = desglosar(10, aglutinaInteger);
            System.out.println("despues de aplicar el desglose de billetes de 10, obtenemos " + numeroBilletes10 +
                    " billetes de 10. queda pendiente de desglosar " + aglutinaInteger[0].intValue());
        break;
        
         case 4: numeroBilletes5 = desglosar(5, aglutinaInteger);
            System.out.println("despues de aplicar el desglose de billetes de 5, obtenemos " + numeroBilletes5 +
                    " billetes de 5. queda pendiente de desglosar " + aglutinaInteger[0].intValue());
        break;
        
         case 5: numeroMonedas2 = desglosar(2, aglutinaInteger);
            System.out.println("despues de aplicar el desglose de monedas de 2, obtenemos " + numeroMonedas2 +
                    " monedas de 2. queda pendiente de desglosar " + aglutinaInteger[0].intValue());
        break;
        
         case 6: numeroMonedas1 = aglutinaInteger[0].intValue();
         System.out.println("obtenemos tambien " + numeroMonedas1+ " monedas de 1");
        break;
    }
    }
    }

    private static int desglosar(int importeBilletesMonedas, Integer[] aglutinaInteger) {
    int numeroUnidades =0;
    int importe = aglutinaInteger[0].intValue();
    if(importe >= importeBilletesMonedas)
    {
        numeroUnidades = importe / importeBilletesMonedas;
        importe%= (numeroUnidades * importeBilletesMonedas);
        aglutinaInteger[0] = new Integer (importe);
    }
       return numeroUnidades;
    }
}
