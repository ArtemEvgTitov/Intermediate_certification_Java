package Toy_draw.Model.Machine;

import java.util.ArrayList;
import java.util.List;
import Toy_draw.Model.Toy.Toy;

public class DrawMachine {
    
    private List<Toy> toys;

    public DrawMachine(){
        this(new ArrayList<>());
    }

    private DrawMachine(List<Toy> products){
        this.toys = products;
    }

    public List<Toy> getAllToys(){
        List<Toy> result = new ArrayList<>();
        for (int i = 0; i < toys.size(); i++) {
                result.add(toys.get(i));
        }
        return result;
    }
}
