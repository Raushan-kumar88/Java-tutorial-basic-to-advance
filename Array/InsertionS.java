import java.util.*;
class InsertionS{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the element :");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("the Current array :"+Arrays.toString(arr));

        int temp,j;
        for(int i=1;i<arr.length;i++){
            temp=arr[i];
            j=i;                                    
            while(j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;
        }
        System.out.println("the current array : "+ Arrays.toString(arr));
    }
}