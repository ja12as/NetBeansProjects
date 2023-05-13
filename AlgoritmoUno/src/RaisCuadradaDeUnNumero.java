


import java.util.*;
public class RaisCuadradaDeUnNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double numero, raizcuadrada;
        
        System.out.println("ingrese un numero: ");
        numero = entrada.nextDouble();
        raizcuadrada = Math.sqrt(numero);
        System.out.println("la rais cuadrada de " + numero + " es " + raizcuadrada);
        
    }
    
}
