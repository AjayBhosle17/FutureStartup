import java.util.*;

class Future{

    static int[] sort(int arr[]){

        int red=0,white=0,blue=0;

        for(int i=0 ;i <arr.length ;i++){

                if(arr[i]==0){
                    red++;
                }else if(arr[i]==1){

                    white++;
                }else{
                    blue++;
                }
        }

        for(int i=0 ;i <arr.length ;i++){

            if(i<red){

                arr[i]= 0;

            }else if(i<red+white){
                arr[i]=1;

            }else{
                arr[i]=2;
            }
        }
        return arr;
    }
    public static void main(String[] args) {

        int test_case1[] = new int[] {2,0,2,1,0,1};
        int test_case2[] = new int[] {2,0,1};

        int output1[] = sort(test_case1);
        int output2[] = sort(test_case2);

        System.out.println(Arrays.toString(test_case1) + " Output is "+Arrays.toString(output1));
        System.out.println(Arrays.toString(test_case2) + " Output is "+Arrays.toString(output2));

    }
}