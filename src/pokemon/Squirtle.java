/*
 * Copyright (c) 2017 by Delphix. All rights reserved.
 */

package pokemon;

import baseObjects.Move;
import baseObjects.Pokemon;
import baseStats.SquirtleStats;
import enums.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import moves.Tackle;

/**
 *
 */
public class Squirtle extends Pokemon {
    public Squirtle() {
        super(
                7,
                new ArrayList<Type>(Arrays.asList(Type.Water)),
                getAvailableMoves(),
                getStartingMoves(),
                new SquirtleStats());
    }
    private static List<Move> getStartingMoves() {
        return new ArrayList<Move>(Arrays.asList(new Tackle()));
    }

    private static Set<Move> getAvailableMoves() {
        return new HashSet<Move>(Arrays.asList((new Tackle())));
    }
}

