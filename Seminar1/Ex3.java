package Seminar1;

public class Ex3 {
    public static void main(String[] args) {
        //Node node = new node();
        //ArithmeticException exception = new ArithmeticException()

        try {
            System.out.println("message1");
            throw new ArithmeticException("MESSAGE");
            //System.out.println("message2");
        }catch (ArithmeticException exception) {
            System.out.println("message3");
            System.out.println(exception);
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
        System.out.println("message4");
    }
}
