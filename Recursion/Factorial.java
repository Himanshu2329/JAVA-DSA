import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=Factorial(n);
        System.out.println(a);
    }
    public static int Factorial(int n) {
        if(n==0){
            return 1;
        }
        int fm=Factorial(n-1);
        int fn=n*fm;
        return fn;
    }
}
