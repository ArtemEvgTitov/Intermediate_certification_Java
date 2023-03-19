package Toy_draw.Model.FileWorker;

import java.io.*;
import java.util.ArrayList;
import Toy_draw.Model.Toy.Toy;

public class ReadFile {

    static String fileName = "toys.dat";
    static ArrayList<Toy> allToys = readFile();

    public static ArrayList<Toy> readFile() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {

            allToys = ((ArrayList<Toy>) ois.readObject());
        } catch (Exception ex) {

            allToys = new ArrayList<>();
            System.out.println(ex.getMessage());
        }

        return allToys;
    }
}
