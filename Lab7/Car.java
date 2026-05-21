public class Car {
    private String model;
    private double power;
    private Driver driver;
    private double price;
    private int year;

    public Car(String model, double power, Driver driver, double price, int year) {
        this.model = model; this.power = power; this.driver = driver; 
        this.price = price; this.year = year;
    }

    public String getModel() { return model; }
    public double getPower() { return power; }
    public void setPower(double power) { this.power = power; }
    public Driver getDriver() { return driver; }
    public void setDriver(Driver driver) { this.driver = driver; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return model + " (" + year + ", потужність: " + power + " к.с., ціна: " + price + ", водій: " + driver + ")";
    }
}