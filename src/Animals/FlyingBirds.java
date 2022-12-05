package Animals;

public class FlyingBirds extends Birds {

    private String typeOfMovement;

    public FlyingBirds(String name) {
        super(name);
    }

    public FlyingBirds(String name, int age, String habitat, String typeOfMovement) {
        super(name, age, habitat);
        this.typeOfMovement = ValidationUtils.validOrDefault(typeOfMovement, "default");
    }

    @Override
    public void sleep() {}
    @Override
    public void go() {
        System.out.println("Передвигается с помощью ног и крыльев, умеет летать.");
    }

    public void data() {
        System.out.println(getName() + ", возраст - " + getAge() + " года , среда обитания - " + getHabitat() +
                ",  " + getTypeOfMovement());
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }
}
