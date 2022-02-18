import java.util.Scanner;

public class ReverseOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i]=sc.nextInt();
            }

            int left=0;
            int right=a.length-1;
            while (left<right) {
                int temp=a[left];
                a[left]=a[right];
                a[right] =temp;
            }
            left++;
            right--;

            for (int x = 0; x < a.length; x++) {
                System.out.println(a[x]);
            }
            

        
    }
}
