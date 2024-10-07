import java.util.ArrayList;
import java.util.List;
class Farm {
    private List<FarmAnimal> animals = new ArrayList<>();

    public List<FarmAnimal> getAnimals() {
        return animals;
    }
    public void addAnimal(FarmAnimal animal) {
        animals.add(animal);
    }

}