import java.util.Scanner;

public class countDigitOfnumerber {
    // public static void main(String[] args) {
    //     //  Do while Loop
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int count=0;
    //    do {
    //        n=n/10;
    //         ++count;
    //    } while (n!=0);
    //    System.out.println(count);
    // }
        

    // public static void main(String[] args) {
    // // while
    //     int n=123345;
    //     int count=0;
    //     while(n>0){
    //         n=n/10;
    //         count++;
    //     }
    //     System.out.println(count);
    // }
public static void main(String[] args) {
    // for loop
    int n=123132;
    int count=0;
    int i=n;
    for(;i>0;){
        int q=i/10;
        count=count+1;
        i=q;
    }
    System.out.println(count);
}

}
