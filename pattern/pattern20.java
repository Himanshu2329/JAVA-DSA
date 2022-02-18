/**
 * pattern20
 */
public class pattern20 {

    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||j==n){
                    System.out.print("*\t");
                }
                else if(i>n/2&&(n+1==i+j||i==j)){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}