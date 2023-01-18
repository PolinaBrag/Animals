package Animals.Animals;

public class Hamster extends Pet {

    public Hamster(String name, String dateOfBirth) {
        super(name, dateOfBirth);
    }
    
    @Override
    public String toString() {
        return String.format("Кличка: %s\nДата рождения: %s\n", getName(), getDateOfBirth());
    }
}
