import java.io.*;
import java.util.*;

public class PalindromicSubstring {

	public static void solution(String str){
		//write your code here
		for (int i = 0; i <str.length() ; i++) {
			for (int j = i+1; j <str.length(); j++) {

				String sub=str.substring(i,j);
				boolean ispal=ispal(sub);
				if(ispal==true){
					System.out.println(sub);
				}


			}
		}
	}
	public static boolean ispal(String sub ) {
		boolean flag=true;
		int left=0;int right=sub.length()-1;
		while ( left<right ) {
			char chleft=sub.charAt(left);
			char chright=sub.charAt(right);
			if(chleft!=chright){
				flag=false;
				break;
			}
			left++;
			right--;
		}
		return flag;

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
}
