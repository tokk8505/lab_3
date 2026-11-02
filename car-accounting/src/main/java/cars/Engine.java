package cars;

/**
 * Двигатель автомобиля.
 */
public class Engine {
    /** Мощность в л.с. */
    private int power;

    /** Производитель. */
    private String manufacturer;

    /**
     * Создаёт двигатель.
     *
     * @param power        мощность
     * @param manufacturer производитель
     */
    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return manufacturer + " (" + power + " л.с.)";
    }
}