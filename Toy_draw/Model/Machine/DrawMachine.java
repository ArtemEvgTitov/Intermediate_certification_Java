package Toy_draw.Model.Machine;

import java.util.ArrayList;
import java.util.List;
import Toy_draw.Model.Toy.Toy;

/**
 * Класс DrawMachine. Содержит конструктор DrawMachine, метод получения всех
 * игрушек и метод розыгрыша игрушек.
 */
public class DrawMachine {

    private static List<Toy> toys;

    public DrawMachine() {
        this(new ArrayList<>());
    }

    public DrawMachine(List<Toy> products) {
        DrawMachine.toys = products;
    }

    /**
     * Метод получения всех игрушек.
     */
    public List<Toy> getAllToys() {
        List<Toy> result = new ArrayList<>();
        for (int i = 0; i < toys.size(); i++) {
            result.add(toys.get(i));
        }
        return result;
    }

    /**
     * Метод розыгрыша игрушек.
     */
    public void getPrizeToy(int y) {
        int totalFrequency = 0;

        for (Toy toy : toys) {
            if (toy.getQuantity() > 0) {
                totalFrequency += toy.getFrequency();
            }
        }

        if (totalFrequency == 0) {
            return;
        }

        int randomNumber = (int) (Math.random() * totalFrequency);
        int currentFrequency = 0;

        for (Toy toy : toys) {
            if (y <= 0) {
                break;
            }
            if (toy.getQuantity() <= 0) {
                continue;
            }
            currentFrequency += toy.getFrequency();
            if (currentFrequency >= randomNumber) {
                y -= 1;
                System.out.println(toy.toyToString());
                toy.setQuantity(toy.getQuantity() - 1);
            }
        }
        if (y > 0) {
            getPrizeToy(y);
        }
    }
}
