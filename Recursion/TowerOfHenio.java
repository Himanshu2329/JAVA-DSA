import java.util.Scanner;

public class TowerOfHenio {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t1id=sc.nextInt();
        int t2id=sc.nextInt();
        int t3id=sc.nextInt();
        toh(n,t1id,t2id,t3id);
    }
    // E => toh(3, a, b, c) => It is supposed to print valid (r123) instructions to move 3 discs from a to b using c
    // F1 => toh(2, a, c, b) => It will print valid(r123) instructions to move 2 discs from a to c using b
    // F2 => toh(2, c, b, a) => It will print valid(r123) instructions to move 2 discs from c to b using a
    
    public static void toh(int n,int t1id,int t2id,int t3id) {
        toh(n - 1, t1id, t3id, t2id); // t1 has only 1 disc now, t2 is empty, t3 has two discs
        System.out.println(n + "[" + t1id + " -> " + t2id + "]"); // t1 is empty, t2 has 3rd disc, t3 has top two 
        toh(n - 1, t3id, t2id, t1id); // t1 is empty, t2 has all, t3 is empty
        
    }
}
