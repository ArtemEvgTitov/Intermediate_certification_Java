package Toy_draw.Presenter.Button;

import Toy_draw.Console.View;

public class ButtonClick implements iButton {

    View view;
    int id;
    String name;
    int quantity;
    int frequency;

    @Override
    public void buttonClick() {
        id = (view.getValue("ID"));
        name = (view.getString("Name"));
        quantity = (view.getValue("Quantity"));
        frequency = (view.getValue("Frequency"));

    }
    
}
