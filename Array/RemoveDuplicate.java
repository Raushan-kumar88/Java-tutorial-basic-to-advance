// WAP to remove duplicate element from arrays
import java.util.*;
class RemoveDuplicate{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6,7,7};
        int[] temp=new int[arr.length];
        int j=0;
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                j++;
                count+=1;           // this condition for only sorted array;

            }
        }
        temp[j]=arr[arr.length-1];
        for(int i=0;i<=count;i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println("\nThe current Arrays : "+Arrays.toString(temp));
    }
}