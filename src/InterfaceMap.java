import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class InterfaceMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(3, "three");
        map.put(2, "two");
        map.put(4, "four");
        Map<Integer, String> map2=new LinkedHashMap<>(map);

        for(Map.Entry<Integer, String>entry: map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        for(Map.Entry<Integer, String>entry: map2.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
