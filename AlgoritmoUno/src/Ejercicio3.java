import java.util.Scanner;
public class Ejercicio3 {
 public static void main(String[] args) {
        //creacion de un objeto y se lo asocio a una variable
        Scanner DatosDeEntrada = new Scanner(System.in);
        //declaracion de variable de entrada
        double numero1, numero2;
        //declaracion  de variabler de resultado
        double potencia, radicacion, maximo, minimo;
             //solicitar datos de entrada
        System.out.println("por favor dijite el numero 1:");
        numero1 = DatosDeEntrada.nextDouble();
        System.out.println("por favor dijite el numero 2:");
        numero2 = DatosDeEntrada.nextDouble();
        //dotos de proceso
        potencia = Math.pow(numero1, numero2);
        radicacion = Math.sinh(numero1);
        maximo = Math.max(numero1, numero2);
        minimo = Math.min(numero1, numero2);
        //datos de salida
        System.out.println("la potencia es:" + potencia);
        System.out.println("la radicacion es:" + radicacion);
        System.out.println("el maximoes:" + maximo);
        System.out.println("el minimo es:" + minimo);
        
 }      
}
