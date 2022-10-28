public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "жёлтого", 2015, "России");                    // Lada
        lada.data();

        Car audi = new Car("Audi", "A8 50L TDI quatro", 3.0, "чёрного", 2020, "Германии" );                    // Audi
        audi.data();

        Car bmw = new Car("BMW", "Z8", 3.0, "чёрного", 2021, "Германии");                     // BMW
        bmw.data();

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красного", 2018, "Южной корее");                     // Kia
        kia.data();

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевого",2016, "Южной корее");                 // Hyundai
        hyundai.data();
    }
}
