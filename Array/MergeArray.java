import java.util.*;
class MergeArray{
    public static void main(String[] args) {
        System.out.println("merge two arrays.");
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
    
        int n=arr1.length+arr2.length;
        System.out.println(n);
        int[] arr3=new int[n];
        int k=0;
        int j=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                k++;
            }
            else if(arr2[j]<arr1[i]){
                arr3[k]=arr2[j];
                j++;
                k++;
            }
            else if(arr1[i]==arr2[j]){
                arr3[k]=arr1[i];
                k++;
                i++;
                j++;
            }
        }
        
        for(j=0;j<arr2.length;j++){
            arr3[arr1.length+j]=arr2[j];
        }
        System.out.println("the merge array : "+Arrays.toString(arr3));
    }
}