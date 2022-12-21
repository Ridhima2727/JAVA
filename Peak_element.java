package ridhima;

public class Peak_element {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,8,5,4,3,1};
        System.out.println(arr[peak(arr)]);
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
}
