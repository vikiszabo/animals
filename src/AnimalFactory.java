public class AnimalFactory {
    static Animal createAnimal(String animalType, String animalName, int startWeight) {
        Animal animal = null;
        switch (animalType) {
            case "Farkas":
                animal = new Wolf(animalName, startWeight);
                break;
            case "Medve":
                animal = new Bear(animalName, startWeight);
                break;
            case "Nyul":
                animal = new Rabbit(animalName, startWeight);
                break;
            case "Sun":
                animal = new Hedgehog(animalName, startWeight);
                break;
        }
        return animal;
    }
}