package onready_trainee;

/**
 *
 * @author gabri
 */
public class Auto extends Vehiculo {
    private int puertas;
    
    public Auto(String marca, String modelo, float precio, int puertas){
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    
}
