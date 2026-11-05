package cardgenerator.identitygen.bodyplan;

public class BodyPlans {

    private static final int HI = StatWeights.HIGH.weight();
    private static final int MED = StatWeights.MEDIUM.weight();
    private static final int LO = StatWeights.LOW.weight();
    private static final int NONE = StatWeights.NONE.weight();



    public static final BodyPlan HUMANOID = createPlan(
            addPerks(Perks.OPPOSABLE_THUMBS, Perks.SPIRITUAL)
            , addWeights(LO, HI, MED, MED)
    );
    public static final BodyPlan BEASTIAL = createPlan(
            addPerks(Perks.CLAWED, Perks.SWIFT)
            , addWeights(MED, MED, LO, HI)
    );
    public static final BodyPlan PLANTAE = createPlan(
            addPerks(Perks.LOCAL_REGEN, Perks.ROOT_SYSTEM)
            , addWeights(HI, LO, HI, LO)
    );
    public static final BodyPlan ARTHROPODA = createPlan(
            addPerks(Perks.CLAWED, Perks.SWARMING)
            , addWeights(LO, LO, HI, HI)
    );
    public static final BodyPlan NATURA = createPlan(
            addPerks(Perks.LOCAL_REGEN, Perks.NATURALLY_MADE)
            , addWeights(HI, MED, MED, LO)
    );
    public static final BodyPlan MONSTROUS = createPlan(
            addPerks(Perks.CLAWED, Perks.ABOMINABLE)
            , addWeights(HI, LO, MED, MED)
    );
    public static final BodyPlan CHIMERIC = createPlan(
            addPerks(Perks.CLAWED, Perks.OPPOSABLE_THUMBS, Perks.ADAPTABLE)
            , addWeights(HI, MED, LO, MED)
    );




    protected static BodyPlan createPlan(PerkContainer perkContainer, StatWeightContainer statWeightContainer) {
        return new BodyPlan(perkContainer, statWeightContainer);
    }
    protected static BodyPlan createPlan(PerkContainer perkContainer) {
        return new BodyPlan(perkContainer, addWeights());
    }
    protected static BodyPlan createPlan() {
        return new BodyPlan(addPerks(), addWeights());
    }

    private record BodyPlan(
            PerkContainer perkContainer
            , StatWeightContainer statWeightContainer
    ) {}




    protected static StatWeightContainer addWeights(int stamina, int speed, int spirit, int constitution) {
        return new StatWeightContainer(stamina, speed, spirit, constitution);
    }

    protected static StatWeightContainer addWeights() {
        return new StatWeightContainer(NONE, NONE, NONE, NONE);
    }

    private record StatWeightContainer(
            int stamina,
            int speed,
            int spirit,
            int constitution
    ) {}

    protected static PerkContainer addPerks(Perks.Perk... perks) {
        return new PerkContainer(perks);
    }
    protected static PerkContainer addPerks() {
        return new PerkContainer();
    }
    public static Perks.Perk getPerk(BodyPlan bodyPlan,int perkIndex) {
        int length = bodyPlan.perkContainer.perks.length;
        //if ()

        return bodyPlan.perkContainer.perks[perkIndex];
    }

    private record PerkContainer(Perks.Perk... perks) {}


}
