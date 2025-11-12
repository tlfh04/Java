package e.generic.Practice;

class Calculator<T>{
    private T First;
    private T Second;

    public Calculator(T first, T second) {
        First = first;
        Second = second;
    }

    public T getFirst() {
        return First;
    }

    public T getSecond() {
        return Second;
    }

    public void printBoth(){
        System.out.println("First: " + First+" Second: "+Second);
    }
    public boolean areEqual(){
        return First.equals(Second);
    }
}

public class Practice {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>(10, 20);
        intCalc.printBoth();
        System.out.println("같은 값? " + intCalc.areEqual());

        // String Calculator
        Calculator<String> strCalc = new Calculator<>("Hello", "Hello");
        strCalc.printBoth();
        System.out.println("같은 값? " + strCalc.areEqual());

        // Double Calculator
        Calculator<Double> doubleCalc = new Calculator<>(3.14, 2.71);
        System.out.println("첫 번째: " + doubleCalc.getFirst());
        System.out.println("두 번째: " + doubleCalc.getSecond());
        System.out.println("같은 값? " + doubleCalc.areEqual());
    }
}
