#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int n;
    scanf("%d",&n);
    int i=0;
    int j=n-1,k=n-1;
    int arr[n], ans[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }    
    while(i<=j){
            if(i==j){
                ans[k]=arr[j]*arr[j];
                i++;
            }
            else if(abs(arr[i])<abs(arr[j])){
                ans[k]=arr[j]*arr[j];
                j--;
            }
            else if(abs(arr[i])==abs(arr[j])){
                ans[k]=arr[j]*arr[j];
                k--;
               ans[k]=arr[i]*arr[i];
                i++;
                j--;
            }
            else if(abs(arr[i])>abs(arr[j])){
                ans[k]=arr[i]*arr[i];
                i++;
            }
            k--;
    }
    for(int i=0;i<n;i++){
        printf("%d ",ans[i]);
    }    
    return 0;
}