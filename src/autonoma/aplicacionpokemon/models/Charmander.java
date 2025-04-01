package autonoma.aplicacionpokemon.models;

import autonoma.aplicacionpokemon.views.IFuego;

/**
 *
 * @author Santiago Castro Marles
 */

public class Charmander extends Pokemon implements IFuego{

    //Constructor de la clase Charmander
    public Charmander() {
    }

    // Se sobre escribe el metodo atacarPlacaje de la clase abstracta Pokemon
    @Override
    public String atacarPlacaje() {
        return "Soy Charmander y voy a atacar con placaje";
    }
    
    // Se sobre escribe el metodo atacarAraniazo de la clase abstracta Pokemon
    @Override
    public String atacarAraniazo() {
        return "Soy Charmander y voy a atacar con araniazo";
    }
    
    // Se sobre escribe el metodo atacarMordizco de la clase abstracta Pokemon
    @Override
    public String atacarMordizco() {
        return "Soy Charmander y voy a atacar con mordizco";
    }
    
    // Se sobre escribe el metodo atacarPunioFuego de la clase IFuego
    @Override
    public String atacarPunioFuego() {
        return "Soy Charmander y voy a atacar con punio ";
    }

    // Se sobre escribe el metodo atacarAscuas de la clase IFuego
    @Override
    public String atacarAscuas() {
        return "Soy Charmander y voy a atacar con ascuas";
        
    }

    @Override
    public String atacarLanzallamas() {
        return "Soy Charmander y voy a atacar con lanza llamas";
    }
    
}
