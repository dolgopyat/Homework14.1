package Animals;



public class Herbivores extends Mammals{

    private String typeOfFood;



    public Herbivores(String name, int age, String habitat, int speed, String typeOfFood) {
        super(name, age, habitat, speed);
        this.typeOfFood = ValidationUtils.validOrDefault(typeOfFood, "default");
    }

    @Override
    public void eat() {
        System.out.println("Пасется на траве и ест её.");
    }

    @Override
    public void sleep() { System.out.println("Спит когда приходит для этого время."); }

    public void data() {
        System.out.println(getName() + ", возраст - " + getAge() + " года , среда обитания - " + getHabitat() +
                ", скорость - " + getSpeed() + " км./ч., питается - " + getTypeOfFood());
    }

    public String getTypeOfFood() { return typeOfFood; }
}
