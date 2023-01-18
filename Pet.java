package Animals;

import Animals.Animals.Animal;

public class Pet extends Animal {

    public Pet(String name, String dateOfBirth) {
        super(name, dateOfBirth);
    }
 
    @Override
    public String toString() {
        return String.format("Кличка: %s\nДата рождения: %s\n", getName(), getDateOfBirth());
    }

}
