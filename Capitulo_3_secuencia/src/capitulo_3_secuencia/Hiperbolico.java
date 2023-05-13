/*
Elaborar un algoritmo que permita leer un valor e imprima el seno hiperbólico, coseno hiperbólico y tangente hiperbólica.

                    1
Seno Hiperbólico = ─── ((Exp(Angulo)-Exp(-Angulo))
                    2

                      1
Coseno Hiperbólico = ──- ((Exp(Angulo)+Exp(-Angulo))
                      2

                        Seno Hiperbólico
Tangente Hiperbólica = ───────────────
                       Coseno Hiperbólico

 */
package capitulo_3_secuencia;

import java.util.*;
public class Hiperbolico {
    int senhip, coship, tanhip, valor;
    Scanner lea;
    
    Hiperbolico ()
    {
         senhip=0; coship=0; tanhip=0;valor =0;
         lea = new Scanner(System.in);
    }
    
    void hiper()
    {
        System.out.println("ingrese el valor");
        valor = lea.nextInt();
        
       senhip = (int) ((1/2) * ((Math.exp(valor) - Math.exp(-valor))));
       coship = (int) ((1/2) * ((Math.exp(valor) + Math.exp(-valor)))); 
       tanhip = senhip / coship;
       
        System.out.println("el seno hiperbolico es de: "+ senhip);
        System.out.println("el seno hiperbolico es de: "+ coship);
        System.out.println("el seno hiperbolico es de: "+ tanhip);
    }
}
