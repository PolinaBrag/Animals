package Animals.Animals;

public class Pack_animals extends Animal {

    private Float carryingCapacity;


    public Pack_animals(String name, String dateOfBirth, Float carryingCapacity) {
        super(name, dateOfBirth);
        this.carryingCapacity = carryingCapacity;
    }

    public Float getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(Float carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String toString() {
        return String.format("Кличка: %s\nДата рождения: %s\n", getName(), getDateOfBirth(), this.carryingCapacity);
    }
    
}
