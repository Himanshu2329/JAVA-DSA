import java.util.Scanner;

public class SubtractionAnyBase {
    public static int SubtractionAnyBase(int b,int n1,int n2) {
        int ans=0;
        int bor=0;
        int p=1;
        while (n2>0) {
            int d1=n1%10;
            int d2=n2%10;
            n1/=10;
            n2/=10;

            int diff=d2-d1-bor;
            if(diff<0){
                bor=1;
                diff+=b;
            }
            else{
                bor=0;
            }
            ans+=diff*p;
            p*=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        // int result=SubtractionAnyBase(n1, n2, b);
        int result=SubtractionAnyBase(b, n1, n2);
        System.out.println(result);

    }
}
