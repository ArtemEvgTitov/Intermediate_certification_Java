package Toy_draw.Presenter.Runner;

import Toy_draw.Console.View;
import Toy_draw.Presenter.Button.ButtonClick;

public class Run extends ButtonClick implements iRunner {

    View view;
    int id;
    String name;
    int quantity;
    int frequency;

    String password;

    @Override
    public void run() {

        int choice = view.getChoice();

        switch (choice) {
            case 1:
                System.out.println("d");
            case 2:
                System.out.println();
                password = (view.getString("пароль"));
                if (password == "admin") {
                    this.buttonClick();
                }
                // case 3 -> System.out.println((new MultCalc().result(x, y)));
                // case 4 -> System.out.println((new DivCalc().result(x, y)));
        }
    }

}
