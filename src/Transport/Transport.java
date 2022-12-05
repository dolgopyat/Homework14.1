package Transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;


    public Transport(String brand, String model, String color, int year, String country, int maxSpeed) {                  // Конструктор
        this.brand = ValidationUtils.validOrDefault(brand, "default");
        this.model = ValidationUtils.validOrDefault(model, "default");
        this.country = ValidationUtils.validOrDefault(country, "default");
        this.year = year >= 0 ? year : 2000;
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public abstract void data ();                                                                                         // Методы

    public abstract void refill ();

    public String getBrand() { return brand; }                                                                            // Геттеры

    public String getModel() { return model; }

    public int getYear() { return year; }

    public String getCountry() { return country; }

    public String getColor() { return color; }

    public int getMaxSpeed() { return maxSpeed; }

    public void setColor(String color) {                                                                                 // Сеттеры
        this.color = ValidationUtils.validOrDefault(color, "default"); }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed > 0 ? maxSpeed : 100; }
}

