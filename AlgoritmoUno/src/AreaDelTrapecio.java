import java.util.*;
public class AreaDelTrapecio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double B, b, h, areaDelTrapecio;
        System.out.println("ingrese la base mayor");
        B = entrada.nextDouble();
        System.out.println("ingrese la base menor");
        b = entrada.nextDouble();
        System.out.println("ingrese la altura");
        h = entrada.nextDouble();
        areaDelTrapecio = ((B+b)*h)/2;
        System.out.println("el area del trapecio es: " + areaDelTrapecio);
              
        
        
                
                
    }
}
