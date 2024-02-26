package HashMap;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DestinationCity {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String,String> s = new HashMap<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String src=sc.nextLine();
            String des=sc.nextLine();
            s.put(src,des);
        }
        String str="Z";
        for (String x : s.values()) {

                if(!s.containsKey(x)){
                    if(!x.equals(str)){
                        System.out.println(x);
                    }
                    else{
                        System.out.println("A");
                    }
            }
        }
    }
}
