package prefix_sum;

public class QueriesBruteForce
{
	public static void main(String[] args) {
		int[] a={1,6,3,2,7,2};
		int[][] q= {{0,3},{2,5},{2,4}};
		int limit=13;
		int sum=0;
		int x,y;
		for(int i=0;i<3;i++){
		    x=q[i][0];
		    y=q[i][1];
		    for(int j=x;j<y;j++){
		        sum+=a[j];
		    }
		    System.out.println(sum<limit);
		}
	}
}
