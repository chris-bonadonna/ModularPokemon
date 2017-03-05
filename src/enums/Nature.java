package enums;

public enum Nature {
    Hardy,
    Lonely,
    Brave,
    Adamant,
    Naughty,
    Bold,
    Docile,
    Relaxed,
    Impish,
    Lax,
    Timid,
    Hasty,
    Serious,
    Jolly,
    Naive,
    Modest,
    Mild,
    Quiet,
    Bashful,
    Rash,
    Calm,
    Gentle,
    Sassy,
    Careful,
    Quirky;

    private StatCategory increase;
    private StatCategory decrease;
    
    static {
        Hardy.increase = StatCategory.None;
        Hardy.decrease = StatCategory.None;
        Lonely.increase = StatCategory.Attack;
        Lonely.decrease = StatCategory.Defense;
        Brave.increase = StatCategory.Attack;
        Brave.decrease = StatCategory.Speed;
        Adamant.increase = StatCategory.Attack;
        Adamant.decrease = StatCategory.SpecialAttack;
        Naughty.increase = StatCategory.Attack;
        Naughty.decrease = StatCategory.SpecialDefense;
        Bold.increase = StatCategory.Defense;
        Bold.decrease = StatCategory.Attack;
        Docile.increase = StatCategory.None;
        Docile.decrease = StatCategory.None;
        Relaxed.increase = StatCategory.Defense;
        Relaxed.decrease = StatCategory.Speed;
        Impish.increase = StatCategory.Defense;
        Impish.decrease = StatCategory.SpecialAttack;
        Lax.increase = StatCategory.Defense;
        Lax.decrease = StatCategory.SpecialDefense;
        Timid.increase = StatCategory.Speed;
        Timid.decrease = StatCategory.Attack;
        Hasty.increase = StatCategory.Speed;
        Hasty.decrease = StatCategory.Defense;
        Serious.increase = StatCategory.None;
        Serious.decrease = StatCategory.None;
        Jolly.increase = StatCategory.Speed;
        Jolly.decrease = StatCategory.SpecialAttack;
        Naive.increase = StatCategory.Speed;
        Naive.decrease = StatCategory.SpecialDefense;
        Modest.increase = StatCategory.SpecialAttack;
        Modest.decrease = StatCategory.Attack;
        Mild.increase = StatCategory.SpecialAttack;
        Mild.decrease = StatCategory.Defense;
        Quiet.increase = StatCategory.SpecialAttack;
        Quiet.decrease = StatCategory.Speed;
        Bashful.increase = StatCategory.None;
        Bashful.decrease = StatCategory.None;
        Rash.increase = StatCategory.SpecialAttack;
        Rash.decrease = StatCategory.SpecialDefense;
        Calm.increase = StatCategory.SpecialDefense;
        Calm.decrease = StatCategory.Attack;
        Gentle.increase = StatCategory.SpecialDefense;
        Gentle.decrease = StatCategory.Defense;
        Sassy.increase = StatCategory.SpecialDefense;
        Sassy.decrease = StatCategory.Speed;
        Careful.increase = StatCategory.SpecialDefense;
        Careful.decrease = StatCategory.SpecialAttack;
        Quirky.increase = StatCategory.None;
        Quirky.decrease = StatCategory.None;
    }
    
    public StatCategory getIncrease() {
        return increase;
    }
    
    public StatCategory getDecrease() {
        return decrease;
    }
}
