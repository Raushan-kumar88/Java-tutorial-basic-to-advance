import java.util.*;
public class twoArrayProblem
{
    public static void calUnion(int arr[],int arr2[]){
        System.out.println("find Union of two Arrays element : ");
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++ ){
            hs.add(arr[i]);
        }
        for(int i=0;i<arr2.length;i++ ){
            hs.add(arr2[i]);
        }
        System.out.println(hs.size()+" element is Union : "+hs+" ");
         return;
    }
    public static void calIntersection(int arr[],int arr2[]){
        System.out.println("find Intersection of two Arrays element : ");
        HashSet<Integer> hs = new HashSet<>();
        int count=0;
        for(int i=0;i<arr.length;i++ ){
            hs.add(arr[i]);
        }
        for(int i=0;i<arr2.length;i++ ){
            if(hs.contains(arr2[i])){
                hs.remove(arr2[i]);
                count++;
                System.out.print(arr2[i]+" ");
            }
        }
        System.out.println(" the total intersection element : "+count);
        return;
    }
	public static void main(String[] args) {
		System.out.println("find Union element and intersection element : ");
		int []arr={7,3,9};
		int[] arr2={6,3,9,2,9,4};
        // this funciton is calculate union
		calUnion(arr,arr2);
        // this funciton is calculate Intersection 
		calIntersection(arr,arr2);
	}
}