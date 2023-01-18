package Animals.Animals;

import java.util.ArrayList;

public class Horse extends PackAnimals {

    public Horse(String name, String dateOfBirth, Double carryingCapacity, ArrayList<Command> commands) {
        super(name, dateOfBirth, carryingCapacity, commands);
    }
    
    @Override
    public String toString() {
        return String.format("Кличка: %s\nДата рождения: %s\n", getName(), getDateOfBirth(), getCarryingCapacity());
    }
}
