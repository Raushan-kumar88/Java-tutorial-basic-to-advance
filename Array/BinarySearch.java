class BinarySearch{
    public static void main(String[] args) {
        System.out.println("Binary search....");
        int[] arr={2,3,9,1,7,4,77};
        int k=4;
        int li=0;
        int hi=arr.length-1;
        int mid=(li+hi)/2;
        System.out.println(mid);
        while(li<=hi){
            if(arr[mid]==k){
                System.out.println(mid);
            }
            else if(arr[mid]<k){
                li=mid+1;   
            }
            else{
                hi=mid-1;
            }
            mid=(li+hi)/2;
        }
    }
}