package autonoma.aplicacionpokemon.models;

import autonoma.aplicacionpokemon.views.IPlanta;

/**
 *
 * @author Santiago Castro Marles
 */

public class Bulbasur extends Pokemon implements IPlanta {

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Bulbasur y voy a atacar con placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Soy Bulbasur y voy a atacar con araniazo");
    }

    @Override
    public void atacarMordizco() {
        System.out.println("Soy Bulbasur y voy a atacar con mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy Bulbasur y voy a atacar con paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasur y voy a atacar con drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy Bulbasur y voy a atacar con hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy Bulbasur y voy a atacar con latigo cepa");
    }
    
}
