public class asd {
    public static void main(String[] args) {
        
       int n = 5;
 
       //upper part
       for(int i=1; i<=n-2; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
 
       //lower part
       for(int i=n-1; i>=1; i--) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }   


    }

