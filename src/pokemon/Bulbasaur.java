package pokemon;

import baseObjects.Move;
import baseObjects.Pokemon;
import baseStats.BulbasaurStats;
import enums.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import moves.Tackle;

public class Bulbasaur extends Pokemon {

    public Bulbasaur() {
        super(
                1,
                new ArrayList<Type>(Arrays.asList(Type.Grass, Type.Poison)),
                getAvailableMoves(),
                getStartingMoves(),
                new BulbasaurStats());
    }

    private static List<Move> getStartingMoves() {
        return new ArrayList<Move>(Arrays.asList(new Tackle()));
    }

    private static Set<Move> getAvailableMoves() {
        return new HashSet<Move>(Arrays.asList(new Tackle()));
    }
}
