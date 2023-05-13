
package capitulo_4_seleccion;

import java.util.Scanner;
public class Capitulo_4_seleccion {
    int numero;
    Scanner lea;
    Capitulo_4_seleccion()
    {
        numero =0; 
        lea = new Scanner(System.in);
    }
    public static void main(String[] args) {
       Capitulo_4_seleccion cs = new Capitulo_4_seleccion();
        System.out.println("ingrese el numero del ejercicio");
        cs.numero = cs.lea.nextInt();
        
        if(cs.numero==1)
        {
            Angulo_A_B ab = new Angulo_A_B();
            ab.Tangulo();
        }
        
        if(cs.numero==2)
        {
            Angulo_grados ag = new Angulo_grados();
            ag.grados();
        }
        
        if(cs.numero==3)
        {
            Angulo_radianes_grados ard = new Angulo_radianes_grados();
            ard.angulo_rad_gra();
        }
        
        if(cs.numero==4)
        {
            Coeficientes c = new Coeficientes();
            c.abc();
        }
        
        if(cs.numero==5)
        {
            Conversiones_de_medidas cm = new Conversiones_de_medidas();
            cm.Medidas();
        }
        
        if(cs.numero==6)
        {
            Fuerza_maza_aceleracion fma = new Fuerza_maza_aceleracion();
            fma.fma();
        }
        
        if (cs.numero==7)
        {
            Numero_mayor nm= new Numero_mayor();
            nm.cuatro();
        }
        if(cs.numero==8)
        {
            Triangulos t = new Triangulos();
            t.clasificacion();
        }
    }
    
}
