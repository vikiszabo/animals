public class Hedgehog extends Animal {

    Hedgehog(String name, int weight) {
        super(name, weight, 5);
    }

    @Override
    protected void eat(Food food) {
        switch (food) {
            case FRUIT: weight += 2;
                break;
            case MEAT: weight -= 1;
                break;
        }
    }
}
