package HashMap;

import java.util.*;
public class FirstLetterBruteForce
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s=sc.next();
	char [] ch =s.toCharArray();
	boolean flag=false;
    for(int i=0;i<ch.length;i++){
        for(int j=0;j<i;j++){
            if(ch[i]==ch[j] && i!=j){
                System.out.println(ch[i]);
                flag=true;
                break;
            }
        }
        if(flag) break;
    }
}
}
