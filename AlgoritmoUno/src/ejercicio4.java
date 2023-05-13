import java.util.Scanner;
public class ejercicio4 {
public static void main(String[] args) {
        //creacion de un objeto y se lo asocio a una variable
        Scanner DatosDeEntrada = new Scanner(System.in);
        //declaracion de variable de entrada
        double a, b, c, x;
        //declaracion  de variabler de resultado
        double potencia, raizcuadrada, multiplicacion, division, numerador, denominador;
             //solicitar datos de entrada
        System.out.println("por favor dijite el numero a:");
        a = DatosDeEntrada.nextDouble();
        System.out.println("por favor dijite el numero b:");
        b = DatosDeEntrada.nextDouble();
        System.out.println("por favor dijite el numero c:");
        c = DatosDeEntrada.nextDouble();
        System.out.println("por favor dijite el numero x:");
        x = DatosDeEntrada.nextDouble();
        //dotos de proceso 
        potencia = Math.pow(a,5);
        multiplicacion =  b * x;
        raizcuadrada = Math.sqrt(c);
        numerador = potencia + multiplicacion + raizcuadrada;
        denominador = 5 * (a * b * c);
        division = numerador / denominador;
        System.out.println("el resultado es" + division );
                
        
        
        
        
}   
}
