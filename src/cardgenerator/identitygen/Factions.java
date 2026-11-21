package cardgenerator.identitygen;

public class Factions {



    public static final Faction NECROMANCERS = newFaction("Necromancers"
    ,"Poison Immunity");
    public static final Faction ELDRITCH_CULTS = newFaction("Eldritch Cults"
    ,"+HP, +SPRT");
    public static final Faction TECHNOCRATS = newFaction("Technocrats"
    ,"+CON, +STA");
    public static final Faction APOTHEOSERS = newFaction("Apotheosers"
    ,"+CON, +SPRT");
    public static final Faction MYSTICS = newFaction("Mystics"
    ,"+DAM, +SPRT");
    public static final Faction HIVE_LEGIONS = newFaction("Hive Legions"
    ,"+STA, +SPD");
    public static final Faction BEAST_HORDES = newFaction("Beast Hordes"
    ,"+DAM, +SPD");



    protected static Faction newFaction(String name, String... bonus) {
        return new Faction(name, bonus);
    }

    protected static Faction newFaction() {
        return new Faction("");
    }

    private record Faction(String name, String... bonus) {}
}
