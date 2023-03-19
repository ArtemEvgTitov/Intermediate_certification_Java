package Toy_draw.Model.FindPrize;

import java.util.ArrayList;
import Toy_draw.Model.FileWorker.ReadFile;
import Toy_draw.Model.Toy.Toy;

public class FindToy {

    private ArrayList<Toy> allToys = ReadFile.getAllToys();

    public Toy findToyAllToys(
            String name) {

        if (allToys != null) {
            for (Toy toy : allToys) {
                if (toy.getName().equals(name)) {
                    return toy;
                }
            }
        }
        return null;
    }
}
