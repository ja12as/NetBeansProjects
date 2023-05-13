
package actividad;

import java.util.*;
public class Actividad {
double num_pregunta;
Scanner lea;
    Actividad()
    {
        double num_pregunta = 0;
        lea =  new Scanner(System.in);
    }
    public static void main(String[] args) {
    Actividad a = new Actividad();
        System.out.println("ingrese el numero de la preugunta que dese realizar:");
    a.num_pregunta = (int) a.lea.nextDouble();
    
    if(a.num_pregunta==1)
       {
           Conpras_de_llantas cdl = new Conpras_de_llantas();
           cdl.valor_a_pagar();
       }
    
    if(a.num_pregunta==2)
    {
        Determinar_numero dn = new Determinar_numero();
        dn.numero();
    }
    
    if(a.num_pregunta==3)
    {
        Generar_factura gf = new Generar_factura();
        gf.factura();
    }
    
    if(a.num_pregunta==4)
    {
        Mayor_de_dos_numeros mddm = new Mayor_de_dos_numeros();
        mddm.numero();
    }
    
    if(a.num_pregunta==5)
    {
        Tiquete_de td=new Tiquete_de();
        td.tiquete();
    }
    
    if(a.num_pregunta==6)
    {
        entrada_cine ec =new entrada_cine();
        ec.cine();
    }
    
    if(a.num_pregunta==7)
    {
        salario_neto_semanal sns = new salario_neto_semanal();
        sns.salario();
    }
    
    if(a.num_pregunta==8)
    {
        Temperatura_del_dia tdd = new Temperatura_del_dia();
        tdd.temperatura();
    }
    
    if(a.num_pregunta==9)
    {
        Llamada_telefonica lf= new Llamada_telefonica();
        lf.llamada();
    }
     
    if(a.num_pregunta==10)
    {
        Tres_numeros tn= new Tres_numeros();
        tn.suma();
    }
      
    if(a.num_pregunta==11)
    {
        Compra_prenda_promocion cpp = new Compra_prenda_promocion();
        cpp.compra_prenda();
    }
       
    if(a.num_pregunta==12)
    {
        Pago_servicios_ ps = new Pago_servicios_();
        ps.servicios();
    }
        
    if(a.num_pregunta==13)
    {
        Valor_unitario_venta_producto_cantidad vuvpc=  new Valor_unitario_venta_producto_cantidad();
        vuvpc.venta_producto();
    }
         
    if(a.num_pregunta==14)
    {
        Campaña_fidelizacion_cliente cfc = new Campaña_fidelizacion_cliente();
        cfc.compra_realizada();
    }
          
    if(a.num_pregunta==15)
    {
        Calcular_entrada_concierto_precio cecp= new Calcular_entrada_concierto_precio();
        cecp.entrada_concierto();
    }
           
    if(a.num_pregunta==16)
    {
        Empresa_comprar_producto_fabricante ecpf = new Empresa_comprar_producto_fabricante();
        ecpf.comprar_fabricante();
    }
            
    if(a.num_pregunta==17)
    {
        Numero_par_impar npi= new Numero_par_impar();
        npi.numero();
    }
             
    if(a.num_pregunta==18)
    {
        Institucion_pago_por_curso ippc = new Institucion_pago_por_curso();
        ippc.desaprobados();
    }
              
    if(a.num_pregunta==19)
    {
        Edad_mayor_menor emm = new Edad_mayor_menor();
        emm.edad();
    }
               
    if(a.num_pregunta==20)
    {
        Tienda_descuento_cliente_dependiendo_monto tdcdm = new Tienda_descuento_cliente_dependiendo_monto();
        tdcdm.descuento();
    }
    
    if(a.num_pregunta==21)
    {
        Ahorro_dinero_banco adb = new Ahorro_dinero_banco();
        adb.intereses();
    }
     
    if(a.num_pregunta==22)
    {
        Letra_consonante ls= new Letra_consonante();
        ls.vocal_consonate();
    }
     
    if(a.num_pregunta==23)
    {
        Nota_aprobado_reprobaado nar = new Nota_aprobado_reprobaado();
        nar.promedio();
    }
     
    if(a.num_pregunta==24)
    {
        Sueldo_trabajador_horas_extras sthe = new  Sueldo_trabajador_horas_extras();
        sthe.horas_extras();

    }
     
    if(a.num_pregunta==25)
    {
        division_del_mayor_menor ddmm= new  division_del_mayor_menor();
        ddmm.division();
    }
     
    if(a.num_pregunta==26)
    {
        Aumento_sueldo_trabajador ast = new    Aumento_sueldo_trabajador();
        ast.sueldo_final();

    }
     
    if(a.num_pregunta==27)
    {
        Descuento_supermercado_bolita dsb=new Descuento_supermercado_bolita();
        dsb.al_azar();
    }
     
    if(a.num_pregunta==28)
    {
        Determinar_punto_circuferencia_centro_radio dpccr = new Determinar_punto_circuferencia_centro_radio();
        dpccr.centro_redio();
    }
     
    if(a.num_pregunta==29)
    {
        Numero_denominado nd =new Numero_denominado();
        nd.division();
    }
     
    if(a.num_pregunta==30)
    {
        Ecuacion_grado eg = new Ecuacion_grado();
        eg.coeficientes();
    }
     
    if(a.num_pregunta==31)
    {
        
    }
     
    if(a.num_pregunta==32)
    {
        
    }
     
    
     
     
    }// cierra metodo
    
}// cierra clase
