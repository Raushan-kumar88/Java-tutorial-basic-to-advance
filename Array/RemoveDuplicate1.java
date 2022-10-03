// WAP to remove duplicate element for unsorted arrays..
import java.util.*;
class RemoveDuplicate1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();
        System.out.println("enter the size of Arrays : ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The current Arrays : "+Arrays.toString(arr));
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        for(int no : hs){
            System.out.print(no+" ");
        }
    }
}