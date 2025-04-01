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
        
        // Se instancian las clases de los Pokemones 
        
        Bulbasur bulba = new Bulbasur();
        Charmander charma = new Charmander();
        Pikachu pika = new Pikachu ();
        Squirtle squirt = new Squirtle();
        
        
        // Se llaman a los metodos de la clase Bulbasur
        
        System.out.print(bulba.atacarAraniazo()+ "\n");
        System.out.print(bulba.atacarDrenaje()+ "\n");
        System.out.print(bulba.atacarHojaAfilada()+ "\n");
        System.out.print(bulba.atacarLatigoCepa() + "\n");
        System.out.print(bulba.atacarMordizco() + "\n");
        System.out.print(bulba.atacarParalizar() + "\n");
        System.out.print(bulba.atacarPlacaje() + "\n");
        
        // Se llaman a los metodos de la clase Pikachu
        
        System.out.print(pika.atacarAraniazo() + "\n");
        System.out.print(pika.atacarImpactrueno() + "\n");
        System.out.print(pika.atacarMordizco() + "\n");
        System.out.print(pika.atacarPlacaje() + "\n");
        System.out.print(pika.atacarPunioTrueno() + "\n");
        System.out.print(pika.atacarRayo() + "\n");
        System.out.print(pika.atacarRayoCarga() + "\n");
        
        
        // Se llaman a los metodos de la clase Charmander
        
        System.out.print(charma.atacarAraniazo() + "\n");
        System.out.print(charma.atacarAscuas() + "\n");
        System.out.print(charma.atacarLanzallamas() + "\n");
        System.out.print(charma.atacarMordizco() + "\n");
        System.out.print(charma.atacarPlacaje() + "\n");
        System.out.print(charma.atacarPunioFuego() + "\n");
        
        // Se llaman a los metodos de la clase Squirtle
        
        System.out.print(squirt.atacarAraniazo() + "\n");
        System.out.print(squirt.atacarBurbuja() + "\n");
        System.out.print(squirt.atacarHidroBomba() + "\n");
        System.out.print(squirt.atacarHidroPulso() + "\n");
        System.out.print(squirt.atacarMordizco() + "\n");
        System.out.print(squirt.atacarPistsAgua() + "\n");
        System.out.print(squirt.atacarPlacaje() + "\n");
        
        
    }
    
}
