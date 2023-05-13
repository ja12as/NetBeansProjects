
package Algoritmos;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Metodos_matematicos {
    public static void main(String[] args) {
     Scanner lea;
        System.out.println("POTENCIA = Math.pow(3,2): " + Math.pow(3,2));
        System.out.println("RAIZ CUADRADA = Math.sqrt(144): " + Math.sqrt(144));
        System.out.println("LOGARITMO DECIMAL = Math.log10(10000) " + Math.log10(10000));
        System.out.println("EL NUMERO E ELEVADO AL VALOR PROPORCIONADO = Math.exp(3): " + Math.exp(3));
        System.out.println("LOGARITMO NEPERIANO = Math.log(20.085536923187668): " + Math.log(20.085536923187668));    
        System.out.println("VALOR DE E: " + Math.E);    
        System.out.println("NUMERO ALEATORIO = Math.random(): " + Math.random()); 
        // PARA LA GENERACION DE NUMEROS ALEATORIOS, TAMBIEN SE PUEDE RECURRIR A LA CLASE = RANDOM
        System.out.println("VALOR ABSOLUTO = Math.abs.(-15): " + Math.abs(-15));    
        System.out.println("REDONDEO AL ENTERO MENOR MAS PROXIMO = Math.floor(53.8): " + Math.floor(53.8));    
        System.out.println("REDONDEO AL ENTERO MAYOR MAS PROXIMO = Math.ceil(53.8): " + Math.ceil(53.8));    
        System.out.println("REDONDEO AL ENTERO MAS PROXIMO = Math.round(53.2): " + Math.round(53.2));    
        System.out.println("REDONDEO AL ENTERO MAS PROXIMO = Math.round(53.8): " + Math.round(53.8));
        System.out.println("REDONDEO AL DOUBLE MAS PROXIMO = Math.rint(53.2): " +  Math.rint(53.2));    
        System.out.println("REDONDEO AL DOUBLE MAS PROXIMO =  Math.rint(53.8): " + Math.rint(53.8));    
        System.out.println("VALOR MAXIMO = Math.max(15.70): " + (int)Math.max(15,70));   
        System.out.println("VALOR MINIMO = Math.min(15.70): " + Math.min(15,70));
        System.out.println("VALOR DE PI: " + Math.PI);
        System.out.println("CONVERSION DE GRADOS SEXAGESIMALES A REDIANES = Math.toRadians(90): " + Math.toRadians(90));
        System.out.println("CONVERSIONES DE RADIANES A GRADOS SEXAGESIMALES = Math.toDegrees(1.5707963267948966): " + Math.toDegrees(1.5707963267948966));
        // en la obtencion de funciones  trigonometricas, el parametro se aporta expresando en radianes 
        System.out.println("SENO = Math.sin(Math.toRadians(90)): " + Math.sin(Math.toRadians(90)));
        System.out.println("ARCO SENO = Math.toDegrees(Math.asin(1)): " + Math.toDegrees(Math.asin(1)));
        System.out.println("COSENO = Math.cos(Math.toRadians(30)): " + Math.cos(Math.toRadians(30)));
        System.out.println("ARCO COSENO =  Math.toDegrees(Math.acos(0.8660254037844387)): " + Math.toDegrees(Math.acos(0.8660254037844387)));
        System.out.println("TANGENTE = Math.tan(Math.toRadians(45)): " + Math.tan(Math.toRadians(45)));
        System.out.println("ARCO TANGENTE = Math.toDegrees(Math.atan(1)): " + Math.toDegrees(Math.atan(1)));
    }
}
