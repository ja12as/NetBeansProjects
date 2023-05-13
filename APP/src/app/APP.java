
package app;

import java.util.*;
public class APP {
//declaramos los objetos
    int v1, v2, res;
    Scanner capturar;
    
    //creamos el constructor crea los objetos e inicializa las variables.
    APP(){
        v1 = 0;
        v2 = 0;
        res = 0;
        capturar = new Scanner(System.in);
    } // cierre del constructor
            
    
    public static void main(String[] args) {
     APP nn=new APP();
        System.out.println("ingrese el primer numero");
        nn.v1 = nn.capturar.nextInt();
        System.out.println("ingrese el segundo numero");
        nn.v2 = nn.capturar.nextInt();
        nn.res= nn.v1 + nn.v2;
        System.out.println("la respuesta es : " + nn.res);
    } // cierre del main
    
} // cierre de la clase
