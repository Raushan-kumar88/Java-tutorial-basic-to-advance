// for(Map.Entry<String,Integer> e: map.entrySet()){//write your code}
// Set<String> key = map.keySet<>();

import java.util.*;
class hasmap{
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        // create student marks table;
        map.put("Raushan kumar",88);
        map.put("Rahul kumar",55);
        map.put("Pawan",77);
        map.put("Rohan kumar",84);

    //    how to search key is exits or not;
    if(map.containsKey("Raushan kumar")){
        System.out.println("exits");
    }
    else{
        System.out.println("not exits");
    }


    // for(Map.Entry<String,Integer> e:map.entrySet()){
    //     System.out.println(e.getKey()+" ----> "+e.getValue());
    // }
    // another method to print hasmap key and value;
    Set<String> keys=map.keySet();
    for(String key:keys){
        System.out.println(key+" "+map.get(key));
    }

    System.out.println("........................................");
    int arr[]={1,2,4,1,2,7,1,4,3,4,9};
    HashMap<Integer,Integer> hs = new HashMap<>();
    
    for(int i=0;i<arr.length;i++){
        if(hs.containsKey(arr[i])){
            hs.put(arr[i], hs.get(arr[i]) + 1);
        } else {
            hs.put(arr[i], 1);
        }
        
    }
    
    for(Map.Entry<Integer,Integer> el:hs.entrySet()){
       System.out.println(el.getKey()+" ----> "+el.getValue());

    }
    }


}