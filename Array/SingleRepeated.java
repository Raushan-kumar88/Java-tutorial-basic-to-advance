// WAP to find Single Repeated element in list 
import java.util.*;
class SingleRepeated{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of Arrays :");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter the element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The current Arrays : "+Arrays.toString(arr));
        int rep=arr[0];
        for(int i=1;i<arr.length;i++){
            rep=rep^arr[i];
        }
        System.out.println("The single repeated element : "+rep);
    }
}