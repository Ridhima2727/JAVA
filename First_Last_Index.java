package ridhima;

import java.util.Arrays;

public class First_Last_Index {
    public static void main(String[] args) {
        int [] arr = {5,7,7,7,7,8,9,10};
        int target=7;
        int[] ans ={-1,-1};
        int start_index=getindex(arr,target,true);
        int end_index=getindex(arr,target,false);
        ans[0]=start_index;
        ans[1]=end_index;
        System.out.println(Arrays.toString(ans));
    }

    static int getindex(int[] arr,int target,boolean firstindex){
        //firstindex is true to search the starting index
        //firstindex is false to search the ending index
        int start=0;
        int end =arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+((end-start)/2);
            if (target<arr[mid]){
                end = mid -1;
            }
            else if(target>arr[mid]){
                start = mid +1;
            }
            else{
                ans = mid;//potential ans
                if(firstindex){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}
