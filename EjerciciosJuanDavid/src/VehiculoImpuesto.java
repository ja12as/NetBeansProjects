import java.util.Scanner;
public class VehiculoImpuesto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String  entradaChar, marca, origen;
        char desea;
        double costo,
                impuesto = 0,
                precioVenta = 0,
                contadorVehiculos = 0,
                contAlemania = 0,
                contJapon = 0,
                contItalia = 0,
                contUsa = 0,
                totalCosto = 0,
                totalImpuesto = 0,
                totalPVentas = 0;
        do{
           contadorVehiculos++;
            System.out.println("ingrese marca del vehiculo ");
            marca = entrada.next();
            System.out.println("ingrese el origen del vehiculo");
            origen = entrada.next();
            System.out.println("ingrese el costo del vehiculo ");
            costo = entrada.nextDouble();
            totalCosto = totalCosto  + costo;
            switch (origen) {
                case "Alemania":
                    contAlemania++;
                    impuesto = costo * 0.2;
                    break;
                    case "Japon":
                    contJapon++;
                    impuesto = costo * 0.3;
                     break;
                    case "Italia":
                    contItalia++;
                    impuesto = costo * 0.15;
                     break;
                    case "Usa":
                    contUsa++;
                    impuesto = costo * 0.8;
            }
            totalImpuesto =   totalImpuesto + impuesto;
            precioVenta = costo + impuesto;
            totalPVentas =  totalPVentas  + precioVenta;
            System.out.println("deseas procesar otro vehiculo");
            entradaChar = entrada.next();
            desea = entradaChar.charAt(0);
            entrada.nextLine();
            
            } while (desea  == 'S'  ||  desea == 's');
        
        }
    }

