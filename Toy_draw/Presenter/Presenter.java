package Toy_draw.Presenter;

import java.util.ArrayList;

import Toy_draw.Model.Machine.DrawMachine;
import Toy_draw.Model.Toy.Toy;

public class Presenter {

    DrawMachine machine;

    static ArrayList<Toy> allToys = new ArrayList<>();

    public void run() {

        Toy toy1 = new Toy(0, "Мягкая игрушка", 1, 10);
        Toy toy2 = new Toy(1, "Жесткая игрушка", 2, 15);
        Toy toy3 = new Toy(2, "Погремушка", 2, 5);
        Toy toy4 = new Toy(3, "Очень жесткая игрушка", 2, 50);
        Toy toy5 = new Toy(4, "Опасная игрушка", 2, 60);
        Toy toy6 = new Toy(5, "Страшная игрушка", 2, 70);

        allToys.add(toy1);
        allToys.add(toy2);
        allToys.add(toy3);
        allToys.add(toy4);
        allToys.add(toy5);
        allToys.add(toy6);

        for (Toy toy : allToys) {
            System.out.println(toy.toyToString());
        }
    }

}
