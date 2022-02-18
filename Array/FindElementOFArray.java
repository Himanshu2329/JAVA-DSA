import java.util.Scanner;

public class FindElementOFArray {
    private static int getElement(int arr[],int var) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==var){
                return i;
                // break;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n=scn.nextInt();
            int arr[]=new int[n];

            // for Input
            for (int i = 0; i < arr.length; i++) {
                arr[i]=scn.nextInt();
            }
            
            int var=scn.nextInt();
            // for (int i = 0; i < arr.length; i++) {
            //     if(arr[i]==var){
            //         index=i;
            //         break;
            //     }

            // }
            System.out.println(getElement(arr,var));
        }
    }
}
