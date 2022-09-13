// find kth largest element in given arrays ...
import java.util.*;
class Kthlargest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        int k=3;
        System.out.println("Enter the element : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            if(i==k-1){
                System.out.println("The kth largest element : "+arr[i]);
                break;
            }
        }
        System.out.println("The current arrays : "+Arrays.toString(arr));
    }
}