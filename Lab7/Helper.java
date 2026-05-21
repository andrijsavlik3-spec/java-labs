import java.util.List;
import java.util.Random;

public class Helper {
    public static Car chooseRandomCar(List<Car> cars) {
        Car chosen = cars.get(new Random().nextInt(cars.size()));
        System.out.println("Автомобіль марки " + chosen.getModel() + " з водієм " + chosen.getDriver().getName() + " виїхав за вами.");
        arrive(chosen);
        return chosen;
    }

    public static void arrive(Car car) {
        System.out.println("Водій " + car.getDriver().getName() + " прибув на місце.");
    }
}