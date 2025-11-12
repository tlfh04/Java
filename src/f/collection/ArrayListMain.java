package f.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMain {
    public static void main(String[] args) throws Exception{
        ArrayList<String> l = new ArrayList<>();
        l.add("apple");
        l.add("orange");
        l.add(1,"cherry");
        System.out.println(l);

        String f = l.get(0);
        System.out.println(f);
        l.set(2, "grape");
        System.out.println(l);
        l.remove(0);
        System.out.println(l);
        l.remove("grape");
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains("cherry"));
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        for (Integer num : l2) {
            System.out.println(num);
        }

        System.out.println("\niterator");

        Iterator<Integer> iterator = l2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
