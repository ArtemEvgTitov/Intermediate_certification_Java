package Toy_draw.View;

import java.util.Scanner;

/**
 * Класс для выбора операции
 */
public class ViewChoiceOperation implements IVeiw, IGetValue {

    Scanner in = new Scanner(System.in);

    @Override
    /**
     * Метод запроса ввода от пользователя
     */
    public double getValue(String msg) {
        System.out.print("Введите " + msg + " > ");
        return in.nextDouble();
    }

    @Override
    /**
     * Метод запроса типа операции
     */
    public int getChoice() {
        System.out.println("\nВыберите операцию:");
        System.out.println("1. Показать все игрушки");
        System.out.println("2. Добавить игрушку");
        System.out.println("3. Разыграть игрушки");
        System.out.println("4. Выход\n");
        return in.nextInt();
    }

}
