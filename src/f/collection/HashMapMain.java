package f.collection;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Apple",1000);
        map.put("Banana",2000);
        map.put("Cherry",3000);
        System.out.println(map);

        int price = map.get("Apple");
        System.out.println(price);
        System.out.println(map.containsKey("Apple"));
        System.out.println(map.containsValue(2000));

        map.put("Apple",5000);
        System.out.println(map);

        map.remove("Banana");
        System.out.println(map);
        System.out.println(map.isEmpty());

        System.out.println(map.get("Durian"));
        System.out.println(map.getOrDefault("Durian",0));

        if (map.containsKey("Durian")){
            System.out.println(map.get("Durian"));
        }
        map.putIfAbsent("Durian",1000);
    }
}
