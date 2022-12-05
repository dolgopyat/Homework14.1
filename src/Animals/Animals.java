package Animals;

public abstract class Animals {
    private final String name;
    public int age;

    public Animals(String name) {
        this(name, 1);
    }

    public Animals(String name, int age) {
        this.name = name;
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = Math.abs(age); }
    }

    public abstract void eat ();
    public abstract void go ();
    public abstract void sleep ();



    public String getName() { return name; }
    public int getAge() { return age; }

    public void setAge(int age) {
        this.age = age; }
}
