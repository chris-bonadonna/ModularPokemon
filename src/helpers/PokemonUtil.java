package helpers;

import com.google.common.collect.ImmutableList;
import enums.Nature;

public class PokemonUtil {

    private static final ImmutableList<Nature> natures = ImmutableList.copyOf(Nature.values());

    private PokemonUtil() {
        throw new RuntimeException("Suppressed default constructor for non-instantiability");
    }

    public static Nature randomNature() {
        return natures.get((int) (Math.random() * natures.size()));
    }
}
