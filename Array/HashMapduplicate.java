// find duplicate element using hash table
import java.util.*;
class HashMapduplicate{
    public static void main(String[] args) {
        System.out.println("found duplicate element : ");
        int arr[]={4,2,5,1,2,3,7,1,2,1,4,4,4,4,4,1,1,1};
        Map<Integer,Integer> hm=new HashMap<>();
        for(int a : arr){
            Integer count=hm.get(a);
            if(count==null){
                hm.put(a,1);
            }
            else{
                count+=1;
                hm.put(a,count);
            }
        }
        
        int maxValueInMap=(Collections.max(hm.values()));  //  return max value in the Hashmap
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey()+" -> "+entry.getValue());     // Print the key with max value
            }
        }
    }
}