package baseObjects;

import static com.google.common.base.Preconditions.checkArgument;

public class EffortValues {

    // Each of these values ranges from 0 to 255
    private int health;
    private int attack;
    private int specialAttack;
    private int defense;
    private int specialDefense;
    private int speed;

    public EffortValues() {
        this.health = 0;
        this.attack = 0;
        this.specialAttack = 0;
        this.defense = 0;
        this.specialDefense = 0;
        this.speed = 0;
    }

    public int getHealth() {
        return health;
    }

    public void incrementHealth(int increase) {
        checkArgument(increase >= 0);
        this.health = Math.min(255, health + increase);
    }

    public void resetHealth() {
        this.health = 0;
    }

    public int getAttack() {
        return attack;
    }

    public void incrementAttack(int increase) {
        checkArgument(increase >= 0);
        this.attack = Math.min(255, attack + increase);
    }

    public void resetAttack() {
        this.attack = 0;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public void incrementSpecialAttack(int increase) {
        checkArgument(increase >= 0);
        this.specialAttack = Math.min(255, specialAttack + increase);
    }

    public void resetSpecialAttack() {
        this.specialAttack = 0;
    }

    public int getDefense() {
        return defense;
    }

    public void incrementDefense(int increase) {
        checkArgument(increase >= 0);
        this.defense = Math.min(255, defense + increase);
    }

    public void resetDefense() {
        this.defense = 0;
    }

    public int getSpecialDefense() {
        return specialDefense;
    }

    public void incrementSpecialDefense(int increase) {
        checkArgument(increase >= 0);
        this.specialDefense = Math.min(255, specialDefense + increase);
    }

    public void resetSpecialDefense() {
        this.specialDefense = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void incrementSpeed(int increase) {
        checkArgument(increase >= 0);
        this.speed = Math.min(255, speed + increase);
    }

    public void resetSpeed() {
        this.speed = 0;
    }
}
