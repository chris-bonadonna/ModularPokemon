/*
 * Copyright (c) 2017 by Delphix. All rights reserved.
 */

package pokemon;

import baseObjects.BaseStats;
import baseObjects.Move;
import baseObjects.Pokemon;
import enums.Type;
import java.util.List;
import java.util.Set;

/**
 *
 */
public class Charmander extends Pokemon {

    protected Charmander(int number, List<Type> types, Set<Move> availableMoves, List<Move> currentMoves,
            BaseStats baseStats) {
        super(number, types, availableMoves, currentMoves, baseStats);
    }

}
