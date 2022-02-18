import java.util.Scanner;

public class AnyToAnyBase {
    public static int anyToDecimal(int n,int b) {
        int rv=0;
        int power=1;
        while(n>0){
            int digit=n%10;
            n=n/10;
            rv+=digit*power;
            power=power*b;
        }
        return rv;
    }
    public static int DecimalToBase(int n,int b) {

        int rv=0;
        int power=1;
        while(n>0){
            int digit=n%b;
            n=n/b;
            rv+=digit*power;
            power=power*10;
        }
        return rv;
        
    }
    public static int getany(int n,int b,int c) {
        int ad=anyToDecimal(n, b);
        int da=DecimalToBase(ad, c);
        return da;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int f=getany(n,b,c);
        System.out.println(f);
    }
}
