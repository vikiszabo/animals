public class Rabbit extends Animal {

    Rabbit(String name, int weight) {
        super(name, weight, 4);
    }

    @Override
    protected void eat(Food food) {
        switch (food) {
            case VEGETABLE: weight += 2;
                break;
            case FRUIT: weight += 1;
                break;
            case MEAT: weight -= 1;
                break;
        }
    }

}
