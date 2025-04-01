package autonoma.aplicacionpokemon.models;

import autonoma.aplicacionpokemon.views.IAgua;

/**
 *
 * @author Santiago Castro Marles
 */

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Squirtle y voy a atacar con placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Soy Squirtle y voy a atacar con araniazo");
    }

    @Override
    public void atacarMordizco() {
        System.out.println("Soy Squirtle y voy a atacar con mordizco");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Soy Squirtle y voy a atacar con hidro bomba");
    }

    @Override
    public void atacarPistsAgua() {
        System.out.println("Soy Squirtle y voy a atacar con pistola de agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y voy a atacar con burbujas");
    }

    @Override
    public void atacarHidroPulso() {
        System.out.println("Soy Squirtle y voy a atacar con hidro pulso");
    }
    
}
