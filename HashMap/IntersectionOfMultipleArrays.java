package HashMap;

//intersection of multiple arrays(without sorting) without duplicates
import java.util.*;
public class IntersectionOfMultipleArrays
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap<Character,Integer> h = new HashMap<>();
		int[][] nums={{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
		HashMap<Integer,Integer> m=new HashMap<>();
		for(int[] row : nums){
		    for(int x : row){
		        m.put(x,m.getOrDefault(x,0)+1);
		    }
		}
		ArrayList<Integer> a=new ArrayList<>();
		for(Integer x : m.keySet()){
		    if(m.get(x)==nums.length)
		        a.add(x);
		}
	    Collections.sort(a);
	    System.out.println(a);
	}
}

//intersection of multiple arrays(without sorting) with duplicates 