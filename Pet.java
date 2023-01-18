package Animals.Animals;

import java.util.ArrayList;

public class Pet extends Animal {

    public ArrayList<Command> commands = new ArrayList<>(); 
    
    public Pet(String name, String dateOfBirth, ArrayList<Command> commands) {
        super(name, dateOfBirth);
        this.commands = commands;
    }

 
    @Override
    public String toString() {
        return String.format("Кличка: %s\nДата рождения: %s\n", getName(), getDateOfBirth());
    }

}
