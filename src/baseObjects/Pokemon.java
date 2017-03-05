package baseObjects;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import helpers.PokemonUtil;
import enums.Type;
import items.Item;

public abstract class Pokemon {

    // These are fields that will be set the same way for each instance of a given pokemon
    protected final UUID id;
    protected final int number;
    protected final List<Type> types;
    protected final Set<Move> availableMoves;
    protected final Stats stats;

    // These are fields that can have defaults, but can vary per pokemon instance
    protected int level; // defaults to one
    protected int experience; // defaults to 0
    protected Optional<Item> heldItem; // defaults to empty
    protected int currentHealth; // defaults to max health

    // These are fields that must be instantiated specifically for each pokemon and may change
    protected List<Move> currentMoves;
    
    protected Pokemon(int number, List<Type> types, Set<Move> availableMoves, List<Move> currentMoves,
            BaseStats baseStats) {
        this.id = UUID.randomUUID();
        this.number = number;
        this.types = types;
        this.availableMoves = availableMoves;
        this.stats = new Stats(baseStats, new InfluenceValues(), PokemonUtil.randomNature());

        this.level = 1;
        this.experience = 0;
        this.heldItem = Optional.empty();

        this.currentMoves = currentMoves;

        stats.recompute(this);
        this.currentHealth = stats.getHealth();
    }
    
    public UUID getId() {
        return id;
    }
    
    public int getNumber() {
        return number;
    }
    
    public List<Type> getTypes() {
        return types;
    }
    
    public Stats getStats() {
        return stats;
    }
    
    public Optional<Item> getHeldItem() {
        return heldItem;
    }
    
    public void setHeldItem(Item heldItem) {
        this.heldItem = Optional.of(heldItem);
    }
    
    public int getCurrentHealth() {
        return currentHealth;
    }
    
    public void setCurrentHealth(int newHealth) {
        // Provides safety for invalid health values, thus enabling simpler calls to this function
        currentHealth = Math.min(Math.max(0, newHealth), stats.getHealth());
    }
    
    public List<Move> getCurrentMoves() {
        return currentMoves;
    }
    
    public int getLevel() {
        return level;
    }
    
//    public abstract void levelUp();
//    
//    public Pokemon evolve() {
//        throw new UnsupportedOperationException("This pokemon can't evolve!");
//    }
}