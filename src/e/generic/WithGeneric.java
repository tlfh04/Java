package e.generic;

class Box2<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

public class WithGeneric {
    public static void main(String[] args) {
        Box2<String> stringBox = new Box2<>();
        stringBox.set("Hello");

        // 형변환 불필요
        String str = stringBox.get();
        System.out.println(str);

        // 컴파일 에러 발생 - 타입 안정성 보장
        // stringBox.set(123); // 컴파일 에러

        Box2<Integer> intBox = new Box2<>();
        intBox.set(123);
        Integer num = intBox.get();
        System.out.println(num);
    }
}