package Seminar2.HomeWork1;

import java.util.Scanner;

public class DivisionCalculator {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        try {
            int result = divideNumbers(number1, number2);
            System.out.println("Результат деления: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int divideNumbers(int number1, int number2) throws DivisionByZeroException {
        if (number2 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }

        return number1 / number2;
    }
}
