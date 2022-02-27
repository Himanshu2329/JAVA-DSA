/**
 * demo
 */
public class demo {

    public static void main(String[] args) {
        int arr[][]=new int[3][4];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[0][3]=4;
        
        arr[1][0]=5;
        arr[1][1]=6;
        arr[1][2]=7;
        arr[1][3]=8;

        arr[2][0]=11;
        arr[2][1]=12;
        arr[2][2]=13;
        arr[2][3]=14;
        for (int i = 0; i < arr.length; i++) { // for rows
            for (int j = 0; j < arr[0].length; j++) { //for coloumns
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }


}