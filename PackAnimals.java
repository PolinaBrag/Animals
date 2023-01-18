package Animals.Animals;

import java.util.ArrayList;

public class PackAnimals extends Animal {

    private Double carryingCapacity;


    public PackAnimals(String name, String dateOfBirth, Double carryingCapacity) {
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
        return String.format("Кличка: %s\nДата рождения: %s\n", super.getName(), super.getDateOfBirth(), this.carryingCapacity);
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
