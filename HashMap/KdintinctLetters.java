package HashMap;
//find max length of substring that has atmost k distinct letters
import java.util.*;
public class KdintinctLetters
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap<Character,Integer> h = new HashMap<>();
		String s=sc.next();
		int k=sc.nextInt();
		int l=0,c=0,ans=0;
		for(int r=0;r<s.length();r++){
		    char ch=s.charAt(r);
		    h.put(ch,h.getOrDefault(ch,0)+1);
		    while(h.size()>k){
		        if(h.get(s.charAt(l))==1) 
		            h.remove(s.charAt(l));
		        else
		            h.put(s.charAt(l),h.get(s.charAt(l))-1);
		        l+=1;
		    }
		    ans=Math.max(ans,r-l+1);
		}
		System.out.println(ans);
	}
}