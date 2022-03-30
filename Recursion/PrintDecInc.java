import java.util.Scanner;

public class PrintDecInc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintDecInc(n);
    }
    public static void PrintDecInc (int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintDecInc(n-1);
        System.out.println(n);
    }
}
