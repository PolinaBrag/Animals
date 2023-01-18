package Animals.Animals;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    void startProgramm() {
        boolean exit = false;
        while (!exit) {
            programMenu();
            Scanner sc = new Scanner(System.in);
            int menuinput = sc.nextInt();
            if (menuinput == 1) {
                System.out.println(
                    "Выберите тип животного:" + "\n"
                        + "1. Домашнее животное" + "\n"
                        + "2. Вьючное животное" + "\n"
                );
                int typeAnimal = sc.nextInt();
                if (typeAnimal == 1){
                    System.out.println("Введите имя животного:" + "\n");
                    String name = sc.next();
                    System.out.println("Введите дату рождения животного в формате DD.MM.YYYY :" + "\n");
                    String date = sc.next();
                    System.out.println("Введите название команды, которую умеет выполнять животное :" + "\n");
                    String commandName = sc.next();
                    Command command = new Command(commandName);
                    ArrayList<Command> commands = new ArrayList<>();
                    commands.add(command);
                    Pet newPet = new Pet(name, date, commands);
                    RegisterAnimal.addPet(newPet);
                }
                if (typeAnimal == 2){
                    System.out.println("Введите имя животного:" + "\n");
                    String name = sc.next();
                    System.out.println("Введите дату рождения животного в формате DD.MM.YYYY :" + "\n");
                    String date = sc.next();
                    System.out.println("Введите грузоподъемность животного в формате KG.GR :" + "\n");
                    Double carry = sc.nextDouble();
                    System.out.println("Введите название команды, которую умеет выполнять животное :" + "\n");
                    String commandName = sc.next();
                    Command command = new Command(commandName);
                    ArrayList<Command> commands = new ArrayList<>();
                    commands.add(command);
                    PackAnimals newPackAnimal = new PackAnimals(name, date, carry, commands);
                    RegisterAnimal.addPackAnimal(newPackAnimal);
                }
            } else if (menuinput == 2) {
                //действие2
            } else if (menuinput == 3) {
                System.out.println("Введите имя животного, которого нужно обучить команде:" + "\n");
                String name = sc.next();
                System.out.println("Введите название команды, которой нужно обучить животное:" + "\n");
                String nameCommand = sc.next();
                Command command = new Command(nameCommand);
                System.out.println(
                    "Выберите тип животного:" + "\n"
                        + "1. Домашнее животное" + "\n"
                        + "2. Вьючное животное" + "\n"
                );
                int typeAnimal = sc.nextInt();
                if (typeAnimal == 1){
                    PetStorage st = new PetStorage();
                    for (int i = 0; i < st.pets.size(); i++) {
                        if (st.pets.get(i).getName() == name){
                            command.learnCommandPet(command, st.pets.get(i));
                        }
                    }   
                }
                if (typeAnimal == 2){
                    PackAnimalsStorage st = new PackAnimalsStorage();
                    for (int i = 0; i < st.packAnimals.size(); i++) {
                        if (st.packAnimals.get(i).getName() == name){
                            command.learnCommandPackAnimal(command, st.packAnimals.get(i));
                        }
                }
            } else if (menuinput == 4) {
                exit = true;
            }
            sc.close();
        }
    }
    }

    
    void programMenu() {
        System.out.println(
                "Добро пожаловать!" + "\n" +
                "Выберите пункт меню:" + "\n"
                        + "1. Завести новое животное" + "\n"
                        + "2. Показать выученные команды" + "\n"
                        + "3. Обучить новой команде" + "\n"
                        + "4. exit" + "\n"

        );
    }
}
