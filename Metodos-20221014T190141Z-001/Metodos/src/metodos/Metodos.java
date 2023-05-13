
package metodos;

public class Metodos {

    public static void main(String[] args) {
        // metodo con un solo parametro
       Metodoconparametros mp = new Metodoconparametros();
       mp.metodo_para("jose");
               
       // metodo con varios parametro donde se pide los datos personales
        Metodoconpara p = new    Metodoconpara(); 
       p.datos_personales("jose", "avendaño", "1082470826", "3218968857", 17);
       
       // metodo sin parametro y retorna un valor
       Metodosinparametroyconretorno msr = new Metodosinparametroyconretorno();
        System.out.println("la edad es: "+ msr.metodo_sin_p());
       // metodo con parametro y retorna un valor
       Metodoconparametroyretorna mcr = new Metodoconparametroyretorna();
        System.out.println("la respuesta de la suma es: " + mcr.metodo_con_parametro(10, 20));
    }
    
}
