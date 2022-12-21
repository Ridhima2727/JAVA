package ridhima;

public class Smallest_Letter {
    public static void main(String[] args) {
        char []arr={'c','f','j'};
        char target ='d';
        char getchr = greaterchar(arr,target);
        System.out.println(getchr);
    }

    static char greaterchar(char[] arr, char target){

        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = ((start +end)/2);
            if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return arr[start%arr.length];
    }
}
