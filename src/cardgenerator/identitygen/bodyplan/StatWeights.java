package cardgenerator.identitygen.bodyplan;

public enum StatWeights {
    HIGH(3),
    MEDIUM(2),
    LOW(1),
    NONE(0);

    private final int weight;

    StatWeights(int weight) {
        this.weight = weight;
    }

    public int weight() {
        return weight;
    }
}
