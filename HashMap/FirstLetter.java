package HashMap;

import java.util.*;
public class FirstLetter
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s=sc.next();
	char [] ch =s.toCharArray();
	Set<Character> hs=new HashSet<>();
	for(char c : ch){
	 if(hs.contains(c)){
	     System.out.println(c);
	     break;
	 }
	 else{
	     hs.add(c);
	}
	}
}
}
