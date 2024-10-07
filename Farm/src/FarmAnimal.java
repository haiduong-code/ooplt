public class FarmAnimal {
    private String name;
    public FarmAnimal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public boolean canWalk() {
        return false;
    }
    public boolean canSwim() {
        return false;
    }
}
