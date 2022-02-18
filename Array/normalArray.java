import java.util.Scanner;

/**
 * normalArray
 */
public class normalArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr=sc.nextInt();
        // int arr[]=new int[10];
        int marks[]=new int[arr];
        for(int i=0;i<arr;i++){
            marks[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for (int i = 0; i < marks.length; i++) {
            if(marks[i]==x){
                System.out.println("found at: "+i+1);
            }
        }


        
    }
}