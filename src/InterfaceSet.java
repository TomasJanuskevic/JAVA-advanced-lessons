import java.util.Set;
import java.util.TreeSet;

public class InterfaceSet {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("John");
        names.add("Bob");
        names.add("April");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
