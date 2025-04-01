package autonoma.aplicacionpokemon.models;

import autonoma.aplicacionpokemon.views.IElectrico;

/**
 *
 * @author Santiago Castro Marles 
 */

public class Pikachu extends Pokemon implements IElectrico {

    // Se crea el constructor de la clase Pikachu
    public Pikachu() {
    }
    
    
    // Se sobre escribe el metodo atacarPlacaje de la clase abstracta Pokemon
    @Override
    public String atacarPlacaje() {
        return "Soy Pikachu y estoy atacando con placaje";
    }
    
    // Se sobre escribe el metodo atacarAraniazo de la clase abstracta Pokemon
    @Override
    public String atacarAraniazo() {
        return "Soy Pikachu y estoy atacando con araniazo";
    }

    // Se sobre escribe el metodo atacarMordizco de la clase abstracta Pokemon
    @Override
    public String atacarMordizco() {
        return "Soy Pikachu y estoy atacando con mordisco";
    }
    
    // Se sobre escribe el metodo atacarImpactrueno de la interfaz IElectrico
    @Override
    public String atacarImpactrueno() {
        return "Soy Pikachu y estoy atacando con impactrueno";
    }

    // Se sobre escribe el metodo atacarPunioTrueno de la interfaz IElectrico
    @Override
    public String atacarPunioTrueno() {
        return "Soy Pikachu y estoy atacando con punio trueno";
    }

    // Se sobre escribe el metodo atacarRayo de la interfaz IElectrico
    @Override
    public String atacarRayo() {
        return "Soy Pikachu y estoy atacando con rayo";
    }

    // Se sobre escribe el metodo atacarRayoCarga de la interfaz IElectrico
    @Override
    public String atacarRayoCarga() {
        return "Soy Pikachu y estoy atacando con rayo carga";
    }
    
}
