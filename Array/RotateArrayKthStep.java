// in this question we learn rotate array without using any extra array:-
import java.util.*;
class RotateArrayKthStep{
    static void Swap(int arr[],int i,int j){
        // here swap element in arrays
        while(i<j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j--;
            i++;
        }
    }
    static void rotateArray(int arr[],int k){
        int n=arr.length;
        // System.out.println("your work is process ..."+n);
        k=k%n;
        Swap(arr,0,n-k-1);
        Swap(arr,n-k,n-1);
        Swap(arr,0,n-1);
        // return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("enter the element :- ");
        int el=sc.nextInt();
        rotateArray(arr,el);
        System.out.println("your work is process ..."+Arrays.toString(arr));
    }
}