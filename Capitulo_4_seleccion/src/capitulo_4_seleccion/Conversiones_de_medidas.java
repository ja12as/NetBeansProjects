/*
Elabore un algoritmo que permita hacer conversiones de equivalencias de metros, yardas, pies y pulgadas.
Primero debe preguntar que desea convertir y debe indicar una de las medidas mencionadas. Por ejemplo; 
si escogió metros, debe solicitar y leer el número de metros a convertir, 
enseguida imprimir la equivalencia en pies, yardas y pulgadas, y asi, hará lo propio para cada una
de las medidas indicadas. Equivalencias:
1 pie = 12   pulgadas, 
1 yarda = 3 pies,
1 pulgada = 2.54 cm,
1 metro = 100  cm.
 */
package capitulo_4_seleccion;
import java.util.*;
public class Conversiones_de_medidas {
    int pies, yardas, pulgadas,metros, conversion, valor;
    Scanner lea;
    Conversiones_de_medidas()
    {
     pies=0; yardas=0; pulgadas=0; metros=0; conversion=0; valor =0;
     lea = new Scanner(System.in);
    }
    
    void Medidas()
    {
        
        System.out.println("1:metros");
        System.out.println("2:yardas");
        System.out.println("3:pies");
        System.out.println("4:pulgadas");
        System.out.println("ingrese la medida para la convercion:");
        conversion=lea.nextInt();
        System.out.println("ingrese el valor de la medida");
        valor = lea.nextInt();
        
        switch(conversion)
                {
            case 1->  //metro
            {
              pulgadas = (int) ((valor * 100)/2.54);
              pies = pulgadas/12;
              yardas = pies/3;
                System.out.println("los "+ valor+ " metros equvalen a " + pulgadas+ " pulgadas");
                System.out.println("los "+ valor+ " metros equvalen a " + pies+ " pies");
                System.out.println("los "+ valor+ " metros equvalen a " + yardas+ " yardas");
            }
            
            case 2->  //yarda
            {
              pies = valor * 3;
              pulgadas = pies * 12;
              metros = (int) ((pulgadas * 2.54) / 100);    
              System.out.println("los "+ valor+ " yardas equvalen a " + pies+ " pies");
              System.out.println("los "+ valor+ " yardas equvalen a " + pulgadas+ " pulgadas");
              System.out.println("los "+ valor+ " yardas equvalen a " + metros+ " metros");
              
            }
            
            case 3-> // pies 
            {
               pulgadas = valor * 12;
               yardas = valor/3;          
               metros = (int) ((pulgadas * 2.54) / 100); 
               System.out.println("los "+ valor+ " pies equvalen a " + pulgadas+ " pulgadas");
               System.out.println("los "+ valor+ " pies equvalen a " + yardas+ " yardas");
               System.out.println("los "+ valor+ " pies equvalen a " + metros+ " metros");
            }
            
            case 4->  //pulgada
            {
               pies = valor/12;
               yardas = pies/3;          
               metros = (int) ((valor * 2.54) / 100); 
               System.out.println("los "+ valor+ " pulgadas equvalen a " + pies+ " pies");
               System.out.println("los "+ valor+ " pulgadas equvalen a " + yardas+ " yardas");
               System.out.println("los "+ valor+ " pulgadas equvalen a " + metros+ " metros");
            }
                }
    }
}
