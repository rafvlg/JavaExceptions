package Seminar1;

class HomeWork1 {
    public static void arrayOutOfBoundsException() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]); // Выход за пределы массива

}

    public static void divisionByZero() {
        int a = 5;
        int b = 0;
        System.out.println(a / b); // Деление на ноль

}

    public static void numberFormatException() {
        String number = "abc";
        int parsedNumber = Integer.parseInt(number); // Ошибка преобразования строки в число
        System.out.println(parsedNumber);

 }
}

public class Printer {
    public static void main(String[] args) {
        HomeWork1 ans = new HomeWork1();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}