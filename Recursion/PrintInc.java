import java.util.Scanner;

public class PrintInc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintInc(n);
    }
    public static void PrintInc(int n) {
        if(n==0){
            return;
        }
        PrintInc(n-1);
        System.out.println(n);
    }
}
