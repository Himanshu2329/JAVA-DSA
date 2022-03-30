import java.util.Scanner;

/**
 * PrintDec
 */
public class PrintDec {

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        PrintDec(n);
    }
    public static void PrintDec(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintDec(n-1);
    }
}