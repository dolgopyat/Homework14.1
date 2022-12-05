package Animals;



public abstract class Mammals extends Animals {

    private String habitat;
    private int speed;



    public Mammals(String name) {
        super(name);
    }
    public Mammals(String name, int age, String habitat, int speed) {
        super(name, age);
        this.habitat = ValidationUtils.validOrDefault(habitat, "default");
        setSpeed(speed);
    }

    @Override
    public abstract void eat();
    @Override
    public abstract void sleep();
    @Override
    public void go() {
        System.out.println("Гуляет в вольере");
    }



    public String getHabitat() { return habitat; }

    public int getSpeed() { return speed; }

    public void setSpeed(int speed) {
        this.speed = speed > 0 ? speed : 10;
    }
}
