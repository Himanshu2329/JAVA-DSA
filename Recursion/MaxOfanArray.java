import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class MaxOfanArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int max=DisplayArray(arr,0);
        DisplayArray(arr,0);
    }
    public static int DisplayArray(int arr[],int i) {
        
    }
}
