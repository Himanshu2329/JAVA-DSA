import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();

        int xpn=power(x,n);
        System.out.println(xpn);
    }
    public static int power(int x,int n) {
        if(n==0){
            return 1;
        }
        int xp=power(x,n-1); // x.x....n time
        int xpn=xp*x;

        return xpn;
        
    }
    
}
