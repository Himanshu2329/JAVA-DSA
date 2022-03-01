import java.util.Scanner;

public class MatrixMultiply {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int rmin=0;
        int rmax=n-1;
        int cmin=0;
        int cmax=m-1;
        int count=0;
        while (count<n*m) {
            // for left boundary
          

                for (int row = rmin; row <=rmax &&count<n*m; row++) {
                    System.out.println(arr[row][cmin]);
                    count++;
                }
                cmin++;
                
            // for bottom boundary
            for (int col = cmin; col <=cmax &&count<n*m; col++) {
                System.out.println(arr[rmax][col]);
                count++;
            }
            rmax--;
            
            // right boundary
            for (int row =rmax ; row >=rmin &&count<n*m; row--) {
                System.out.println(arr[row][cmax]);
                count++;
            }
            cmax--;
            
            // top boundary
            for (int col = cmax; col>=cmin &&count<n*m; col--) {
                System.out.println(arr[rmin][col]);
                count++;
            }
            rmin++;
        
        }

    }
}
