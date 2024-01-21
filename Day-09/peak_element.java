import java.util.*;
class Future{

    static int peak(int arr[]){

        int start=0;
        int end=arr.length;
        
        while(start<end) {

            int mid = start+(end-start)/2;

            if(arr[mid]< arr[mid+1]){

                start=mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        
        int arr[]=new int []{1,2,3,1};
        int arr1[]=new int []{1,2,1,3,5,6,4};


        System.out.println(Arrays.toString(arr) + " Output is -> " + peak(arr));
        System.out.println(Arrays.toString(arr1) + " Output is -> " + peak(arr1));
    }
}