import java.util.*;
class BinarySearch{
    public static void main(String[] args) {
        System.out.println("Binary search....");
        int[] arr={2,3,9,1,7,4,77};
        Arrays.sort(arr);
        int k=4;
        int li=0;
        int hi=arr.length-1;
        // int mid=(li+hi)/2;
        // System.out.println(mid);
        while(li<=hi){
            int mid=(li+hi)/2;
            if(arr[mid]==k){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<k){
                li=mid+1;   
            }
            else if(arr[mid]>k){
                hi=mid-1;
            }
            // mid=(li+hi)/2;
        }
    }
}