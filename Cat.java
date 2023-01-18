package Animals.Animals;

import Animals.Pet;

public class Cat extends Pet {

    public Cat(String name, String dateOfBirth) {
        super(name, dateOfBirth);
    }
    
    @Override
    public String toString() {
        return String.format("Кличка: %s\nДата рождения: %s\n", getName(), getDateOfBirth());
    }
}
