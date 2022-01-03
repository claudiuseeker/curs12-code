package ro.fasttrackit.curs12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TryMap {
    public static void main(String[] args) {
        final Map<String, Integer> nameToAge = new HashMap<>();
        nameToAge.put("Ana", 30);
        nameToAge.put("Ionel", 20);
        nameToAge.put("Mircea", 33);
        nameToAge.put("Raluca", 25);
        nameToAge.put("Dragos", 54);
        nameToAge.put("Costel", 12);

        System.out.println(nameToAge);
        System.out.println(nameToAge.get("Ana"));
        System.out.println(nameToAge.get("Ana132"));
        nameToAge.put("Ana", 100);
        System.out.println(nameToAge.get("Ana"));
        System.out.println(nameToAge);

        nameToAge.remove("Mircea");
        System.out.println(nameToAge);
        System.out.println(nameToAge.containsKey("Ana"));
        System.out.println(nameToAge.containsKey("not-Ana"));
        System.out.println(nameToAge.containsValue(333));
        System.out.println(nameToAge.containsValue(20));

        System.out.println(nameToAge.keySet());
        System.out.println(nameToAge.values());

        Set<Map.Entry<String, Integer>> entries = nameToAge.entrySet();
        System.out.println(entries);

        for (String key : nameToAge.keySet()){
            System.out.println(key + " = " + nameToAge.get(key));
        }
        System.out.println("-----");

        for (Map.Entry<String, Integer> entry : nameToAge.entrySet()){
            System.out.println(entry.getKey() +  " = " + entry.getValue());
        }
    }
}
