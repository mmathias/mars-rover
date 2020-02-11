public enum DirectionTypes {
    N(0),
    E(1),
    S(2),
    W(3);

    private int position;

    DirectionTypes(int position) {
        this.position = position;
    }

    public DirectionTypes next() {
        int nextOrdinal = this.ordinal() == 3 ? 0 : this.ordinal() + 1;

        return DirectionTypes.values()[nextOrdinal];
    }

    public DirectionTypes previous() {
        int previousOrdinal = this.ordinal() == 0 ? 3 : this.ordinal() - 1;

        return DirectionTypes.values()[previousOrdinal];
    }
}
