package baseObjects;

public class BaseStats {
    
    protected final int health;
    protected final int attack;
    protected final int specialAttack;
    protected final int defense;
    protected final int specialDefense;
    protected final int speed;
    
    protected BaseStats(int health, int attack, int specialAttack, int defense, int specialDefense, int speed) {
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