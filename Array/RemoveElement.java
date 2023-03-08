public class RemoveElement {
    static int RemoveDuplicateElement(int nums[]){
        if(nums.length==0){
            return 0;
        }
        int addIndex = 1; 
        for(int i = 0; i < nums.length - 1; i++) {
            
            if(nums[i] < nums[i + 1]){ 
              nums[addIndex] = nums[i + 1];
              addIndex++;
            }
        }
        return addIndex;
    } 
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
        int arr1[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(RemoveElement1(arr,val));
        System.out.println(RemoveDuplicateElement(arr1));
    }
    
}
