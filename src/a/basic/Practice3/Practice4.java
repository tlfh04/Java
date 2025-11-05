package a.basic.Practice3;

public class Practice4 {
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        int[] count = new int[5];
        for (int i : arr){
            count[i]++;
        }
        System.out.println("1:"+count[1]+"개");
        System.out.println("2:"+count[2]+"개");
        System.out.println("3:"+count[3]+"개");
        System.out.println("4:"+count[4]+"개");
    }
}
