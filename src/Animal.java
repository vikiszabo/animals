public abstract class Animal {

    private String name;
    protected int weight;
    private int overweight;
    private boolean isAlive = true;

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return isAlive;
    }


    public Animal(String name, int weight, int overweight) {
        this.name = name;
        this.weight = weight;
        this.overweight = overweight;
    }

    protected abstract void eat(Food food);

    void lunch(Food food) {
        if (isAlive) {
            eat(food);
            checkHealth();
        }
    }

    void checkHealth() {
        if(weight>=overweight || weight <= 0){
            isAlive = false;
        }
    }
}
