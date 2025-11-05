package a.basic.Practice3;

public class Practice5 {
    public static void main(String[] args){
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;

        for (int[] i : matrix){
            for (int j : i){
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
