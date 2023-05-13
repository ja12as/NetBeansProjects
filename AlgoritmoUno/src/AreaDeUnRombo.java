import java.util.*;
public class AreaDeUnRombo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double diag1, diag2, areaRombo;
        
        System.out.println("ingrese deiagonal 1: ");
        diag1 = entrada.nextDouble();
        System.out.println("ingrese diagonal 2: ");
        diag2 = entrada.nextByte();
        
        areaRombo = (diag1 * diag2)/2;
        
        System.out.println("el area del rombo es: " + areaRombo);
        
    }
    
}
