import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] m=new int[n];

        for (int i = 0; i < m.length; i++) {
            m[i]=sc.nextInt();
        }
         
        displayArr(m,0);
        
    }
    // E => da(a, v) => a[v] a[v+1] .. a[n - 1]
    // F => da(a, v+1) => a[v+1] a[v+2] .. a[n - 1]
    // EwF => da(a, v) = a[v] da(a, v+1)
    public static void displayArr(int []m,int i) {
        if(i==m.length){
            return;
        }
        System.out.println(m[i]);
        displayArr(m, i+1); // it promises to print everything from i+1 to the end
    }
}
