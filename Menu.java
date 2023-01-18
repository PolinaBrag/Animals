package Animals.Animals;

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
                    Pet newPet = new Pet(name, date);
                    RegisterAnimal.addPet(newPet);
                }
                if (typeAnimal == 2){
                    System.out.println("Введите имя животного:" + "\n");
                    String name = sc.next();
                    System.out.println("Введите дату рождения животного в формате DD.MM.YYYY :" + "\n");
                    String date = sc.next();
                    System.out.println("Введите грузоподъемность животного в формате KG.GR :" + "\n");
                    Double carry = sc.nextDouble();
                    PackAnimals newPackAnimal = new PackAnimals(name, date, carry);
                    RegisterAnimal.addPackAnimal(newPackAnimal);
                }
            } else if (menuinput == 2) {
                //действие2
            } else if (menuinput == 3) {
                //действие3
            } else if (menuinput == 4) {
                exit = true;
            }
            sc.close();
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
