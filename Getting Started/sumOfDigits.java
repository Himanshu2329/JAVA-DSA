public class sumOfDigits {
    public static void main(String[] args) {
        int n=12123;
        int count=0;
        while(n>0){
            int q=n%10;
            count=count+q;
            n=n/10;
        }
        System.out.println(count);
    }
    
}
