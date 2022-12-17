import java.util.*;
class Lecture1{
    public static void main(String[] args) {
        System.out.println("hashMap function...");
        HashMap<String,Integer> hm =new HashMap<>();
        hm.put("Rauhan kumar",22);
        hm.put("Rahul",21);
        hm.put("Pankaj kumar",20);
        hm.put("Reyaz ansari",20);
        System.out.println(hm);

        // get function in HashMap
        // int value=hm.get("Rahul");
        // System.out.println(value);
        // // or
        // System.out.println(hm.get("Rauhan kumar"));
        // // containsKey() use
        // System.out.println(hm.containsKey("Rauhan kumar"));
         
        // // Remove() use
        // System.out.println(hm.remove("Rauhan kumar"));
        // // current map
        // System.out.println(hm);
        // // size() function 
        // System.out.println(hm.size());
        // // isEmpty() use 
        // hm.clear();
        // System.out.println(hm.isEmpty());
        // clear() use
        // System.out.println(hm.clear());

        // HashMap iteration 
        Set<String> key=hm.keySet();
        for(String k : key){
            System.out.println("key : "+k+" --- value : "+hm.get(k));
        }




        
    }
}