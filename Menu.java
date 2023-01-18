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
                                + "2. Вьючное животное" + "\n");
                int typeAnimal = sc.nextInt();
                if (typeAnimal == 1) {
                    System.out.println("Введите имя животного:");
                    String name = sc.next();
                    System.out.println("Введите дату рождения животного в формате DD.MM.YYYY:");
                    String date = sc.next();
                    Pet newPet = new Pet(name, date);
                    System.out.println(newPet);
                    RegisterAnimal rg = new RegisterAnimal();
                    rg.addPet(newPet);
                }
                if (typeAnimal == 2) {
                    System.out.println("Введите имя животного:" + "\n");
                    String name = sc.next();
                    System.out.println("Введите дату рождения животного в формате DD.MM.YYYY :" + "\n");
                    String date = sc.next();
                    System.out.println("Введите грузоподъемность животного в формате KG.GR :" + "\n");
                    Double carry = sc.nextDouble();
                    PackAnimals newPackAnimal = new PackAnimals(name, date, carry);
                    RegisterAnimal rg = new RegisterAnimal();
                    rg.addPackAnimal(newPackAnimal);
                }
            }
            else if (menuinput == 2) {
                System.out.println("Введите имя животного, чьи комманды нужно показать:\n");
                String name = sc.next();
                System.out.println(
                        "Выберите тип животного:" + "\n"
                                + "1. Домашнее животное" + "\n"
                                + "2. Вьючное животное" + "\n");
                int typeAnimal = sc.nextInt();
                if (typeAnimal == 1) {
                    PetStorage st = new PetStorage();
                    for (int i = 0; i < st.pets.size(); i++) {
                        if (st.pets.get(i).getName() == name) {
                            st.pets.get(i).printCommands(st.pets.get(i).commands);
                        }
                    }
                }
                if (typeAnimal == 2) {
                    PackAnimalsStorage st = new PackAnimalsStorage();
                    for (int i = 0; i < st.packAnimals.size(); i++) {
                        if (st.packAnimals.get(i).getName() == name) {
                            System.out.println(st.packAnimals.get(i).commands);
                        }
                    }
                }
            

            } else if (menuinput == 3) {
                System.out.println("Введите имя животного, которого нужно обучить команде:" + "\n");
                String nameOfAnimal = sc.next();
                System.out.println("Введите название команды, которой нужно обучить животное:" + "\n");
                String nameCommand = sc.next();
                System.out.println(
                        "Выберите тип животного:" + "\n"
                                + "1. Домашнее животное" + "\n"
                                + "2. Вьючное животное" + "\n");
                int typeOfAnimal = sc.nextInt();
                if (typeOfAnimal == 1) {
                    PetStorage st = new PetStorage();
                    for (int i = 0; i < st.pets.size(); i++) {
                        if (st.pets.get(i).getName() == nameOfAnimal) {
                            st.pets.get(i).learnCommand(nameCommand, ((Animal)(st.pets.get(i))));
                        }
                    }
                }
                if (typeOfAnimal == 2) {
                    PackAnimalsStorage st = new PackAnimalsStorage();
                    for (int i = 0; i < st.packAnimals.size(); i++) {
                        if (st.packAnimals.get(i).getName() == nameOfAnimal) {
                            st.packAnimals.get(i).learnCommand(nameCommand, ((Animal)(st.packAnimals.get(i))));
                        }
                    }
                }
            }
            else if (menuinput == 4) {
                exit = true;
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
