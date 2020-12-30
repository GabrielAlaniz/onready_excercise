package onready_trainee;

import java.util.Collections;

/**
 *
 * @author gabri
 */
public class Main {
    
    public static void main(String[] args){
        Vehiculo v1 = new Auto("Peugeot", "206", 200000.00f, 4);
        Vehiculo v3 = new Auto("Peugeot", "208", 250000.00f, 4);
        Vehiculo v2 = new Moto("Honda", "Titan", 60000.00f, "125cc");
        Vehiculo v4 = new Moto("Yamaha", "YBR", 80500.50f, "160cc");

        ListaVehiculos lista = new ListaVehiculos();
        lista.addVehiculo(v1);
        lista.addVehiculo(v2);
        lista.addVehiculo(v3);
        lista.addVehiculo(v4);
               
        lista.muestraVehiculo();
        System.out.println("=============================");
        lista.vehiculoMasCaro();
        lista.vehiculoMasBarato();
        lista.vehiculoConY();
        System.out.println("=============================");
        Collections.sort(lista.getListado(), new ListaVehiculos());
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        for(Vehiculo l: lista.getListado()){
            System.out.println(l.marca + " " + l.modelo);
        }
    }
    
    
    
}
