package Seminar1;

public class Ex2 {
    public static void main(String[] args) {
        int num[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int num2[] = {2, 0, 4, 4, 0, 8};
        try { //Внешний
        for (int i = 0; i < num.length; i++) {
            try { //Внутренний
                System.out.println(num[i] + " / " + num2[i] + " = " + num[i] / num2[i]);
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("ERROR !!! Array !!!");
            }
        }
    }catch (ArithmeticException exceptionexception) {
        System.out.println("Division 0 !!!");
        }
    }
}
