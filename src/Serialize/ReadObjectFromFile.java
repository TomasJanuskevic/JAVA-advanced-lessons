package Serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObjectFromFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("person.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person[] array = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(array));
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
