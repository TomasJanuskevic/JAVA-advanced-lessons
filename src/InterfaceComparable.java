import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterfaceComparable {
    public static void main(String[] args) {
        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person(30, "John"));
        personsList.add(new Person(200, "Mike"));
        personsList.add(new Person(102, "Bob"));
        Collections.sort(personsList);
        System.out.println(personsList);
    }
}

class Person implements Comparable<Person> {
    int Id;

    public int getId() {
        return Id;
    }

    String name;

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int id, String name) {
        Id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        if (this.Id > o.getId()) {
            return 1;
        } else if (this.Id < o.getId()) {
            return -1;
        } else {
            return 0;
        }

    }
}