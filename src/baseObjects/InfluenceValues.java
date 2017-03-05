package baseObjects;

import static com.google.common.base.Preconditions.checkArgument;

public class InfluenceValues {

    // Each of these values ranges from 0 to 31
    private final int health;
    private final int attack;
    private final int specialAttack;
    private final int defense;
    private final int specialDefense;
    private final int speed;
    
    public InfluenceValues() {
        this.health = (int) (32 * Math.random());
        this.attack = (int) (32 * Math.random());
        this.specialAttack = (int) (32 * Math.random());
        this.defense = (int) (32 * Math.random());
        this.specialDefense = (int) (32 * Math.random());
        this.speed = (int) (32 * Math.random());
    }
    
    public InfluenceValues(int health, int attack, int specialAttack, int defense, int specialDefense, int speed) {
        checkArgument(health < 32 && health >= 0);
        checkArgument(attack < 32 && attack >= 0);
        checkArgument(specialAttack < 32 && specialAttack >= 0);
        checkArgument(defense < 32 && defense >= 0);
        checkArgument(specialDefense < 32 && specialDefense >= 0);
        checkArgument(speed < 32 && speed >= 0);
        this.health = health;
        this.attack = attack;
        this.specialAttack = specialAttack;
        this.defense = defense;
        this.specialDefense = specialDefense;
        this.speed = speed;
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