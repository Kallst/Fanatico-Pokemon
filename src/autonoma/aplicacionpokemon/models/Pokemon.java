package autonoma.aplicacionpokemon.models;

/**
 *
 * @author Santiago Castro Marles
 */

public abstract class Pokemon {
    
    /* Se crean los atributos de la clase Pokemon. Se colocan como tipo 
    protected para permitir que unicamente puedan ejecutarlo sus clases hijas */
    
    protected int numPokedex;
    protected String nombre;
    protected float peso;
    protected int temporada;
    
    // Se declaran los métodos abstractos que van a implementar las clases que hereden de Pokemon
    
    public abstract String atacarPlacaje();
    public abstract String atacarAraniazo();
    public abstract String atacarMordizco();
}
