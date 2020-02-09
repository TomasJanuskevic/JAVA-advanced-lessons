import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InterfaceComparator {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("frog");
        animals.add("elephant");
        animals.add("dog");
        animals.add("tiger");
        animals.add("fish");
        Collections.sort(animals, new LengthComparator());
        System.out.println(animals);
    }
}

class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}
