package cardgenerator.identitygen.bodyplan;

public class Perks {

    public static final Perk OPPOSABLE_THUMBS = createPerk("Can use Equipment");
    public static final Perk SPIRITUAL = createPerk("+3 Spirit");
    public static final Perk CLAWED = createPerk("+4 Damage");
    public static final Perk SWIFT = createPerk("+3 Speed");
    public static final Perk LOCAL_REGEN = createPerk("+3 Hp Regen at certain areas");
    public static final Perk ROOT_SYSTEM = createPerk("Can share damage taken with other Plantae");
    public static final Perk SWARMING = createPerk("+2 Spirit for each Arthropoda nearby");
    public static final Perk NATURALLY_MADE = createPerk("+7 Defense");
    public static final Perk ABOMINABLE = createPerk("+5 Hp Regen when Hp is low");
    public static final Perk ADAPTABLE = createPerk("+1 Defense for each instance of damage taken");


    record Perk(String description){}
    public static Perk createPerk(String description) {
        return new Perk(description);
    }
}