import java.util.Scanner;

/**
 * InverseOfArray
 */
public class InverseOfArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int inv[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            inv[arr[i]]=i;
        }
        for(int x=0;x<arr.length;x++){
            System.out.println(inv[x]);
        }
    }
}