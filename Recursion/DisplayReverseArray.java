import java.util.Scanner;

public class DisplayReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        displayRevArr(arr,0);
    }
    public static void displayRevArr(int []arr ,int idx) {
        if(idx==arr.length){
            return;
        }
        displayRevArr(arr, idx+1); // ye idx+1 se lekr array ke end tk chlega
        System.out.println(arr[idx]);
    }
}
