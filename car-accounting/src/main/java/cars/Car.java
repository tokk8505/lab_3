package cars;

/**
 * Автомобиль.
 * <p>Содержит водителя и двигатель (композиция).</p>
 */
public class Car {
    /** Марка автомобиля. */
    private String brand;

    /** Класс автомобиля. */
    private String carClass;

    /** Вес в кг. */
    private double weight;

    /** Водитель. */
    private Driver driver;

    /** Двигатель. */
    private Engine engine;

    /**
     * Создаёт автомобиль.
     *
     * @param brand    марка
     * @param carClass класс
     * @param weight   вес
     * @param driver   водитель
     * @param engine   двигатель
     */
    public Car(String brand, String carClass, double weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    /**
     * Проверяет, советского ли производства автомобиль.
     *
     * @return true, если марка советская
     */
    public boolean isSoviet() {
    return brand.startsWith("ВАЗ")
            || brand.startsWith("ГАЗ")
            || brand.startsWith("Москвич")
            || brand.startsWith("ЗАЗ")
            || brand.startsWith("УАЗ")
            || brand.startsWith("ИЖ")
            || brand.startsWith("ЛуАЗ");
}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return brand + " [" + carClass + ", " + weight + " кг]"
                + ", водитель: " + driver
                + ", двигатель: " + engine;
    }
}