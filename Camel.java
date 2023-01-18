package Animals.Animals;

public class Camel extends PackAnimals {

    public Camel(String name, String dateOfBirth, Double carryingCapacity) {
        super(name, dateOfBirth, carryingCapacity);
    }
    
    @Override
    public String toString() {
        return String.format("Кличка: %s\nДата рождения: %s\n", getName(), getDateOfBirth(), getCarryingCapacity());
    }
}
