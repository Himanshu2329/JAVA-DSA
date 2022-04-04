import java.util.Scanner;

public class PowerLog {
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int x=sc.nextInt();
    //     int n=sc.nextInt();

    //     int xpn=power(x,n);
    //     System.out.println(xpn);
    // }    
    // public static int power(int x,int n) {
    //     if(n==0){
    //         return 1;
    //     }

    //     int xpb2=power(x,n/2);
    //     int xp=xpb2*xpb2;  // x^n= (n^n/2) * (n^n/2) isiiliye 2 baar xbp2 to multiply kra h

    //     if(n%2==1){
    //         xp=xp*x;
    //     }
    //     return xp;
    // }
    public static void main(String[] args) {
        
        int n=2;
        int x=3;
        int power=1;
        for (int i = 1; i <= x; i++) {
            power=power*n;
        }
        System.out.print(power);
    }
}
