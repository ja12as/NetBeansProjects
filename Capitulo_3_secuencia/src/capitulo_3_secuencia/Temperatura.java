/*Elaborar un algoritmo que lea una temperatura en grados Fahrenheit e imprima su equivalente
en grados Celsius, Kelvin y Rankine. Para convertir a Celsius a la temperatura Fahrenheit se le resta 
32 y se multiplica por 5/9. Para convertir a Kelvin,
se le suma 273 a los grados Celsius. Para convertir a Rankine a los grados Fahrenheit se le suma 460.*/
package capitulo_3_secuencia;
import java.util.*;
public class Temperatura {
   double Celsius, Kelvin, Rankine, Fahrenheit;
   int temperatura, valor;
   Scanner lea;
   
   Temperatura()
   {
       Celsius = 0; Kelvin = 0; Rankine = 0; Fahrenheit = 0; temperatura=0; valor =0;
       lea = new Scanner(System.in);
   }
   
   void Temperartura_en_grados()
   {
       System.out.println("1-Fahrenheit");
       System.out.println("2-Celsius");
       System.out.println("3-Kelvin");
       System.out.println("4-Rankine");
       System.out.println("ingrese la temperatura que dese convertir:");
       temperatura=lea.nextInt();
       
       System.out.println("ingrese el valor de "+ temperatura);
       valor =lea.nextInt();
       
        switch(temperatura){
             case 1 -> {//-Fahrenheit
                  Celsius=(5/9)*valor -32;
                  Kelvin= (5/9)*(valor-32)+273.15;
                  Rankine= valor-459.67;
                  System.out.println("los " +valor+" grados Fahrenheit combertidos a Celsius es de: "+ Celsius );
                  System.out.println("los " +valor+" grados Fahrenheit combertidos a Celsius es de: "+ Kelvin);
                  System.out.println("los " +valor+" grados Fahrenheit combertidos a Celsius es de: "+Rankine);
             }
             
             case 2 -> {//Celsius
                  Kelvin= valor+273.15;
                  Rankine= 1.8*valor+491.67;
                  Fahrenheit= (valor *1.8)+32;
                  System.out.println("los " +valor+" grados Celsius combertidos a Celsius es de: "+ Kelvin );
                  System.out.println("los " +valor+" grados Celsius combertidos a Celsius es de: "+  Rankine );
                  System.out.println("los " +valor+" grados Celsius combertidos a Celsius es de: "+  Fahrenheit);
             }
             case 3 -> {//Kelvin
                 Celsius=valor-273.15;
                 Rankine= 1.8*(valor-273.15)-491.67;
                 Fahrenheit=valor-459.67;
                 System.out.println("los " +valor+" grados Kelvin combertidos a Celsius es de: "+ Celsius );
                 System.out.println("los " +valor+" grados Kelvin combertidos a Celsius es de: "+  Rankine);
                 System.out.println("los " +valor+" grados Kelvin combertidos a Celsius es de: "+  Fahrenheit);
             }
             case 4 -> {//   Rankine
                 Celsius=(valor/1.8)-273.15;
                 Kelvin=(5/9)*(valor-491.67)+273.15;
                 Fahrenheit=valor+459.67;
                 System.out.println("los " +valor+" grados Rankine combertidos a Celsius es de: "+ Celsius );
                 System.out.println("los " +valor+" grados Rankine combertidos a Celsius es de: "+  Kelvin);
                 System.out.println("los " +valor+" grados Rankine combertidos a Celsius es de: "+  Fahrenheit);
             }
             
             
   }// sierre del switch
        
        
}//cierre del void
}//cierre de la clase