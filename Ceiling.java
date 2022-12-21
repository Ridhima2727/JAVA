package ridhima;

public class Ceiling {
    public static void main(String[] args) {
        int []arr={1,4,9,10,56,87,91};
        int target =5;
        int index = ceiling(arr,target);
        if(target>arr[arr.length-1]){
            System.out.println("No ceiling found!");
        }
        else{
            System.out.println("Ceiling of "+ target+" is "+arr[index]);
        }

    }

    static int ceiling(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = ((start +end)/2);
            System.out.println(mid);
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
        return start;
    }
}
