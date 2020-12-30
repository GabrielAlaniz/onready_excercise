package onready_trainee;

/**
 *
 * @author gabri
 */
public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected float precio;
    
    public Vehiculo(String marca, String modelo, float precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
}
