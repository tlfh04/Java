package e.generic;

class Box {
    private Object item;

    public void set(Object item) {
        this.item = item;
    }

    public Object get() {
        return item;
    }
}

public class WithoutGenerics {
    public static void main(String[] args) {
        Box box = new Box();
        box.set("Hello");

        // 형변환 필요
        String str = (String) box.get();
        System.out.println(str);

        // 런타임 에러 발생 가능
        box.set(123);
        String error = (String) box.get(); // ClassCastException!
    }
}