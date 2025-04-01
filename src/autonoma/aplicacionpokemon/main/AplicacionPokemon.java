package autonoma.aplicacionpokemon.main;
import autonoma.aplicacionpokemon.models.Bulbasur;
import autonoma.aplicacionpokemon.models.Charmander;
import autonoma.aplicacionpokemon.models.Pikachu;
import autonoma.aplicacionpokemon.models.Squirtle;

/**
 *
 * @author Santiago Castro Marles
 */

public class AplicacionPokemon {

    public static void main(String[] args) {
        
        Bulbasur bulba = new Bulbasur();
        Charmander charma = new Charmander();
        Pikachu pika = new Pikachu ();
        Squirtle squirt = new Squirtle();
        
        bulba.atacarAraniazo();
        bulba.atacarDrenaje();
        bulba.atacarHojaAfilada();
        bulba.atacarLatigoCepa();
        bulba.atacarMordizco();
        bulba.atacarParalizar();
        bulba.atacarPlacaje();
        
        
        pika.atacarAraniazo();
        pika.atacarImpactrueno();
        pika.atacarMordizco();
        pika.atacarPlacaje();
        pika.atacarPunioTrueno();
        pika.atacarRayo();
        pika.atacarRayoCarga();
        
        bulba.atacarAraniazo();
        bulba.atacarDrenaje();
        bulba.atacarHojaAfilada();
        bulba.atacarLatigoCepa();
        bulba.atacarMordizco();
        bulba.atacarParalizar();
        bulba.atacarPlacaje();
        
        charma.atacarAraniazo();
        charma.atacarAscuas();
        charma.atacarLanzallamas();
        charma.atacarMordizco();
        charma.atacarPlacaje();
        charma.atacarPunioFuego();
        
        squirt.atacarAraniazo();
        squirt.atacarBurbuja();
        squirt.atacarHidroBomba();
        squirt.atacarHidroPulso();
        squirt.atacarMordizco();
        squirt.atacarPistsAgua();
        squirt.atacarPlacaje();
        
        
    }
    
}
