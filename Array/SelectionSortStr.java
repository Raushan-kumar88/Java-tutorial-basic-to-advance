// WAP TO short String using selection sort;
import java.util.*;
class SelectionSortStr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of Array :");
        int n=sc.nextInt();
        String[] arr=new String[n];
        System.out.println("enter element :");
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        System.out.println("without shorting Array :\n"+Arrays.toString(arr));
        int m;
        String temp="";
        for(int i=0;i<n;i++){
            m=i;
            for(int j=i+1;j<n;j++){
                if(arr[j].compareTo(arr[m]) < 0){
                    m=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[m];
            arr[m]=temp;
        }
        System.out.println("after sorting array :\n"+Arrays.toString(arr));
    }
}