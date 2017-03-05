package moves;

import java.util.HashSet;

import baseObjects.Effect;
import baseObjects.Move;
import enums.DamageType;
import enums.Type;

public class Tackle extends Move {
    
    public Tackle() {
        super(40, Type.Normal, DamageType.Physical, new HashSet<Effect>());
    }
}