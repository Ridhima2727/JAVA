package ridhima;
import java.util.Arrays;
import java.util.Collections;
public class Binary_Search {
    public static void main(String[] args) {
        int [] arr = {1,7,2,8,0,10,15,81,42,100,43,76};
        Arrays.sort(arr); //--> for ascending order

        //Integer arr[]={1,7,2,8,0,10,15,81,42,100,43,76};
        //Arrays.sort(arr,Collections.reverseOrder()); //--> for descending order
        System.out.println(Arrays.toString(arr));
        System.out.println("Element found at "+binarysearch(arr,81));
    }

    static int binarysearch(int[] arr, int target){
        int start =0;
        int end = arr.length -1;
        int mid = start+((end - start)/2);
        System.out.println(mid);
        while(start<=end) {
            mid =(int) ((start + end)/2);
            System.out.println("mid: "+mid);
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[start] < arr[end]) {
                if (target < arr[mid]) {
                    end = mid - 1;
                    System.out.println("end: "+end);
                } else {
                    start = mid + 1;
                    System.out.println("start: "+start);
                }
            }
            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}