// WAP TO sort array in using selection 
import java.util.*;
class SelectionSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of Array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter element :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("without sorting :\n"+Arrays.toString(arr));
        int min,temp=0;
        for(int i=0;i<n;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
     System.out.println("after sorting array :\n"+Arrays.toString(arr));   
    }
}