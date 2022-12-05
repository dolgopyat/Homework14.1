package Animals;



public class Predators extends Mammals {

    private String typeOfFood;

    public Predators(String name, int age, String habitat, int speed, String typeOfFood) {
        super(name, age, habitat, speed);
        this.typeOfFood = ValidationUtils.validOrDefault(typeOfFood, "default");
    }

    @Override
    public void eat() {
        System.out.println("Охотится, ест добычу.");
    }

    public void data() {
        System.out.println(getName() + ", возраст - " + getAge() + " года , среда обитания - " + getHabitat() +
                ", скорость - " + getSpeed() + " км./ч., питается - " + getTypeOfFood());
    }

    @Override
    public void sleep() { System.out.println("Спит когда приходит для этого время."); }

    public String getTypeOfFood() { return typeOfFood; }
}
