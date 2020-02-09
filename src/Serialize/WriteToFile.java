package Serialize;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {


    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test2.doc");
        PrintWriter pw = new PrintWriter(file);
        pw.println("Hello my friend");
        pw.println("Have a good day");
        pw.close();
    }
}
