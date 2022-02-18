import java.util.Scanner;

/**
 * fact
 */
public class fact {
    public static void display(int n,int r) {
        System.out.println(nFact);
        
    }
    public static int Fact(int x) {
        int fac=1;
        for(int i=1;i<=x;i++){
            fac=fac*i;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        var n=sc.nextInt();
        int r=sc.nextInt();
        int np=Fact(n);
        int npr=Fact(n-r);
        int nfact=np/npr;
        // System.out.println(nfact);
        display(n, r);

    }
}