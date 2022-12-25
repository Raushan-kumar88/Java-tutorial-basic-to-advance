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


    // next question funcion
    static int[] findFequencyArray(int arr[]){
        // here create fequency array
        int feqArray[] = new int[100005];
        for(int i=0;i<arr.length;i++){
            feqArray[arr[i]]++;
        }
        return feqArray;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("enter the element :- ");
        int el=sc.nextInt();
        rotateArray(arr,el);
        System.out.println("your work is process ..."+Arrays.toString(arr));

System.out.println("------------------------------ next question ------------------------");
        // check no is present or not nested query 
        int arr1[]={2,1,4,3,5,6};
        System.out.println("enter the query of size :");
        int kq=sc.nextInt();
        int freq[]=findFequencyArray(arr1);
        System.out.println("the current Array : "+Arrays.toString(arr1));

        while(kq>0){
            System.out.println("enter the query :");
            int q=sc.nextInt();
            if(freq[q]>0){
            System.out.println("YES ");
                
            }
            else{
            System.out.println("NO");
            }
            kq--;
        }


    }
}