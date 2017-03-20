package moves;

import baseObjects.Effect;
import baseObjects.Move;
import enums.DamageType;
import enums.Type;
import java.util.HashSet;

public class Ember extends Move {
    public Ember() {
        super(40, Type.Fire, DamageType.Special, new HashSet<Effect>());
    }
}
