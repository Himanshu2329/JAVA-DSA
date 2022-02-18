public class pattern13NCO {
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++){
            int val=1; // Nc0 = 1
            for(int j=0;j<=i;j++){
                System.out.print(val+"\t");
                int ijp1= val*(i-j)/(j+1);
                val=ijp1;
            }
            System.out.println();
        }
    }
}
