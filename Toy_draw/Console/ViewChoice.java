package Toy_draw.Console;

import java.util.Scanner;

/**
 * Класс для выбора типа числа
 */
public class ViewChoice implements iView, iGetValue {

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
     * Метод запроса операции
     */
    public int getChoice() {
        System.out.println("\nВот какие действия Вам доступны:");
        System.out.println("1. Показать все игрушки");
        System.out.println("2. Добавить(изменить количество) игрушку");
        System.out.println("3. Разыграть игрушки");
        System.out.println("4. Выход");
        System.out.println("Введите цифру с необходимым действием: ");
        return in.nextInt();
    }

}