// find maximum submarray in given array also find starting index and ending index of submarray;
import java.util.*;
class MaximumSub{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of Array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the current arrays : "+Arrays.toString(arr));
        int max_far=Integer.MIN_VALUE;
        int max_ending=0;
        int start=0,end=0,s=0;
        for(int i=0;i<arr.length;i++){
            max_ending=max_ending+arr[i];
            if(max_far<max_ending){
                max_far=max_ending;
                start=s;
                end=i;
            }
            if(max_ending<0){
                max_ending=0;
                s=i+1;
            }
        }
        System.out.println(max_far);
        System.out.println("Starting index "+ start +"ending index " + end);
        
    }
}