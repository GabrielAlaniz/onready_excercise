package onready_trainee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author gabri
 */
public class ListaVehiculos implements Comparator {
    private List<Vehiculo> listado;

    public ListaVehiculos() {
        this.listado = new ArrayList<>();
    }
    
    

    public List<Vehiculo> getListado() {
        return listado;
    }

    public void setListado(List<Vehiculo> listado) {
        this.listado = listado;
    }
    
    public void addVehiculo(Vehiculo vehiculo){
        this.listado.add(vehiculo);
    }
    
    public void muestraVehiculo(){
        
        for (Iterator<Vehiculo> it = listado.iterator(); it.hasNext();) {
            Vehiculo l = it.next();
            if(l instanceof Auto){
                Auto auto = (Auto) l;
                System.out.println("Marca: "+l.marca+" // Modelo: "+l.modelo+" {} // Puertas: "+((Auto) l).getPuertas()+" // Precio: $"+l.precio );
            }
            else if(l instanceof Moto){
                System.out.println("Marca: "+l.marca+" // Modelo: "+l.modelo+" // Cilindrada: "+((Moto) l).getCilindrada()+" // Precio: $"+l.precio);
            }
        }
        
    }  
    
    public void vehiculoMasCaro(){
        float masCaro = listado.get(0).precio;
        String marca="", modelo="";
        for (Vehiculo l : listado) {
            if(l.precio > masCaro){
                masCaro = l.precio;
                marca = l.marca;
                modelo = l.modelo;
            }
        }
        System.out.println("Vehiculo más caro: "+marca+" "+modelo);
    }
    
    public void vehiculoMasBarato(){
        float masBarato = listado.get(0).precio;
        String marca="", modelo="";
        for (Vehiculo l : listado) {
            if(l.precio < masBarato){
                masBarato = l.precio;
                marca = l.marca;
                modelo = l.modelo;
            }
        }
        System.out.println("Vehiculo más barato: "+marca+" "+modelo);
    }
    
    public void vehiculoConY(){
        for (Vehiculo l : listado) {
            if(l.modelo.toLowerCase().contains("y")){
                System.out.println("Vehiculo que contiene en el modelo la letra 'Y': "+l.marca+" "+l.modelo+" $"+l.precio);
            }
        }
    }

    @Override
    public int compare(Object o1, Object o2) {
        Vehiculo v1 = (Vehiculo) o1;
        Vehiculo v2 = (Vehiculo) o2;
        return (int) (v2.precio - v1.precio);
    }
    
    

    

    
    
    

    
    
}
