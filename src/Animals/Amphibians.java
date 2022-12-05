package Animals;


public class Amphibians extends Animals {

    private String habitat;

    public Amphibians(String name) {
        super(name);
    }
    public Amphibians(String name, int age, String habitat) {
        super(name, age);
        this.habitat = ValidationUtils.validOrDefault(habitat, "default");
    }

    @Override
    public void eat() {
        System.out.println("Охотится, ест добычу.");
    }
    @Override
    public void sleep() {}
    @Override
    public void go() {}

    public void data() {
        System.out.println(getName() + ", возраст - " + getAge() + " года , среда обитания - " + getHabitat());
    }


    public String getHabitat() { return habitat; }
}
