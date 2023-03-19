package Toy_draw.Presenter;

import java.util.ArrayList;
import java.util.List;

import Toy_draw.Model.Machine.DrawMachine;
import Toy_draw.Model.Toy.Toy;
import Toy_draw.View.ViewChoiceOperation;

public class Presenter {

    DrawMachine machine;
    ViewChoiceOperation view;

    static ArrayList<Toy> allToys = new ArrayList<>();

    public void run() {

        Toy toy1 = new Toy(0, "Кукла", 1, 10);
        Toy toy2 = new Toy(1, "Машинка", 2, 15);
        Toy toy3 = new Toy(2, "Погремушка", 2, 5);
        Toy toy4 = new Toy(3, "Самолётик", 2, 50);
        Toy toy5 = new Toy(4, "Конструктор", 2, 60);
        Toy toy6 = new Toy(5, "Расскраска", 2, 70);

        allToys.add(toy1);
        allToys.add(toy2);
        allToys.add(toy3);
        allToys.add(toy4);
        allToys.add(toy5);
        allToys.add(toy6);

        DrawMachine machine = new DrawMachine(allToys);
        ViewChoiceOperation view = new ViewChoiceOperation();

        int result = view.getChoice();

        if (result == 1) {
            List<Toy> res = machine.getAllToys();
            for (Toy toy : res) {
                System.out.println(toy.toyToStringAllInfo());
            }
            run();
        } else if (result == 2) {
            int password = view.getValue("Пароль админа");
            int count = 0;

            if (password == 1) {
                String name = view.getString("Название");
                int quantity = view.getValue("Количество");
                int frequency = view.getValue("Шанс выпадения в %");
                for (Toy toy : allToys) {
                    count += 1;
                }
                Toy toy = new Toy(count + 1, name, quantity, frequency);
                allToys.add(toy);
            } else {
                System.out.println("Неверный пароль");
            }
            run();
        } else if (result == 3) {
            machine.getPrizeToy(1);
            run();
        } else if (result == 4) {
            System.out.println("Хорошего дня!");
        } else {
            System.out.println("Неверный ввод");
            run();
        }

    }

}
