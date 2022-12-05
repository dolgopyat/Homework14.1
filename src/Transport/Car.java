package Transport;

import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int numberOfSeats;
    private boolean winterTyres;
    private final Key key;
    private final Insurance insurance;



    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission,
               String bodyType, String regNumber, int numberOfSeats, boolean winterTyres, Key key, Insurance insurance,
               int maxSpeed) {
        super(brand, model, color, year, country, maxSpeed);
        this.bodyType = ValidationUtils.validOrDefault(bodyType, "default");
        this.numberOfSeats = Math.max(numberOfSeats, 1);
        this.key = key;
        this.insurance = insurance;
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        setRegNumber(regNumber);
        setWinterTyres(winterTyres);
    }


    public void setSeasonTires () {
       int currentMonth = LocalDate.now().getMonthValue();
       this.winterTyres = currentMonth <= 4 || currentMonth >= 11;
    }
    public boolean isRegNumberValid() {
        if (this.regNumber.length() != 9) {
            return false;
        }
        char[] regNumberChars = this.regNumber.toCharArray();
        return isNumberLetter(regNumberChars[0])
                && isNumber(regNumberChars[1])
                && isNumber(regNumberChars[2])
                && isNumber(regNumberChars[3])
                && isNumberLetter(regNumberChars[4])
                && isNumberLetter(regNumberChars[5])
                && isNumber(regNumberChars[6])
                && isNumber(regNumberChars[7])
                && isNumber(regNumberChars[8]);
    }
    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }
    private boolean isNumberLetter (char symbol) {
        String allowedSymbols = "ABEKMHOPCTYX";
        return allowedSymbols.contains("" + symbol);
    }
        public void data () {
            System.out.println(getBrand() + " " + getModel() + ", " + getYear() + " года выпуска, сборка в " +
                    getCountry() + ", " + getColor() + " цвета, объем двигателя — " + engineVolume + "л, коробка - " +
                    transmission + ", тип кузова - " + bodyType + ", регистрационный номер - " + regNumber +
                    ", мест - " + numberOfSeats + ", " + "зимняя резина - " + winterTyres + ", максимальная скорость - "
                    + getMaxSpeed() + "км./ч.");
        }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином, дизелем на заправке или заряжать на специальных " +
                "электропарковках, если это электрокар.");
    }

    public static class Key {
            private boolean remoteEngineStart;
            private boolean keyLessAccess;
            public Key(boolean remoteEngineStart, boolean keyLessAccess) {
                this.remoteEngineStart = remoteEngineStart;
                this.keyLessAccess = keyLessAccess;
            }
            public boolean isRemoteEngineStart() { return remoteEngineStart; }
            public boolean keyLessAccess() { return keyLessAccess; }
        }
        public static class Insurance {
        private final LocalDate validUntil;
        private final float cost;
        private final String number;
        public Insurance(LocalDate validUntil, float cost, String number) {
            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
            this.cost = Math.max(cost, 1f);
            this.number = ValidationUtils.validOrDefault(number, "default");
        }
            public boolean isNumberValid() { return number.length() == 9; }
            public boolean isInsuranceValid() { return LocalDate.now().isBefore(this.validUntil); }
        }


    public double getEngineVolume() { return engineVolume; }

    public String getTransmission() { return transmission; }
    public String getBodyType() { return bodyType; }
    public String getRegNumber() { return regNumber; }
    public int getNumberOfSeats() { return numberOfSeats; }
    public boolean isWinterTyres() { return winterTyres; }
    public Key getKey() { return key; }
    public Insurance getInsurance() { return insurance; }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume > 0.0 ? engineVolume : 1.5; }
    public void setTransmission(String transmission) {
        this.transmission = ValidationUtils.validOrDefault(transmission, "default"); }
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber; }
    public void setWinterTyres(boolean winterTyres) {
        this.winterTyres = winterTyres; }


}
