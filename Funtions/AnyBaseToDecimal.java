import java.util.Scanner;

public class AnyBaseToDecimal {
    public static int anyToDecimal(int n,int b) {
        int rv=0;
        int power=1;
        while (n!=0) {
            int digit=n%10;
            n=n/10;
            rv+=digit*power;
            power=power*b;

        }
        return rv;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int b=sc.nextInt();
            int f=anyToDecimal(n,b);
            System.out.println(f);
        }
    }
}
