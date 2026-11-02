package cars;

import java.util.ArrayList;
import java.util.List;

/**
 * Консольное приложение.
 */
public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota Camry", "Business", 1550,
                new Driver("Иванов Иван Иванович", 10),
                new Engine(150, "Toyota")));

        cars.add(new Car("ВАЗ 2106", "Economy", 1050,
                new Driver("Петров Пётр Петрович", 3),
                new Engine(75, "ВАЗ")));

        cars.add(new Car("BMW X5", "SUV", 2100,
                new Driver("Сидоров Сидор Сидорович", 7),
                new Engine(200, "BMW")));

        cars.add(new Car("ГАЗ 3110", "Business", 1400,
                new Driver("Кузнецов Алексей Викторович", 2),
                new Engine(90, "ГАЗ")));

        cars.add(new Car("Hyundai Solaris", "Economy", 1200,
                new Driver("Смирнова Анна Сергеевна", 12),
                new Engine(120, "Hyundai")));

        cars.add(new Car("Москвич 2140", "Economy", 1000,
                new Driver("Волков Дмитрий Олегович", 6),
                new Engine(80, "Москвич")));

        cars.add(new Car("Kia Rio", "Economy", 1150,
                new Driver("Морозов Егор Андреевич", 1),
                new Engine(110, "Kia")));

        cars.add(new Car("УАЗ Патриот", "SUV", 2100,
                new Driver("Иванов Иван Иванович", 10),
                new Engine(90, "ГАЗ")));

        cars.add(new Car("ЗАЗ 968", "Economy", 800,
                new Driver("Сидоров Сидор Сидорович", 7),
                new Engine(75, "ВАЗ")));

        cars.add(new Car("ИЖ 2717", "Economy", 950,
                new Driver("Смирнова Анна Сергеевна", 12),
                new Engine(80, "Москвич")));

        System.out.println("=== Все автомобили ===");
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println();
        System.out.println("=== Водители со стажем более 5 лет ===");
        for (Car car : cars) {
            Driver driver = car.getDriver();
            if (driver.hasExperienceMoreThan(5)) {
                System.out.println(driver.getFullName() + " - " + driver.getExperience() + " лет");
            }
        }

        System.out.println();
        System.out.println("=== Автомобили советского производства ===");
        for (Car car : cars) {
            if (car.isSoviet()) {
                System.out.println(car);
            }
        }
    }
}