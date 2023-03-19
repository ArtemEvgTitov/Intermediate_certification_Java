package Toy_draw;

import Toy_draw.Model.Toy.Toy;

public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy(0, "Медведь", 5, 10);
        System.out.println(toy1.toyToString());
    }
}