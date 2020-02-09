package Serialize;


import java.io.*;

public class WriteObjectToFile {
    public static void main(String[] args) {

        Person[] array = {new Person(1, "Jack"), new Person(2, "Bob"),
                new Person(3, "Neil"), new Person(4, "Mike")};
        try {
            FileOutputStream fos = new FileOutputStream("person.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(array);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


class Person implements Serializable {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name : " + name + ", " + "id : " + id;
    }
}