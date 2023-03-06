public class RemoveElement {
    static int RemoveElement1(int arr[],int val){
        int arrlength=arr.length;
        int min=0;
        while(min<arrlength){
            if(arr[min]==val){
                arr[min]=arr[arrlength-1];
                arrlength--;
            }
            else{
                min++;
            }
        }
        return arrlength;
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,6,2,8,2};
        int val=2;
        System.out.println(RemoveElement1(arr,val));
    }
    
}
