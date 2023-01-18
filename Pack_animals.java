package Animals.Animals;

public class Pack_animals extends Animal {

    private Double carryingCapacity;


    public Pack_animals(String name, String dateOfBirth, Double carryingCapacity) {
        super(name, dateOfBirth);
        this.carryingCapacity = carryingCapacity;
    }

    public Double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(Double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String toString() {
        return String.format("Кличка: %s\nДата рождения: %s\n", getName(), getDateOfBirth(), this.carryingCapacity);
    }
    
}
