public enum Food {
    VEGETABLE(1),
    FRUIT(2),
    MEAT(3);

    private int food;

    Food(int food) {
        this.food = food;
    }

    public int getValue() {
        return food;
    }

    public static Food getEnum(int food) {
        for(Food f : values())
            if(f.getValue() == food) return f;
        throw new IllegalArgumentException();
    }
}
