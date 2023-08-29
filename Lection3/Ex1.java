package Lection3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("C:/Users/User/Desktop/HTML & CSS/OneSite/jpg");
            FileWriter writer = new FileWriter("test")) {
            while (reader.ready()) {
                writer.write(reader.read());

            }
        }catch(RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
        System.out.println("Copy seccessfully");
    }
}
