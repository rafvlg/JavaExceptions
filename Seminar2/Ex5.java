package Seminar2;

//Throwable
//├── Error
//│   ├── VirtualMachineError
//│   ├── AssertionError
//│   ├── ...
//│
//├── Exception
//    ├── RuntimeException
//    ├── IOException
//    ├── ...
//Throwable
//├── Error
//│   ├── OutOfMemoryError
//│   ├── StackOverflowError
//│
//├── Exception
//    ├── RuntimeException
//    │   ├── NullPointerException
//    │   ├── IndexOutOfBoundsException
//    ├── IOException
//    │   ├── FileNotFoundException
//    │   ├── IOException
//    └── ...

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex5 {
    public static void main(String[] args) {
        try {
            openFile("sample.txt");
        } catch (IOException e) {
            System.out.println("Error opening the file: " + e.getMessage());
        }
    }

    public static void openFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        System.out.println("First line: " + line);
        reader.close();
    }
}
