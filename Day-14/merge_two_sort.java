import java.util.*;
class Future{

    static int [] sort(int arr[] , int arr1[]){
        
        int arr3[] = new int[arr.length + arr1.length];

        int i=0 ,j=0 ,k=0;
        while(i<arr.length && j<arr1.length){

            if(arr[i]< arr1[j]){

                arr3[k]=arr[i];
                i++;
            }else{

                arr3[k]=arr1[j];
                j++;
            }
            k++;
        }

        while(i<arr.length){
            arr3[k]=arr[i];
            i++;
            k++;
        }

        while(j<arr1.length){
            arr3[k]=arr1[j];
            j++;
            k++;
        }

        return arr3;

    }

    public static void main(String [] args){

        int  arr[]={1,3,4};
        int arr1[]={1,2,5,7};

        
        int arr3[]=sort(arr,arr1);

        System.out.println(Arrays.toString(arr3));
    }
}