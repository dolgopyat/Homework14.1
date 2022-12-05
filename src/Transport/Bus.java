package Transport;

public class Bus extends Transport {
    public Bus(String brand, String model, String color, int year, String country, int maxSpeed) {
        super(brand, model, color, year, country, maxSpeed);
    }

    @Override
    public void data() {
        System.out.println("Автобус " + getBrand() + ", модель " + getModel() + ", произведен в " + getCountry() +
                ", в " + getYear() + " году, " + getColor() + " цвета. Максимальная скорость - " + getMaxSpeed() +
                " км./ч..");
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке.");
    }
}
