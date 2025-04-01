package autonoma.aplicacionpokemon.models;

import autonoma.aplicacionpokemon.views.IElectrico;

/**
 *
 * @author Santiago Castro Marles 
 */

public class Pikachu extends Pokemon implements IElectrico {

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Pikachu y estoy atacando con placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Soy Pikachu y estoy atacando con araniazo");
    }

    @Override
    public void atacarMordizco() {
        System.out.println("Soy Pikachu y estoy atacando con mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy Pikachu y estoy atacando con impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy Pikachu y estoy atacando con punio trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy Pikachu y estoy atacando con rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy Pikachu y estoy atacando con rayo carga");
    }
    
}
