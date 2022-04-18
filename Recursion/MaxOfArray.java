import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n]
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int max=MaxOfArray(arr,0);
        System.out.println(max);
    }
    public static int MaxOfArray(int[]arr,int n) {
        
    }
}
