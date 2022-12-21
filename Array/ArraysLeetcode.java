import java.util.*;
class ArraysLeetcode{
    public static void main(String[] args) {
        int[] arr={1,24,5,2,7};
        int target=8;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    int ans[]={i,j};
                    System.out.println("sum of target element index : "+Arrays.toString(ans));
                    
                }

            }
        }
        
    }
}