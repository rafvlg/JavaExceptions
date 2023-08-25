package Lections2;

import java.util.Collection;

public class Ex1 {
    public static void main(String[] args) {
        int number = 1;
        try{
            number = 10 / 1;
            String test = null;
            System.out.println(test.length());
            
        } catch (ArithmeticException e){
            System.out.println("Operation divide by zero not supported");
        } catch (NullPointerException e){
            System.out.println("nullpointer exeption");
        } catch (Exception e){
            System.out.println("Exception");
        }
        System.out.println(number);
    }
}
