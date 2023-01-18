package Animals.Animals;

import java.util.ArrayList;

public class Animal {
    
    private String name;
    private String dateOfBirth;
    ArrayList<String> commands = new ArrayList<>(); 

    public Animal(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    @Override
    public String toString() {
        return String.format("Кличка: %s\nДата рождения: %s\n", this.name, this.dateOfBirth);
    }

    public void learnCommand(String command, Animal animal){
        if (!animal.commands.contains(command)) {
            animal.commands.add(command);
        }
    }

    public void printCommands(ArrayList<String> commands) {
        for (String cm : commands) {
            System.out.println(cm);
        }

    }


}
