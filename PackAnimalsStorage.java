package Animals.Animals;

import java.util.ArrayList;

public class PackAnimalsStorage implements Storage<PackAnimals>{

    ArrayList<PackAnimals> packAnimals = new ArrayList<>();

    @Override
    public void addAnimal(PackAnimals newPackAnimal) {
        if (!packAnimals.contains(newPackAnimal)) {
            packAnimals.add(newPackAnimal);
        }
        
    }

    @Override
    public void deleteAnimal(PackAnimals animalPack) {
        if (!packAnimals.isEmpty()) {
            packAnimals.remove(animalPack);
        }
    }

    public void printPackAnimals(ArrayList<PackAnimals> PackAnimals) {
        for (PackAnimals p : PackAnimals) {
            System.out.println(p.getName());
        }

    }
    
}
