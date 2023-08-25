package Seminar2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1 {
    public class CheckedExample {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

}


