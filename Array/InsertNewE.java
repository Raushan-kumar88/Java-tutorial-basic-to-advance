// WAP to add new element in given position
import java.util.*;
class InsertNewE{
    public static void main(String[] args) {
        int arr[] = {1,4,2,6,3,7};
        int pos=3;
        int ele=9;
        for(int i=arr.length-1;i>pos-1;i--){
            arr[i]=arr[i-1];  
        }
        arr[pos-1]=ele;
        System.out.println("The current Array : "+Arrays.toString(arr));
    }
}