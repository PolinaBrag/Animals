package Animals.Animals;

public class Dog extends Pet {

    public Dog(String name, String dateOfBirth) {
        super(name, dateOfBirth);
    }
    
    @Override
    public String toString() {
        return String.format("Кличка: %s\nДата рождения: %s\n", getName(), getDateOfBirth());
    }
}
