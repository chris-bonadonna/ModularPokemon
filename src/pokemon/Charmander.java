/*
 * Copyright (c) 2017 by Delphix. All rights reserved.
 */

package pokemon;

import baseObjects.Move;
import baseObjects.Pokemon;
import baseStats.CharmanderStats;
import enums.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import moves.Scratch;

public class Charmander extends Pokemon {

    public Charmander() {
        super(
                4,
                new ArrayList<Type>(Arrays.asList(Type.Fire)),
                getAvailableMoves(),
                getStartingMoves(),
                new CharmanderStats());
    }

    private static List<Move> getStartingMoves() {
        return new ArrayList<Move>(Arrays.asList(new Scratch()));
    }

    private static Set<Move> getAvailableMoves() {
        return new HashSet<Move>(Arrays.asList(new Scratch()));
    }
}
