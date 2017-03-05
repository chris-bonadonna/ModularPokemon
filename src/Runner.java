import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import baseObjects.Pokemon;
import pokemon.Bulbasaur;

public class Runner {
    public static void main(String[] args) {
        Bulbasaur bulbasaur1 = new Bulbasaur();
        System.out.println(bulbasaur1.getId());
        Bulbasaur bulbasaur2 = new Bulbasaur();
        System.out.println(bulbasaur2.getId());
        System.out.println();
        List<Pokemon> fighting = getPokemonOrder(bulbasaur1, bulbasaur2);
        while (!endBattle(fighting)) {
            for (Pokemon pokemon : fighting) {
                System.out.println("Bulbasaur1: " + bulbasaur1.getCurrentHealth());
                System.out.println("Bulbasaur2: " + bulbasaur2.getCurrentHealth());
                pokemon.getCurrentMoves().get(0).use(pokemon, fighting.stream().filter(x -> !x.equals(pokemon)).collect(Collectors.toList()).get(0));
                System.out.println("Bulbasaur1: " + bulbasaur1.getCurrentHealth());
                System.out.println("Bulbasaur2: " + bulbasaur2.getCurrentHealth());
                System.out.println("==============================================");
                if (endBattle(fighting)) {
                    break;
                }
            }
        }
    }
    
    private static List<Pokemon> getPokemonOrder(Pokemon one, Pokemon two) {
        if (one.getStats().getSpeed() >= two.getStats().getSpeed()) {
            return new ArrayList<Pokemon>(Arrays.asList(one, two));
        } else {
            return new ArrayList<Pokemon>(Arrays.asList(two, one));
        }
    }
    
    private static boolean endBattle(List<Pokemon> pokemonList) {
        for (Pokemon pokemon : pokemonList) {
            if (pokemon.getCurrentHealth() == 0) {
                return true;
            }
        }
        return false;
    }
}