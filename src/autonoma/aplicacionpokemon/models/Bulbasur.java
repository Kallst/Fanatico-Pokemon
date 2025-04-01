package autonoma.aplicacionpokemon.models;

import autonoma.aplicacionpokemon.views.IPlanta;

/**
 *
 * @author Santiago Castro Marles
 */

public class Bulbasur extends Pokemon implements IPlanta {
    
    //Constructor de la clase Bulbasur
    public Bulbasur() {
    }
    
    // Se sobre escribe el metodo atacarPlacaje de la clase abstracta Pokemon
    @Override
    public String atacarPlacaje() {
        return "Soy Bulbasur y voy a atacar con placaje";
    }

    // Se sobre escribe el metodo atacarAraniazo de la clase abstracta Pokemon
    @Override
    public String atacarAraniazo() {
        return "Soy Bulbasur y voy a atacar con araniazo";
    }

    // Se sobre escribe el metodo atacarMordizco de la clase abstracta Pokemon
    @Override
    public String atacarMordizco() {
        return "Soy Bulbasur y voy a atacar con mordisco";
    }

    // Se sobre escribe el metodo atacarParalizar de la interfaz IPlanta
    @Override
    public String atacarParalizar() {
        return "Soy Bulbasur y voy a atacar con paralizar";
    }

    // Se sobre escribe el metodo atacarDrenaje de la interfaz IPlanta
    @Override
    public String atacarDrenaje() {
        return "Soy Bulbasur y voy a atacar con drenaje";
    }

    // Se sobre escribe el metodo atacarHojaAfilada de la interfaz IPlanta
    @Override
    public String atacarHojaAfilada() {
        return "Soy Bulbasur y voy a atacar con hoja afilada";
    }

    // Se sobre escribe el metodo atacarLAtigoCepa de la interfaz IPlanta
    @Override
    public String atacarLatigoCepa() {
        return "Soy Bulbasur y voy a atacar con latigo cepa";
    }
    
}
