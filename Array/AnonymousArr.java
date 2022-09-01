// WAP create AnonymousArr and sum of element..
import java.util.*;
class AnonymousArr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the size of array :");
        // int n=sc.nextInt();
        // int A=new int[n];
        // for(int i=0;i<n;i++){
        //     A[i]=sc.nextInt();
        // }
        AnonymousArr.sum(new int[]{2,3,4,5});

    }
    static void sum(int[] no){
        int sum=0;
        for(int i:no){
            sum=sum+i;
        }
        System.out.println("the sum of Anonymous array are : "+ sum);
    }
}