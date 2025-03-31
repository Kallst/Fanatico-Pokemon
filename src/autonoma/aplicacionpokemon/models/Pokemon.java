package autonoma.aplicacionpokemon.models;

/**
 *
 * @author LAPTOP
 */
public abstract class Pokemon {
    
    protected int numPokedex;
    protected String nombre;
    protected float peso;
    protected int temporada;
    
    public abstract void atacarPlacaje();
    public abstract void atacarAraniazo();
    public abstract void atacarMordizco();
}
