import java.util.*;
class Demo{

	static int [] array(int arr[]){

		for(int i =0 ;i<arr.length-1 ;i++){

			if(arr[i]==arr[i+1]){

				arr[i]=arr[i]*2;
				arr[i+1]=0;
			}
		}

		int k=0;
		for(int i=0 ;i<arr.length-1 ;i++){

			if(arr[i]!=0){

				int temp = arr[k];
				arr[k]=arr[i];
				arr[i]=temp;

				k++;
			}
		}


		return arr;
	}
	public static void main(String [] args){

		int arr[] = {2,2,0,2,0,1,0};

		int arr1[]= array(arr);

		System.out.println(Arrays.toString(arr));
	}
}
