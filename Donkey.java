package Animals.Animals;

public class Donkey extends Pack_animals {

    public Donkey(String name, String dateOfBirth, Float carryingCapacity) {
        super(name, dateOfBirth, carryingCapacity);
    }

    @Override
    public String toString() {
        return String.format("Кличка: %s\nДата рождения: %s\n", getName(), getDateOfBirth(), getCarryingCapacity());
    }
    
}
