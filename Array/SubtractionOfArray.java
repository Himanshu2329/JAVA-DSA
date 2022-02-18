import java.util.Scanner;

public class SubtractionOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int one[]=new int[n1];
        for (int i = 0; i < one.length; i++) {
            one[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int two[]=new int[n2];
        for (int i = 0; i < one.length; i++) {
            two[i]=sc.nextInt();
        }
    }
}
