package Animals.Animals;

import java.util.ArrayList;

public class Pet extends Animal {

    
    public Pet(String name, String dateOfBirth) {
        super(name, dateOfBirth);
    }

    @Override
    public String toString() {
        return String.format("Кличка: %s\nДата рождения: %s\n", super.getName(), super.getDateOfBirth());
    }

    @Override
    public void learnCommand(String command, Animal animal) {
        super.learnCommand(command, animal);
    }

    @Override
    public void printCommands(ArrayList<String> commands) {
        super.printCommands(commands);
    }

}
