import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int min=arr[i][0];
            int psj=0;
            for (int j = 1; j < arr[0].length; j++) {
                
                if(arr[i][j]<min){
                    min=arr[i][j];
                    psj=j;
                }
            }

            boolean Saddle=true;
            for ( int ii = 0; ii < arr.length; ii++) {
                if(arr[ii][psj]>min){
                    Saddle=false;
                    break;
                }
            }

            if(Saddle==true){
                System.out.println(min);
                return;
            }
        }
        System.out.println("Invalid input");
    }
}
