package autonoma.aplicacionpokemon.models;

import autonoma.aplicacionpokemon.views.IFuego;

/**
 *
 * @author Santiago Castro Marles
 */

public class Charmander extends Pokemon implements IFuego{

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Charmander y voy a atacar con placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Soy Charmander y voy a atacar con araniazo");
    }

    @Override
    public void atacarMordizco() {
        System.out.println("Soy Charmander y voy a atacar con mordizco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy Charmander y voy a atacar con punio ");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmander y voy a atacar con ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy Charmander y voy a atacar con lanza llamas");
    }
    
}
