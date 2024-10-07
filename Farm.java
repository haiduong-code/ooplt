import java.util.ArrayList;
import java.util.List;
class Farm {
    private List<FarmAnimal> animals = new ArrayList<>();

    public void addAnimal(FarmAnimal animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        System.out.println("Dong vat co the di hoac boi:");
        for (FarmAnimal animal : animals) {
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