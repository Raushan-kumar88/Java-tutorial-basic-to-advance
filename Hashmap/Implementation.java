import java.util.*;
class Implementation{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,2,4,1,2,1,1,4,1};
        // System.out.println(Arrays.toString(arr));
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){

            // first method
            // if(hm.containsKey(arr[i])){
            //     hm.put(arr[i],hm.get(arr[i])+1);
            // }
            // else{
            //     hm.put(arr[i],1);
            // }

            // second method
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }


        //first method to access element to hashmap
        // Set<Integer> keySet=hm.keySet();  
        // for(Integer key : keySet){
        //     if(hm.get(key)>arr.length/3){
        //         System.out.println(key);
        //     }
        // }

        // second method to print element from hashmap
        for(Integer key : hm.keySet()){
            if(hm.get(key)>arr.length/3){
                System.out.println(key);
            }
        }
    }
}