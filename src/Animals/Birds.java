package Animals;

public abstract class Birds extends Animals {

    String habitat;

    public Birds(String name) {
        super(name);
    }
    public Birds(String name, int age, String habitat) {
        super(name, age);
        this.habitat = ValidationUtils.validOrDefault(habitat, "default");
    }

    @Override
    public void eat() {
        System.out.println("Охотится, ест добычу.");
    }
    @Override
    public abstract void sleep();
    @Override
    public abstract void go();


    public String getHabitat() { return habitat; }
}
