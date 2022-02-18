import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int c=0;
            while (n>0) {
                int q=n%10;
                q=n/10;
                q=n;
            }
            System.out.println(n);
        }

    }
    
}
