import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> animals = new ArrayList<Animal>();
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public List<Animal> getAnimals() {
        return animals;
    }
    public void printAnimals() {
        for (Animal animal : animals) {
            if (animal instanceof Pig){
                System.out.println(animal.getName() + " can walk.");
            }
            if (animal instanceof Fish || animal instanceof Duck){
                System.out.println(animal.getName() + " can swim.");
            }
            if (animal instanceof Duck){
                System.out.println(animal.getName() + " can walk and swim.");
            }
        }

    }
}
