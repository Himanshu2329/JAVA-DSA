public class pattern15 {
    public static void main(String[] args) {
        int n=5;
        int sp=n/2;
        int st=1;
        int val=1;
        for(int i=1;i<=n;i++){
            // for spaces
            for(int j=1;j<=sp;j++){
                System.out.print("\t");

            }
            // for stars
            int cval=val;
            for(int j=1;j<=st;j++){
                System.out.print(cval +"\t");
                if(j<=st/2){

                    cval++;
                }
                else{
                    cval--;
                }
            }

            if(i<=n/2){
                st+=2;
                sp--;
                val++;
            }
            else{
                
                st-=2;
                sp++;
                val--;
            }
            System.out.println();
        }

    }
}
