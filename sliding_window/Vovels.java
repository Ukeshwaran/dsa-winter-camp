package sliding_window;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Vovels {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc =new Scanner(System.in);
        String st=sc.next();
        int k=sc.nextInt();
        char [] ch ={'a','e','i','o','u'};
        int l=0,ans=0,c=0;
        for(int r=0;r<st.length();r++){
            for (char d : ch) {
                if(d==st.charAt(r)){
                    c++;
                }
            }
            if(r-l+1>k){
                for (char d : ch) {
                if(d==st.charAt(l)){
                    c--;
                }
            }
            l++;
        }
        ans=Math.max(ans,c);
    }
    System.out.println(ans);
}
}