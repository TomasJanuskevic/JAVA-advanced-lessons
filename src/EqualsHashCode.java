import java.util.Objects;

public class EqualsHashCode {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Greg");
        Student student2 = new Student(2, "Bob");
        Student student3 = new Student(2, "Bob");

        System.out.println(student2.equals(student1));
        System.out.println(student2.equals(student3));
    }

}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

