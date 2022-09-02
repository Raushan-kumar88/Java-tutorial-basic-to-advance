import java.util.*;
class StringSortB{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of Array :");
        int n=sc.nextInt();
        String[] arr=new String[n];
        System.out.println("enter element :");
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        String temp;
        for(int i=0;i<arr.length;i++){
            int flag=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
        System.out.println("current Array are : \n"+Arrays.toString(arr));
    }
}