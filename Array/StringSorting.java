import java.util.*;
class StringSorting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of Array :");
        int n=sc.nextInt();
        String[] arr =new String[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
        System.out.println("The current Array :"+Arrays.toString(arr));
        String temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
           
        }
        System.out.println("after sorting array "+ Arrays.toString(arr));
        
    }
}