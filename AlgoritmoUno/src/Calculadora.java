
import java.awt.BorderLayout;
import java.sql.SQLOutput;
import java.util.*;
public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int opcion, val1, val2, suma, resta, multiplicacion, division;
        System.out.println("========================");
        System.out.println("                calcular");
        System.out.println("========================");
        System.out.println("  1 - SUMAR");
        System.out.println("  2 - RESTAR");
        System.out.println("  3 - MULTIPLICAR");
        System.out.println("  4 - DIVIDIR");
        System.out.println("========================");
        System.out.println("ingrese la opercion a realizar: ");
        opcion = entrada.nextInt();
        System.out.println("ingrese valor 1 ");
        val1 = entrada.nextInt();
        System.out.println("ingrese valor 2 ");
        val2 = entrada.nextInt();
        switch (opcion) {
            case 1:
                suma = val1 + val2;
                System.out.println("la suma es: " + suma);
                break;
            case 2:
                resta = val1 - val2;
                System.out.println("la resta es: " + resta);
                break;
            case 3:
                multiplicacion = val1 * val2;
                System.out.println("la multiplicacion es: " + multiplicacion);
                break;
            case 4:
                division = val1 / val2;
                System.out.println("la dinision es: " + division);
                break;
            default:
                break;
        }
        }
}
