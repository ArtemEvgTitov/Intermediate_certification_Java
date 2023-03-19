package Toy_draw.Model;

public class Toy extends ToyModel {
    
    private int id;
    private String name;
    private int quantity;
    private int frequency;

    public Toy(int id, String name, int quantity, int frequency){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.frequency = frequency;
    }

    public Toy(String name, int quantity, int frequency){
        this.name = name;
        this.quantity = quantity;
        this.frequency = frequency;
    }

    public int getID(){
        return id;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getFrequency(){
        return frequency;
    }

    public void setFrequency(int frequency){
        this.frequency = frequency;
    }

    public String toyToString(){
        return "Наименование: " + name + "\nКоличество: " + quantity;
    }

}
