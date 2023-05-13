
package capitulo_3_secuencia;

import java.util.*;
public class Capitulo_3_secuencia {


Capitulo_3_secuencia()
{
    n_pregunta = 0;
    lea = new Scanner(System.in);
}    
    double n_pregunta;
    Scanner lea;
    
    public static void main(String[] args) {
     Capitulo_3_secuencia np = new Capitulo_3_secuencia();
     System.out.println("ingrese el numero de la pregunta que desea realizar");
     np.n_pregunta= (int)np.lea.nextDouble();
       
       if(np.n_pregunta==1)
       {
           Hipotenusa h=new Hipotenusa();
           h.triangulo_rectangulo();
       }
        
       if(np.n_pregunta ==2)
       {
           Temperatura t= new Temperatura();
           t.Temperartura_en_grados();
       }
       
       if(np.n_pregunta ==3)
       {
            angulo1 a = new  angulo1();
            a.Triangulo_180();
       }
       
       if(np.n_pregunta==4)
       {
           Cateto_b b = new Cateto_b();
           b.cateto();
       }
       
       if(np.n_pregunta==5)
       {
           Volumen_de_cilindro vc = new Volumen_de_cilindro();
           vc.volumen();
       }
       
       if(np.n_pregunta==6)
       {
           Hiperbolico h = new Hiperbolico();
           h.hiper();
       }
       if(np.n_pregunta==7)
       {
           Angulo_en_grados ag =new Angulo_en_grados();
           ag.seno_coseno();
       }
    }//cierra metodo
    
}// cierra la clase
