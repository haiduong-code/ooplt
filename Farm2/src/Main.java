//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();

        farm.addAnimal(new Pig());
        farm.addAnimal(new Fish());
        farm.addAnimal(new Duck());

        farm.printAnimals();
    }
}