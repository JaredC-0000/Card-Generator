package cardgenerator.identitygen.bodyplan;

public class BodyPlans {




    public static final BodyPlan HUMANOID = createPlan(Perks.OPPOSABLE_THUMBS, Perks.SPIRITUAL
    );
    public static final BodyPlan BEASTIAL = createPlan(Perks.CLAWED, Perks.SWIFT
    );
    public static final BodyPlan PLANTAE = createPlan(Perks.LOCAL_REGEN, Perks.ROOT_SYSTEM
    );
    public static final BodyPlan ARTHROPODA = createPlan(Perks.CLAWED, Perks.SWARMING
    );
    public static final BodyPlan NATURA = createPlan(Perks.LOCAL_REGEN, Perks.NATURALLY_MADE
    );
    public static final BodyPlan MONSTROUS = createPlan(Perks.CLAWED, Perks.ABOMINABLE
    );
    public static final BodyPlan CHIMERIC = createPlan(
            Perks.CLAWED, Perks.OPPOSABLE_THUMBS,
            Perks.ADAPTABLE);


    protected static BodyPlan createPlan(Perks.Perk... perks) {
        return new BodyPlan(perks);
    }

    private record BodyPlan(Perks.Perk... perks) {}

    protected static PerkContainer addPerks(Perks.Perk... perks) {
        return new PerkContainer(perks);
    }

    private record PerkContainer(Perks.Perk... perks) {}


}
