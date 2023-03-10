package Animals.Animals;

import java.util.ArrayList;

public class Donkey extends PackAnimals {

    public Donkey(String name, String dateOfBirth, Double carryingCapacity) {
        super(name, dateOfBirth, carryingCapacity);
    }

    @Override
    public String toString() {
        return String.format("Кличка: %s\nДата рождения: %s\n", getName(), getDateOfBirth(), getCarryingCapacity());
    }
    
}
