package sliding_window;

import java.util.*;
public class longestSubArrayOneFlip
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    String s=sc.nextLine();
    int l=0,r=0,c=0,ans=0;
    for(r=0;r<s.length();r++){
        if(s.charAt(r)=='0'){
            c+=1;
        }
        while(c>1){
            if(s.charAt(l)=='0'){
                c-=1;
            }
            l+=1;
        }
        ans=Math.max(ans,r-l+1);
    }
    System.out.println(ans);
	}
}

