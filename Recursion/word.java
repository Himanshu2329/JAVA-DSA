import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;

public class word {
    public static final String[] units={
        "",
    " one",
    " two",
    " three",
    " four",
    " five",
    " six",
    " seven",
    " eight",
    " nine",
    " ten",
    " eleven",
    " twelve",
    " thirteen",
    " fourteen",
    " fifteen",
    " sixteen",
    " seventeen",
    " eighteen",
    " nineteen"
    };
    public static final String[] tens= {
        "",
    " ten",
    " twenty",
    " thirty",
    " forty",
    " fifty",
    " sixty",
    " seventy",
    " eighty",
    " ninety"
    };


    public static String convert(final int n) {
        if(n<0){
            return "minus";
        }
        if(n<20){
            return units[n];
        }
        if(n<100){
            return tens[n/10]+" "+units[n%10];
        }
        if(n<1000){
            return units[n/100]+" hundred"+ ((n%100!=0)?" ":"") + convert(n%100);
        }
        if(n<10000){
            return convert(n/1000)+" thousand" +((n%1000!=0)?" ":"")  + convert(n%1000);
        }
        if(n<1000000){
            return convert(n/10000)+" lakh"+((n%10000!=0)?" ":"")+ convert(n%10000);
        }
        else{

            return convert(n/10000000)+" crore"+((n%10000000!=0)?" ":"")+convert(n%10000000);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(convert(n));
    }
}
