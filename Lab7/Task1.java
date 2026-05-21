import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", 150, new Driver("Олег", 35, 10), 15000, 2015));
        cars.add(new Car("BMW", 200, new Driver("Іван", 29, 4), 25000, 2018));
        cars.add(new Car("Ford", 180, new Driver("Сергій", 31, 6), 20000, 2016));
        cars.add(new Car("Audi", 220, new Driver("Руслан", 40, 15), 30000, 2020));
        cars.add(new Car("Opel", 120, new Driver("Михайло", 26, 3), 12000, 2013));
        cars.add(new Car("Kia", 110, new Driver("Денис", 27, 2), 11000, 2012));
        cars.add(new Car("Honda", 160, new Driver("Віктор", 28, 5), 18000, 2017));
        cars.add(new Car("Mazda", 140, new Driver("Юрій", 38, 12), 16000, 2014));
        cars.add(new Car("Nissan", 170, new Driver("Андрій", 24, 4), 17500, 2019));
        cars.add(new Car("Mercedes", 250, new Driver("Тарас", 45, 20), 40000, 2021));

        String[] newNames = {"Олександр", "Максим", "Дмитро", "Володимир", "Богдан"};

        for (int i = 0; i < cars.size() / 2; i++) {
            Car car = cars.get(i);
            car.setPower(car.getPower() * 1.1);
            car.setDriver(new Driver(newNames[i], 30 + i, 5 + i));
        }

        for (int i = 1; i < cars.size(); i += 2) {
            Car car = cars.get(i);
            car.setPower(car.getPower() * 1.1);
            car.setPrice(car.getPrice() * 1.05);
        }

        for (Car car : cars) {
            Driver d = car.getDriver();
            if (d.getExperience() < 5 && d.getAge() > 25) {
                d.setExperience(d.getExperience() + 1);
            }
        }

        System.out.println("=== Поточний автопарк ===");
        for (Car car : cars) System.out.println(car);

        System.out.println("\n=== Виклик таксі ===");
        Helper.chooseRandomCar(cars);
    }
}