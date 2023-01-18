package Animals.Animals;

public class RegisterAnimal {
    
    static PetStorage petStorage = new PetStorage();
    static PackAnimalsStorage packAnimalsStorage = new PackAnimalsStorage();

    public static void addPet(Pet pet){
        System.out.println("Животное " + pet.getName() + " добавлено в реестр домашних животных.");
        System.out.print("\n");
        petStorage.addAnimal(pet);
    }

    public static void addPackAnimal(PackAnimals packAnimal){
        System.out.println("Животное " + packAnimal.getName() + " добавлено в реестр вьючных животных.");
        System.out.print("\n");
        packAnimalsStorage.addAnimal(packAnimal);
    }


}