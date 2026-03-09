package models; 

public class Car {
    public int horsePower;
    public double engineVolume;
    
    public String brand;
    public String model;
    public String color;
    public int maxSpeed;
    public boolean isElectric;

    public Car(int horsePower, double engineVolume) {
        this.horsePower = horsePower;
        this.engineVolume = engineVolume;
        this.brand = "Default Brand";
        this.model = "Base Model";
        this.color = "White";
        this.maxSpeed = 180;
        this.isElectric = false;
    }
}