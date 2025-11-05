package a.basic;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        // 값 할당
        numbers[0] = 100;
        numbers[1] = 200;
        // 배열 길이
        System.out.println(numbers.length);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        // 선언 후 한칸씩 할당 배열 초기화
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        // 선언과 동시에 배열 초기화
        int[] arr2 = new int[] {1,2,3,4,5};

        // 생략
        int[] arr3 = {1,2,3,4,5};

        String[] names = {"kim","lee","park"};

        System.out.println(names[0]);

        int[] scores = {60,70,25,100,90};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        for (int score : scores){
            System.out.println(score);
        }

        int [][] metrix = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < metrix.length; i++) {
            for (int j = 0; j < metrix[i].length; j++) {
                System.out.println(metrix[i][j]);
            }
        }
        int [][] jagged = {
                {1},
                {2,3},
                {4,5,6},
                {7,8,9,10}
        };

        for (int[] row : jagged){
            for (int i : row){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        // binarySearch()
        int index = Arrays.binarySearch(numbers,5);
        System.out.println(index);

        // fill()
        int[] filled = new int[5];
        Arrays.fill(filled,10);
        System.out.println(Arrays.toString(filled));

        // copyOf()
        int[] original = {1,2,3,4,5};
        int[] copied = Arrays.copyOf(original,original.length);
        System.out.println(Arrays.toString(copied));

        int[] copied2 = original;
        System.out.println(Arrays.toString(copied2));
        original[0] = 100;

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copied));
        System.out.println(Arrays.toString(copied2));

        // copyOfRange()
        int[] ranged = Arrays.copyOfRange(original,1,3);
        System.out.println(Arrays.toString(ranged));

        // equals()
        int[] arr4 = {1, 2, 3};
        int[] arr5 = {1, 2, 3};
        System.out.println(arr4 == arr5);
        System.out.println(Arrays.equals(arr4, arr5));

        // deepToString()
        int[][] matrix = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(matrix));


    }
}
