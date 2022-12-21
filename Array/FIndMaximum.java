import java.util.*;
class FIndMaximum{
    static int[] tofindMaximum(int[] arr){
        Arrays.sort(arr);
        int []ans={arr[0],arr[arr.length-1]};
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of Arrays : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("enter the element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("my current Arrays : "+Arrays.toString(arr));
        int[] ans = tofindMaximum(arr);
        System.out.println("lowest element is : "+ans[0]+ " and maximum element : "+ans[1]);
        
    }
}