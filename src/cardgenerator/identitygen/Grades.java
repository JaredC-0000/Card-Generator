package cardgenerator.identitygen;

public enum Grades {

    ZERO_STAR(0,2,5,0, 0),
    ONE_STAR(1,5,10,1, 1),
    TWO_STAR(2,7,15,1, 2),
    THREE_STAR(3,10,20,2, 3),
    FOUR_STAR(4,12,25,2, 4),
    FIVE_STAR(5,15,30,3, 5),
    ;

    private final int stars;
    private final int skillPoints;
    private final int statTotal;
    private final int startingTalents;
    private final int traitTotal;

    Grades(int stars, int skillPoints, int statTotal, int startingTalents, int traitTotal
    ){
        this.stars = stars;
        this.skillPoints = skillPoints;
        this.statTotal = statTotal;
        this.startingTalents = startingTalents;
        this.traitTotal = traitTotal;
    }
}
