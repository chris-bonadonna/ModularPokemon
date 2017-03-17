/*
 * Copyright (c) 2017 by Delphix. All rights reserved.
 */

package moves;

import baseObjects.Effect;
import baseObjects.Move;
import enums.DamageType;
import enums.Type;
import java.util.HashSet;

public class Scratch extends Move {

    public Scratch() {
        super(40, Type.Normal, DamageType.Physical,new HashSet<Effect>());
    }
}
