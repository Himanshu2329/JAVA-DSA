import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int data=sc.nextInt();
        int lo=0;
        int foundAt=-1;
        int hi=arr.length-1;
        while (lo<=hi) {
            int mid=(lo+hi)/2;
            if(data<arr[mid]){
                hi=mid-1;
            }
            else if(data>arr[mid]){
                lo=mid+1;
            }
            else{
                foundAt=mid;
                break;
            }
        }
        System.out.println(foundAt);
    }
}
