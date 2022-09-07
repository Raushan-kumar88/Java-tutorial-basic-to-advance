// WAP TO perform merge short in array and short element in any form ass or dec...
import java.util.*;
class MergeS{
    int[] Temparr;
    int length;
    int[] array;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // here create array

        System.out.println("enter the size of row : ");
        int m=sc.nextInt();
        int[] arr=new int[m];
            System.out.println("enter the element :");
            for(int j=0;j<arr.length;j++){
                arr[j]=sc.nextInt();
            }

        //print array;
        System.out.println("the current array :"+Arrays.toString(arr));
        
    // create object
        MergeS me=new MergeS();
        me.merge(arr); //call merge function
        // print array after sorting
        for(int i:arr){
            System.out.print(i+" ");
        }
        
    }
    // first function to get array and after perform operation
    public void merge(int arr[]){
        this.array=arr;
        this.length=arr.length;
        this.Temparr=new int[length];
        divideArray(0,length-1);
        
    }
    // here divide array part wise part
    public void divideArray(int lowerI,int higherI){
        if(lowerI<higherI){
            int mid=lowerI+(higherI-lowerI)/2;
            divideArray(lowerI,mid);
            divideArray(mid+1,higherI);
            divMergeArray(lowerI,mid,higherI);
        }
    }
    public void divMergeArray(int lowerI,int mid,int higherI){
        for(int i=lowerI;i<=higherI;i++){
            Temparr[i]=array[i];
        }
        int i=lowerI;
        int j=mid+1;
        int k=lowerI;
        while(i<=mid && j<=higherI){
            if(Temparr[i]<=Temparr[j]){
                array[k]=Temparr[i];
                i++;
            }
            else{
                array[k]=Temparr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            array[k]=Temparr[i];
            k++;
            i++;
        }
    }
}
