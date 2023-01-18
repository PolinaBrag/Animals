package Animals.Animals;

import java.util.ArrayList;

public class PetStorage implements Storage<Pet>{

    ArrayList<Pet> pets = new ArrayList<>();

    @Override
    public void addAnimal(Pet newPet) {
        if (!pets.contains(newPet)) {
            pets.add(newPet);
        }
    }

    @Override
    public void deleteAnimal(Pet pet) {
        if (!pets.isEmpty()) {
            pets.remove(pet);
        }
        
    }
    
}
