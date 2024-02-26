package HashMap;

import java.util.*;
public class SumOfTwo
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	HashMap<Integer,Integer> hm = new HashMap<>();
	for(int i=0;i<n;i++){
        hm.put(sc.nextInt(),i);
	}
	int target=sc.nextInt();
	int flag=0;
	for(Integer i:hm.values()){
	    if(hm.containsKey(target-i)){
	        System.out.print(i);
	        System.out.print(hm.get(target-i));
	        flag=1;
	        break;
	    }
	}
	if(flag!=1) System.out.println("-1 -1");
	}
}
