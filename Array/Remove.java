import java.util.*;
class Remove{
    public static void main(String[] args) {
        int[] arr={2,6,3,21,88,9,0};
        int dele=21;
        System.out.println("The current Arrays " + Arrays.toString(arr)); 
        for(int i=0;i<arr.length;i++){
            if(dele==arr[i]){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                    
                }
                break;
            }
            
        }
        System.out.print("After removing element Arrays : ");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}