public class swapArrayPosition {
    public static void Swap(int prashu[],int i, int j) {

        int temp=prashu[i];
        prashu[i]=prashu[j];
        prashu[j]=temp;

        
    }
    public static void main(String[] args) {
        int prashu[]=new int[5];
        prashu[0]=125;
        prashu[1]=124;
        prashu[2]=123;
        prashu[3]=122;
        prashu[4]=121;
        Swap(prashu,0,4);

        for (int i = 0; i < prashu.length; i++) {
            System.out.println(prashu[i]);
        }

    }
}
