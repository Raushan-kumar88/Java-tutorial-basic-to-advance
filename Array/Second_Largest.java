import java.util.*;
class Second_Largest{
    public static void main(String[] args) {
        int arr[] = {2,3,5,7,1,0,55,66,33};
        int large=Integer.MIN_VALUE;
        int second_large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                second_large=large;
                large=arr[i];
            }
            if(arr[i]>second_large && arr[i]!=large){
                second_large=arr[i];
            }
        }
        System.out.println("The second largest no : "+second_large);
    }
}