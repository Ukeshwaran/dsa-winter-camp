package PriorityQueue_heap;
//find k best elements in nlog k
import java.util.*;
public class KBestElements
{
	public static void main(String[] args) {
	int[] arr = {10,20,40,30,50,60,70,90,80,100};
	PriorityQueue<Integer> min = new PriorityQueue<>();
	PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
	int k=2;
	for(int i=0;i<arr.length;i++){
	    max.add(arr[i]);
	    min.add(arr[i]);
	    if(min.size()>k)
	       	min.remove();
	    if(max.size()>k)
	        max.remove();
	}
	for(int i=0;i<k;i++){
	    System.out.println(min.remove());
	}
	for(int i=0;i<k;i++){
	    System.out.println(max.remove());
	}
}
}