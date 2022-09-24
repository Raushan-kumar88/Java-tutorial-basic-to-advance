// WAP to find first duplicate element from arrays.
import java.util.*;
class firstDuplicate{
    public static void main(String[] args) {
        System.out.println("first duplicate element :-");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of arrays : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("current arrays :- "+Arrays.toString(arr));
        // for(int i=0;i<arr.length-1;i++){
        //     int temp=0;
        //     for(int j=i+1;j<n;j++){
                
        //         if(arr[i]==arr[j]){
        //             System.out.println("first duplicate element "+arr[i]);
        //             temp+=1;
        //             break;
        //         }
        //     }
        //     if(temp>0){
        //         break;
        //     }
        // }
        // another way by using hashset function..
        int temp=-1;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=arr.length-1;i>=0;i--){
            if(hs.contains(arr[i])){
                temp=i;
            }
            else{
                hs.add(arr[i]);
            }
        }
        if(temp!=-1){
            System.out.println("the duplicate element : "+arr[temp]);
        }
        else{
            System.out.println("no duplicate element.");
        }
    }
}