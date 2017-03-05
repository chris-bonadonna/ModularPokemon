package baseObjects;

import enums.Nature;
import enums.StatCategory;

public class Stats {
    
    private int health;
    private int attack;
    private int specialAttack;
    private int defense;
    private int specialDefense;
    private int speed;
    
    private final BaseStats baseStats;
    private EffortValues effortValues;
    private final InfluenceValues influenceValues;
    private final Nature nature;

    public Stats(BaseStats baseStats, InfluenceValues influenceValues, Nature nature) {
        this.baseStats = baseStats;
        this.effortValues = new EffortValues();
        this.influenceValues = influenceValues;
        this.nature = nature;
    }
    
    public void recompute(Pokemon pokemon) {
        health = ((2 * baseStats.getHealth() + influenceValues.getHealth() + (effortValues.getHealth() / 4))
                * pokemon.getLevel() / 100) + pokemon.getLevel() + 10;
        attack = computeStat(baseStats.getAttack(), influenceValues.getAttack(), effortValues.getAttack(),
                pokemon.getLevel(), StatCategory.Attack);
        specialAttack = computeStat(baseStats.getSpecialAttack(), influenceValues.getSpecialAttack(),
                effortValues.getSpecialAttack(), pokemon.getLevel(), StatCategory.SpecialAttack);
        defense = computeStat(baseStats.getDefense(), influenceValues.getDefense(), effortValues.getDefense(),
                pokemon.getLevel(), StatCategory.Defense);
        specialDefense = computeStat(baseStats.getSpecialDefense(), influenceValues.getSpecialDefense(),
                effortValues.getSpecialDefense(), pokemon.getLevel(), StatCategory.SpecialDefense);
        speed = computeStat(baseStats.getSpeed(), influenceValues.getSpeed(), effortValues.getSpeed(),
                pokemon.getLevel(), StatCategory.Speed);
    }
    
    private int computeStat(int baseStat, int iv, int ev, int level, StatCategory stat) {
        return new Double((((2 * baseStat + iv + (ev / 4)) * level / 100) + 5) * getModifier(stat)).intValue();
    }
    
    private double getModifier(StatCategory category) {
        if (nature.getIncrease().equals(category)) {
            return 1.1;
        } else if (nature.getDecrease().equals(category)) {
            return .9;
        } else {
            return 1.0;
        }
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpecialDefense() {
        return specialDefense;
    }

    public int getSpeed() {
        return speed;
    }
}