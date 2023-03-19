package Toy_draw.Presenter;

import java.util.ArrayList;

import Toy_draw.Model.Machine.DrawMachine;
import Toy_draw.Model.Toy.Toy;
import Toy_draw.View.ViewChoiceOperation;

/**
 * Класс Presenter
 */
public class Presenter {

    static ArrayList<Toy> allToys = new ArrayList<>();

    /**
     * Запуск программы
     */
    public void run(int launch) {

        DrawMachine machine = new DrawMachine(allToys);
        ViewChoiceOperation view = new ViewChoiceOperation();

        if (launch == 0) {
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
        }

        int result = view.getChoice();

        if (result == 1) {
            for (Toy toy : machine.getAllToys()) {
                System.out.println(toy.toyToStringAllInfo());
            }
            run(1);
        } else if (result == 2) {
            int password = view.getValue("Пароль админа");
            int count = 0;

            if (password == 404) {
                String name = view.getString("Название");
                int quantity = view.getValue("Количество");
                int frequency = view.getValue("Шанс выпадения в %");
                for (Toy toy : allToys) {
                    count += 1;
                }
                Toy toy = new Toy(count, name, quantity, frequency);
                allToys.add(toy);
            } else {
                System.out.println("Неверный пароль");
            }
            run(1);
        } else if (result == 3) {
            int prize = view.getValue("количество игрушек для розыгрыша");
            machine.getPrizeToy(prize);
            run(1);
        } else if (result == 4) {
            System.out.println("Хорошего дня!");
        } else {
            System.out.println("Неверный ввод");
            run(1);
        }

    }

}
