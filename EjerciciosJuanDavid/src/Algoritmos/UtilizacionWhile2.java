
package Algoritmos;
public class UtilizacionWhile2 {
public static void main(String[] args){
    int contadorPares = 0;
    int acumuladorPares = 0;
    int contadorImpares = 0;
    int acumuladorImpares = 0;
    int i = 1;
    while(i<=50){
        if  (i%2 ==0)
        {
            contadorPares++;
            acumuladorPares+= i;
        }
        else{
            contadorImpares++;
            acumuladorImpares+=i;
        }
        i++;
        }
        System.out.println("se han procesado " + contadorPares + " numero pares, y su suma es " + acumuladorPares);    
        System.out.println("se han procesado " + contadorImpares + " numeros impares, y su suma es " + acumuladorImpares);
}    
}
