package Transport;

public class Train extends Transport {
    private double priceTrip;
    private  double travelTime;
    private String departureStation;
    private String arrivalStation;
    private int numberOfWagons;

    public Train(String brand, String model, String color, int year, String country, int maxSpeed, double priceTrip,
                 double travelTime, String departureStation, String arrivalStation, int numberOfWagons) {
        super(brand, model, color, year, country, maxSpeed);
        setPriceTrip(priceTrip);
        setTravelTime(travelTime);
        setDepartureStation(departureStation);
        setArrivalStation(arrivalStation);
        setNumberOfWagons(numberOfWagons);
    }

    @Override
    public void data() {
        System.out.println("Поезд " + getBrand() + ", модель " + getModel() + " , " + getYear() +
                " год выпуска в России, скорость передвижения — " + getMaxSpeed() + " км/ч, отходит от " +
                getDepartureStation() + "вокзала и следует до станции " + getArrivalStation() +". Цена поездки — " +
                getPriceTrip() + " рублей, в поезде " + getNumberOfWagons() + " вагонов.");
    }

    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем.");
    }

    public double getPriceTrip() { return priceTrip; }
    public double getTravelTime() { return travelTime; }
    public String getDepartureStation() { return departureStation; }
    public String getArrivalStation() { return arrivalStation; }
    public int getNumberOfWagons() { return numberOfWagons; }

    public void setPriceTrip(double priceTrip) {
        this.priceTrip = priceTrip > 0.0 ? priceTrip : 1000.00; }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime > 0.0 ? travelTime : 10.0; }

    public void setDepartureStation(String departureStation) {
        this.departureStation = ValidationUtils.validOrDefault(departureStation, "default"); }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = ValidationUtils.validOrDefault(arrivalStation, "default");}

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons > 0 ? numberOfWagons : 1; }





}
