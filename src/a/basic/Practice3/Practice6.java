package a.basic.Practice3;
import java.util.Arrays;

public class Practice6 {
    public static void main(String[] args) {
        int[] arr = {45, 23, 78, 12, 89, 34};
        Arrays.sort(arr);
        System.out.println("두 번째로 큰 수:"+arr[arr.length-2]);
    }
}
