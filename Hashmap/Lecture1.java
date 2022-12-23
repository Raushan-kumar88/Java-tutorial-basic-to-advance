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

        System.out.println("-------------largest subarrays :------------------ ");

        // find largest subArrays:-

        int arr[] = {15,2,-2,-8,1,7,10,23};
        HashMap<Integer,Integer> hs = new HashMap<>();
        int sum=0;
        int len=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(hs.containsKey(sum)){
                len=Math.max(len,i-hs.get(sum));
            }
            else{
                hs.put(sum,i);
            }
        }
        System.out.println("largest subarrays : "+len);




        System.out.println("-------------count sub subarrays equal to k :------------------ ");

        // find sumArrays to equal to k 
        int arr1[]={10,2,-2,-20,10};
        HashMap<Integer,Integer> hs1= new HashMap<>();
        int k=-10;
        hs1.put(0,1);
        int ans=0;
        int sum1=0;
        for(int i=0;i<arr1.length;i++){
            sum1+=arr1[i];
            if(hs1.containsKey(sum1-k)){
                ans+=hs1.get(sum1-k);

            }
            hs1.put(sum1,hs1.getOrDefault(sum1,0)+1);
        }
        System.out.println(ans);



        
    }
}