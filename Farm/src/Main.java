import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();

        farm.addAnimal(new Pig());
        farm.addAnimal(new Duck());
        farm.addAnimal(new Fish());
        System.out.println("Dong vat co the di hoac boi:");
        for (FarmAnimal animal : farm.getAnimals()) {
            List<String> abilities = new ArrayList<>();
            if (animal.canWalk()) {
                abilities.add("di bo");
            }
            if (animal.canSwim()) {
                abilities.add("boi");
            }
            if (!abilities.isEmpty()) {
                System.out.println(animal.getName() + " co the " + String.join(" va ", abilities));
            }
        }
    }

}
