package baseObjects;

import enums.DamageType;
import enums.Type;
import java.util.Set;
import typeMappings.TypeMapping;

public abstract class Move {

    protected final int baseDamage;
    protected final Type type;
    protected final DamageType damageType;
    protected final Set<Effect> additionalEffects;

    protected Move(int baseDamage, Type type, DamageType damageType, Set<Effect> additionalEffects) {
        this.baseDamage = baseDamage;
        this.type = type;
        this.damageType = damageType;
        this.additionalEffects = additionalEffects;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public Type getType() {
        return type;
    }

    public Set<Effect> getAdditionalEffects() {
        return additionalEffects;
    }

    public void use(Pokemon attacker, Pokemon defender) {
        defender.setCurrentHealth(defender.getCurrentHealth() - getDamage(attacker, defender));
    }

    private int getDamage(Pokemon attacker, Pokemon defender) {
        double modifier = getModifier(attacker, defender);
        int damage =
                new Double(
                                (((2 * attacker.getLevel() / 5) + 2)
                                                        * getBaseDamage()
                                                        * getAttackStat(attacker)
                                                        / getDefenseStat(defender)
                                                        / 50
                                                + 2)
                                        * modifier)
                        .intValue();
        System.out.println(damage);
        return damage;
    }

    private int getAttackStat(Pokemon pokemon) {
        switch (damageType) {
            case Physical:
                return pokemon.getStats().getAttack();
            case Special:
                return pokemon.getStats().getSpecialAttack();
            default:
                throw new RuntimeException("Invalid damage type: " + damageType);
        }
    }

    private int getDefenseStat(Pokemon pokemon) {
        switch (damageType) {
            case Physical:
                return pokemon.getStats().getDefense();
            case Special:
                return pokemon.getStats().getSpecialDefense();
            default:
                throw new RuntimeException("Invalid damage type: " + damageType);
        }
    }

    private double getModifier(Pokemon attacker, Pokemon defender) {
        return getRandom() * getStabBonus(attacker) * getMoveEffectiveness(defender);
    }

    private double getRandom() {
        return (1 - Math.random() * .15);
    }

    private double getStabBonus(Pokemon attacker) {
        if (attacker.getTypes().contains(type)) {
            return 1.5;
        } else {
            return 1.0;
        }
    }

    private double getMoveEffectiveness(Pokemon defender) {
        double multiplier = 1.0;
        for (Type defenderType : defender.getTypes()) {
            Double tempMultiplier = TypeMapping.typeMapping.get(type, defenderType);
            if (tempMultiplier != null) {
                multiplier *= tempMultiplier;
            }
        }
        return multiplier;
    }
}
