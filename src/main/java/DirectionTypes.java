public enum DirectionTypes {
    N,
    E,
    S,
    W;

    public DirectionTypes next() {
        int nextOrdinal = this.ordinal() == 3 ? 0 : this.ordinal() + 1;

        return values()[nextOrdinal];
    }

    public DirectionTypes previous() {
        int previousOrdinal = this.ordinal() == 0 ? 3 : this.ordinal() - 1;

        return values()[previousOrdinal];
    }
}
