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
    public String atacarPlacaje() {
        return "Soy Squirtle y voy a atacar con placaje";
    }

    @Override
    public String atacarAraniazo() {
        return "Soy Squirtle y voy a atacar con araniazo";
    }

    @Override
    public String atacarMordizco() {
        return "Soy Squirtle y voy a atacar con mordizco";
    }

    @Override
    public String atacarHidroBomba() {
        return "Soy Squirtle y voy a atacar con hidro bomba";
    }

    @Override
    public String atacarPistsAgua() {
        return "Soy Squirtle y voy a atacar con pistola de agua";
    }

    @Override
    public String atacarBurbuja() {
        return "Soy Squirtle y voy a atacar con burbuja";
    }

    @Override
    public String atacarHidroPulso() {
        return "Soy Squirtle y voy a atacar con hidro pulso";
    }
    
}
