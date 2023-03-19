package Toy_draw.Model.FindPrize;

import java.util.ArrayList;
import Toy_draw.Model.FileWorker.ReadFile;
import Toy_draw.Model.FileWorker.SafeFile;
import Toy_draw.Model.Toy.Toy;

public class GetPrizeToy {

    static void getPrizeToy(int y) {

        int totalFrequency = 0;
        int currentFrequency = 0;
        int randomNumber = (int) (Math.random() * totalFrequency);
        ArrayList<Toy> allToys = ReadFile.getAllToys();

        for (Toy toy : allToys) {
            if (toy.getQuantity() > 0) {
                totalFrequency += toy.getFrequency();
            }
        }

        if (totalFrequency == 0) {
            return;
        }

        for (Toy toy : allToys) {

            if (y <= 0) {
                break;
            }
            if (toy.getQuantity() <= 0) {
                continue;
            }
            currentFrequency += toy.getFrequency();
            if (currentFrequency >= randomNumber) {
                y -= 1;
                System.out.println(toy.toString());
                toy.setQuantity(toy.getQuantity() - 1);
                SafeFile.safeFile();
            }
        }

        if (y > 0) {
            getPrizeToy(y);
        }
    }

}
