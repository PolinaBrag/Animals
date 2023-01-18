package Animals.Animals;

public class Command {
    
    private String nameCommand;

    public Command(String nameCommand) {
        this.nameCommand = nameCommand;
    }

    public String getNameCommand() {
        return nameCommand;
    }

    public void setNameCommand(String nameCommand) {
        this.nameCommand = nameCommand;
    }

    public void learnCommandPet(Command command, Pet pet){
        if (!pet.commands.contains(command)) {
            pet.commands.add(command);
        }
    }

    public void learnCommandPackAnimal(Command command, PackAnimals packAn){
        if (!packAn.commands.contains(command)) {
            packAn.commands.add(command);
        }
        
    }
}
