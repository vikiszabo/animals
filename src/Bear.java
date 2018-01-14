public class Bear extends Animal {

    Bear(String name, int weight){
        super(name, weight, 10);
    }

    @Override
    protected void eat(Food food) {
        switch (food) {
            case VEGETABLE: weight -= 1;
            break;
            case FRUIT: weight += 1;
            break;
            case MEAT: weight += 1;
            break;
        }
    }
}
