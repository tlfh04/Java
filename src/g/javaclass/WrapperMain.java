package g.javaclass;

public class WrapperMain {
    public static void main(String[] args) {
        // Boxing
        int primitive = 10;
        Integer wrapper = Integer.valueOf(primitive);
        System.out.println(wrapper);

        // UnBoxing
        Integer wrapper2 = Integer.valueOf(20);
        int primitive2 = wrapper2.intValue();
        System.out.println(primitive2);

        Integer wrapper3 = 10;
        int primitive3 = wrapper3;
        System.out.println(primitive3);

        Integer w = null;
        System.out.println(w);

        int parsed = Integer.parseInt("123");
        System.out.println(parsed);

        Integer a = 10;
        Integer b = 20;
        System.out.println(b.compareTo(a));
    }
}
