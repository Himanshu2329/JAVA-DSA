import java.util.Scanner;

public class SubtractionOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int one[]=new int[n1];
        for (int i = 0; i < one.length; i++) {
            one[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int two[]=new int[n2];
        for (int i = 0; i < two.length; i++) {
            two[i]=sc.nextInt();
        }
        int diff[]=new int[n2];
        int i=one.length-1;
        int j=two.length-1;
        int k=diff.length-1;

        int borrow=0;
        while (k>=0) {
            int d=two[j]-borrow; 
            if(i>=0){
                  d=d-one[i];
              }
            if(d<0){
                  d=d+10;
                  borrow=1;
            }
            else{
                borrow=0;
            }

            diff[k]=d;  
              
            i--;
            j--;
            k--;
        }
        int x=0;
        while (x<diff.length) {
            if(diff[x]!=0){
                break;
            }
            else{
                x++;
            }
        }
        
        while (x<diff.length) {
            System.out.println(diff[x]);
            x++;
        }
    }
}
