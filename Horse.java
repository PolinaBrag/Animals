package Animals.Animals;

public class Horse extends Pack_animals {

    public Horse(String name, String dateOfBirth, Double carryingCapacity) {
        super(name, dateOfBirth, carryingCapacity);
    }
    
    @Override
    public String toString() {
        return String.format("Кличка: %s\nДата рождения: %s\n", getName(), getDateOfBirth(), getCarryingCapacity());
    }
}
