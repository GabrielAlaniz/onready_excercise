package onready_trainee;

/**
 *
 * @author gabri
 */
public class Moto extends Vehiculo {
    private String cilindrada;
    
    public Moto(String marca, String modelo, float precio, String cilindrada){
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    
}
