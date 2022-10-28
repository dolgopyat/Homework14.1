public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;
    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand != null) {                       // Бренд
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null ) {                      // Модель
            this.model = model;
        } else {
            this.model = "default";
        }
        if (country != null) {                     // Страна
            this.country = country;
        } else {
            this.country = "default";
        }
        if (color != null) {                       // Цвет
            this.color = color;
        } else {
            this.color = "белого";
        }
        if (engineVolume > 0) {                    // Объем двигателя
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
        if (year > 0) {                             // Год выпуска
            this.year = year;
        } else {
            this.year = 2000;
        }
    }
    void data() {
        System.out.println(brand + " " + model + ", " + year + " года выпуска, сборка в " + country + ", " + color + " цвета, объем двигателя — " + engineVolume + "л.");
    }
}
