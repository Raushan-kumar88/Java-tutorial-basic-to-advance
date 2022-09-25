// WAP to find even and odd element from arrays
import java.util.*;
class findEvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,3,62,7,1,9,5,44,5};
        ArrayList<Integer> d1=new ArrayList<>();
        ArrayList<Integer> d2=new ArrayList<>();
        System.out.println("The current arrays : "+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                d1.add(arr[i]);
            }
            else{
                d2.add(arr[i]);
            }
        }
        System.out.print("even element :- ");
        for(int i : d1){
            System.out.print(i+" ");
        }
        
        System.out.print("\nodd element :- ");
        for(int j : d2){
            System.out.print(j+" ");
        }
    }
}