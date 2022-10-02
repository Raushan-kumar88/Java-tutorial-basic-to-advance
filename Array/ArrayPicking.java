// create array divide sub array using picking element and sum of sub arrays
import java.util.*;
class ArrayPicking{
    void Pickingelement(int arr1[],int sum,int l,int h){
        if(l>h){
        // input [3,1,2]
        // [][1][2][3][1,2][1,3][2,3][1,2,3]
        // output:0,1,2,3,4,5,6;
            System.out.print(sum+" ");
            return;
        }
        else{
            Pickingelement(arr1,sum+arr1[l],l+1,h);
            Pickingelement(arr1,sum,l+1,h);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of Array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the element :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The current Arrays " + Arrays.toString(arr));
        int low=0;
        int high=arr.length-1;
        int sum=0;
        ArrayPicking ar=new ArrayPicking();
        ar.Pickingelement(arr,sum,low,high);

    }
}