package Animals.Animals;

import java.util.ArrayList;

public class PackAnimals extends Animal {

    private Double carryingCapacity;
    public ArrayList<Command> commands = new ArrayList<>(); 


    public PackAnimals(String name, String dateOfBirth, Double carryingCapacity, ArrayList<Command> commands) {
        super(name, dateOfBirth);
        this.carryingCapacity = carryingCapacity;
        this.commands = commands;
    }

    public Double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(Double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String toString() {
        return String.format("Кличка: %s\nДата рождения: %s\n", getName(), getDateOfBirth(), this.carryingCapacity);
    }
    
}
