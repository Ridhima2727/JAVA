package ridhima;

public class Floor {
    public static void main(String[] args) {
        int []arr={1,4,9,10,56,87,91};
        int target =90;
        int index = floor(arr,target);
        if(target<arr[0]){
            System.out.println("No floor found!");
        }
        else{
            System.out.println("Floor of "+ target+" is "+arr[index]);
        }

    }

    static int floor(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +((end - start)/2);
            if(arr[start]<=arr[end]){
                if (arr[mid]==target){
                    return mid;
                }
                else if(arr[mid]>target){
                    end = mid-1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return end;
    }
}
