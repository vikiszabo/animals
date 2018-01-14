import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File input = new File("resources/animals.txt");
        try {
            Scanner sc = new Scanner(input);
            int numberOfDays = sc.nextInt();
            List<Food> foods = new ArrayList<>();
            for (int i = 0; i < numberOfDays; i++) {
                int food = sc.nextInt();
                foods.add(Food.getEnum(food));
            }

            List<Animal> animals = new ArrayList<>();

            while (sc.hasNext()) {
                String AnimalType = sc.next();
                String AnimalName = sc.next();
                int startWeight = sc.nextInt();
                Animal animal = AnimalFactory.createAnimal(AnimalType, AnimalName, startWeight);
                animals.add(animal);
            }

            for (Food food:foods
                 ) {
                for (Animal animal: animals
                     ) {
                    animal.lunch(food);
                }

            }

            for (Animal animal: animals
                 ) {
                if(animal.isAlive()){
                    System.out.println(animal.getName());
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


//        Bear bear1 = new Bear("Mici");
//        Bear bear2 = new Bear("Mackó");
//        Bear bear3 = new Bear("Balu");
//        Bear bear4 = new Bear("Kapitány");
//        Wolf wolf1 = new Wolf("Farki");
//        Wolf wolf2 = new Wolf("Lompos");
//        Wolf wolf3 = new Wolf("Wuff");
//        Wolf wolf4 = new Wolf("Ezüst");
//        Rabbit rabbit1 = new Rabbit("Bunny");
//        Rabbit rabbit2 = new Rabbit("Hunny");
//        Hedgehog hedgehog1 = new Hedgehog("Cuki");
//        Hedgehog hedgehog2 = new Hedgehog("Lulu");
//
//        List<Animal> animals = new ArrayList<>();
//
//        animals.add(bear1);
//        animals.add(bear2);
//        animals.add(bear3);
//        animals.add(bear4);
//        animals.add(wolf1);
//        animals.add(wolf2);
//        animals.add(wolf3);
//        animals.add(wolf4);
//        animals.add(rabbit1);
//        animals.add(rabbit2);
//        animals.add(hedgehog1);
//        animals.add(hedgehog2);
//
//
//        for (Weekday day: Weekday.values()) {
//
//                switch(day){
//                    case MONDAY: eat(Food.VEGETABLE, animals);
//                    case TUESDAY: eat(Food.FRUIT, animals);
//                    case WEDNESDAY: eat(Food.MEAT, animals);
//                    case THURSDAY: eat(Food.VEGETABLE, animals);
//                    case FRIDAY: eat(Food.FRUIT, animals);
//                    case SATURDAY: eat(Food.MEAT, animals);
//                    case SUNDAY: eat(Food.VEGETABLE, animals);
//                }
//
//        }
//
//    }
//
//    private static void eat(Food food, List<Animal> animals) {
//        for (Animal animal: animals) {
//            animal.eat(food);
//        }
   }

}
