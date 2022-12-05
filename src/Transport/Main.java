package Transport;

import Transport.Bus;
import Transport.Car;
import Transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "жёлтого", 2015, "России",
                "механическая", "седан", "А001АА001", 4, true,
                new Car.Key(true,true),
                new Car.Insurance(LocalDate.now().plusMonths(3), 1000.0f, "123456789"), 160);
        lada.data();
        lada.refill();
        Car audi = new Car("Audi", "A8 50L TDI quatro", 3.0, "чёрного", 2020,
                "Германии", "автомат", "седан", "А001АА002", 4,
                true,
                new Car.Key(true,true),
                new Car.Insurance(LocalDate.now().plusMonths(3), 1000.0f, "223456789"), 220);
        audi.data();
        audi.refill();
        Car bmw = new Car("BMW", "Z8", 3.0, "чёрного", 2021, "Германии",
                "автомат", "кабриолет", "А001АА003", 2, true,
                new Car.Key(true,true),
                new Car.Insurance(LocalDate.now().plusMonths(3), 1000.0f, "323456789"), 220);
        bmw.data();
        bmw.refill();
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красного", 2018,
                "Южной корее", "автомат", "кросовер", "А001АА004", 4,
                true,
                new Car.Key(true,true),
                new Car.Insurance(LocalDate.now().plusMonths(3), 1000.0f, "423456789"), 200);
        kia.data();
        kia.refill();
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевого",2016,
                "Южной корее", "автомат", "седан", "А001АA005", 4,
                true,
                new Car.Key(true,true),
                new Car.Insurance(LocalDate.now().plusMonths(3), 1000.0f, "523456789"), 220);
        hyundai.data();
        hyundai.refill();
        System.out.println();

        Train lastochka = new Train("Ласточка", "В-901", "", 2011, "России", 301,
                3500, 0, "Беларусского", "Минск-Пассажирский", 11);
        lastochka.data();
        lastochka.refill();
        Train leningrad = new Train("Ленинград", "D-125", "", 2019, "России", 270,
                1700, 0, "Ленинградского", "Ленинград-Пассажирский", 8);
        leningrad.data();
        leningrad.refill();
        System.out.println();

        Bus vektor = new Bus("Vektor", "Next 7.6", "белого", 2018, "России", 100);
        vektor.data();
        vektor.refill();
        Bus gazele = new Bus("Газель", "Next", "синего", 2019, "России", 130);
        gazele.data();
        gazele.refill();
        Bus liaz = new Bus("ЛиАЗ", "4292", "жёлтого", 2020, "России", 85);
        liaz.data();
        liaz.refill();


    }
}
