package f.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        System.out.println(hashSet);

        hashSet.add("Apple");
        System.out.println(hashSet);
        System.out.println(hashSet.contains("Melon"));
        hashSet.remove("Apple");
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());

        for (String s : hashSet) {
            System.out.println(s);
        }

        Set<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4,5,6,7,8));
//        // 합집합
//        set.addAll(set2);
//        System.out.println(set);
//        // 교집합
//        set.retainAll(set2);
//        System.out.println(set);
//        // 차집합
//        set.removeAll(set2);
//        System.out.println(set);

        System.out.println(set.containsAll(set2));
    }
}
