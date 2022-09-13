import java.util.*;
class ArrayFequency{
    public static void main(String[] args) {
        int arr[] ={2,1,4,3,5,1,2,6,5,5,5,1,3,2};
        int mat[] = new int[7];
        // int k=0;
        int maxcount=0;
        int element_having_max_freq=0;
        for(int i=0;i<arr.length;i++){
            int count=1;
            if(arr[i]!=-1){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count+=1;
                        arr[j]=-1;
                    }
                }
                

                // mat[k]=count;
                // k++;
                maxcount=count;
            }
            if(count>maxcount){
                maxcount=count;
                
                System.out.println(arr[i]+" " + maxcount);
                // System.out.println(arr[i]+" -> "+count);
            }
            
            count=1;
            
    
            
        }
        // System.out.println("The fequency matrix is : " +Arrays.toString(mat));
    }
}