public class Wolf extends Animal {

    Wolf(String name, int weight) {
        super(name, weight, 6);
    }

    @Override
    protected void eat(Food food) {
        switch (food) {
            case VEGETABLE: weight -= 1;
                break;
            case FRUIT: weight -= 1;
                break;
            case MEAT: weight += 3;
                break;
        }
    }

}
