package Animals.Animals;

import java.util.ArrayList;

public class Dog extends Pet {

    public Dog(String name, String dateOfBirth, ArrayList<Command> commands) {
        super(name, dateOfBirth, commands);
    }
    
    @Override
    public String toString() {
        return String.format("Кличка: %s\nДата рождения: %s\n", getName(), getDateOfBirth());
    }
}
