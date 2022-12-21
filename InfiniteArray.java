package ridhima;

public class InfiniteArray {
    public static void main(String[] args) {
        //we will start with the box of size 2
    int [] arr ={3,5,7,9,10,90,100,130,140,160,170};
    int target = 10;
    System.out.println((ans(arr,target)));
    }

    static int ans(int[] arr, int target) {
        //find the range
        //box of size 2 -- inclusive of start and end index
        int start = 0;
        int end = 1;

        //the target lies in the box if it is less than or equal to the end index.
        // we need not care about the start index
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + ((end - start + 1) * 2);
            start = newStart;
        }
        return binarysearch(arr,target,start,end);
    }

    static int binarysearch(int[] arr, int target,int start, int end){

        while(start<=end) {
            int mid =(start+(end-start)/2);
            if (arr[mid] == target) {
                return mid;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
