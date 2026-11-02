package cars;

/**
 * Водитель автомобиля.
 */
public class Driver {
    /** ФИО водителя. */
    private String fullName;

    /** Стаж вождения в годах. */
    private int experience;

    /**
     * Создаёт водителя.
     *
     * @param fullName   ФИО
     * @param experience стаж вождения в годах
     */
    public Driver(String fullName, int experience) {
        this.fullName = fullName;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * Проверяет, больше ли стаж заданного значения.
     *
     * @param years значение для сравнения
     * @return true, если стаж больше years
     */
    public boolean hasExperienceMoreThan(int years) {
        return experience > years;
    }

    @Override
    public String toString() {
        return fullName + " (стаж " + experience + " лет)";
    }
}