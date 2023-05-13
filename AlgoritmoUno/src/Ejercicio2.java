import java.util.*;
public class Ejercicio2 {
    public static void main(String[] args) {
        //creacion de un objeto y se lo asocio a una variable
        Scanner DatosDeEntrada = new Scanner(System.in);
        //declaracion de variable de entrada
        double numero1, numero2;
        //declaracion  de variabler de resultado
        double suma, resta, multiplicacion, division;
             //solicitar datos de entrada
        System.out.println("por favor dijite el numero 1:");
        numero1 = DatosDeEntrada.nextDouble();
        System.out.println("por favor dijite el numero 2:");
        numero2 = DatosDeEntrada.nextDouble();
        //dotos de proceso
        suma= numero1 + numero2;
        resta = numero1 -numero2;
        multiplicacion = numero1 + numero2;
        division = numero1 + numero2;
        //dotos de salida
        System.out.println("el resultado de la suma es: " + suma);
        System.out.println("el resultado de la resta es: " + resta);
        System.out.println("el resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("el resultado de la division es: " + division);
        
        
        
    }
   
}
