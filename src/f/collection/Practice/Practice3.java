package f.collection.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
        // 테스트 1
        ArrayList<Integer> list1 = new ArrayList<>(
                Arrays.asList(1, 4, 2, 10, 23, 3, 1, 0, 20)
        );
        System.out.println("입력: " + list1 + ", k=4");
        System.out.println("최대 합: " + maxSubArraySum(list1, 4));

        // 테스트 2
        ArrayList<Integer> list2 = new ArrayList<>(
                Arrays.asList(2, 1, 5, 1, 3, 2)
        );
        System.out.println("\n입력: " + list2 + ", k=3");
        System.out.println("최대 합: " + maxSubArraySum(list2, 3));

        // 테스트 3
        ArrayList<Integer> list3 = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );
        System.out.println("\n입력: " + list3 + ", k=2");
        System.out.println("최대 합: " + maxSubArraySum(list3, 2));

        // 테스트 4
        ArrayList<Integer> list4 = new ArrayList<>(
                Arrays.asList(5, 5, 5, 5)
        );
        System.out.println("\n입력: " + list4 + ", k=3");
        System.out.println("최대 합: " + maxSubArraySum(list4, 3));
    }

    public static int maxSubArraySum(ArrayList<Integer> list, int k) {
        // 여기에 코드 작성 (Sliding Window)
        ArrayList<Integer> sumList = new ArrayList<>();
        int sum = 0;
        int max = 0;
        for  (int i = 0; i <= list.size() - k; i++) {
            for (int j = 0; j < k; j++){
                sum += list.subList(i, i + k).get(j);
            }
            sumList.add(sum);
            sum = 0;
        }
        for (int num : sumList) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
