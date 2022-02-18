import java.util.Scanner;

public class DigitFrequency {
    public static int DigitFreq(int n,int d) {
        int rv=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            // q=n;
            if(digit==d){
                rv++;
            }
            
        }
        return rv;
    }
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n=scn.nextInt();
            int d=scn.nextInt();
            int g=DigitFreq(n, d);
            System.out.println(g);
        }

        
    }
}
