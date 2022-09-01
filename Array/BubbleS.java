// WAP to short array element using bubble short....
import java.util.*;
class BubbleS{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of Array :");
        int n=sc.nextInt();
        int[] arr=new int[n];                       //array creation and intilization
        System.out.println("enter element : ");
        for(int i=0;i<n;i++){
           
            arr[i]=sc.nextInt();
        }
    
        System.out.println("Without sorted array are :" + Arrays.toString(arr));
        int temp;

        for(int i=0;i<arr.length;i++){
            int flag=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag =1;
                }
            }
            if(flag==0){
                break;
            }
        }
        System.out.println("Sorted array are :" + Arrays.toString(arr));
    }
}