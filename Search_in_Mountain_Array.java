package ridhima;

public class Search_in_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target =10;
        int index =peak(arr);
        System.out.println("The peak element is:"+arr[index]);
        int start = 0;
        int end = index;
        int peakIndex = binsearch(arr,target,start,end);
        if(peakIndex ==-1){
            start=index+1;
            System.out.println(peakIndex);
        }
        else{
            System.out.println(peakIndex);
        }
    }
    static int peak(int []arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+((end-start)/2);
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end = mid;
            }
        }
        return start; //return end;
    }

    static int binsearch(int[]arr, int target, int start, int end){
        while(start<=end){
            int mid = start+((end - start)/2);
            if(target == arr[mid]){
                return mid;
            }
            else if(arr[start]<arr[end]){
                if(target<arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target<arr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
