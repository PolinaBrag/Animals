package Animals.Animals;

public class RegisterAnimal {
    
    public static void addPet(Pet pet){
        System.out.println("Животное " + pet.getName() + " добавлено в реестр домашних животных.");
        System.out.print("\n");
        PetStorage st = new PetStorage();
        st.addAnimal(pet);
    }

    public static void addPackAnimal(PackAnimals packAnimal){
        System.out.println("Животное " + packAnimal.getName() + " добавлено в реестр вьючных животных.");
        System.out.print("\n");
        PackAnimalsStorage st = new PackAnimalsStorage();
        st.addAnimal(packAnimal);
    }


}