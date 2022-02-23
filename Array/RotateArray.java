import java.util.Scanner;
public class RotateArray {
    public static void reverse(int arr[],int left,int right) {
        // left=0;
        // right=arr.length-1;
        while (left<=right) {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right] =temp;
            left++;
            right--;
        }
        
    }
    public static void rotate(int arr[],int k) {
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }
        reverse(arr,0,arr.length-1-k);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();

        // rotate(arr, k);





    }
}
