public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();

        farm.addAnimal(new Pig());
        farm.addAnimal(new Duck());
        farm.addAnimal(new Fish());

        farm.showAnimals();
    }
}