import java.util.*;
public class ExitPointMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int dir=0;
        int i=0;
        int j=0;
        while (true) {
            dir=(dir+arr[i][j])%4;
            if(dir==0){
                j++;
                if(j==arr[0].length){
                    j--;
                    break;
                }
            }
            else if(dir==1){
                i++;
                if(i==arr.length){
                    i--;
                    break;
                }
            }
            else if(dir==2){
                j--;
                if(j==-1){
                    j++;
                    break;
                }
            }
            else{
                i--;
                if(i==-1){
                    i++;
                    break;
                }
            }
        }
        System.out.println(i);
        System.out.println(j);

    }
}
