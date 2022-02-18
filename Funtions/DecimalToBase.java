import java.util.Scanner;

public class DecimalToBase {
    public static int Decimal(int n,int u) {
        int rv=0;
        int smallpower=1;
        while(n>0){
            int digit=n%u;
            n=n/u;

            rv+=digit*smallpower;
            smallpower=smallpower*10;
            // rv++;
        }
        return rv;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int u=sc.nextInt();
            int f=Decimal(n, u);
            System.out.println(f);
        }

    }
}
