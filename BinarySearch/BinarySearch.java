package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] n={10,20,30,40,50,60,70,80,90,100};
        int t = 30;
        System.out.println(binarysearch(n,0,n.length-1,t));
    }
    public static int binarysearch(int[] n,int l,int r,int t) {
        if(l<=r){
            int mid=(l+r)/2;
            if(n[mid]==t)
                return mid;
            else if(n[mid]<t)
                return binarysearch(n, l=mid+1, r, t);
            else
                return binarysearch(n, l, r=mid-1, t);
            }
        else
            return -1;
}
}
