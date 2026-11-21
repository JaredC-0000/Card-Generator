package cardgenerator.statgen;

public class StatManager {






    private int calcHealth(int constitution) {
        return 2*constitution;
    }
    private int calcDamage(int constitution, int spirit, int speed) {
        return constitution*(spirit/speed);
    }

    protected StatBlock createStatBlock(
            int constitution,int stamina,int speed,int spirit) {

        int health = calcHealth(constitution)
                , damage = calcDamage(constitution, spirit, speed);

        return new StatBlock(health, damage, constitution
            , stamina, speed, spirit);
    }
    protected StatBlock createStatBlock() {
        return createStatBlock(0,0,0,0);
        //return new StatBlock(0,0,0,0,0,0);
    }

    private record StatBlock(
            int health
            ,int damage
            ,int constitution
            ,int stamina
            ,int speed
            ,int spirit
    ) {}
}
