import java.util.*;
class HashSet1{
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Karan");
        hs.add("Raushan");
        hs.add("Rohan");
        hs.add("pawan");
         
        // Iterator it = hs.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // another method to print;
        // for(String st : hs){
        //     System.out.println(st);
        // }
        System.out.println(hs);

        System.out.println("...............................");
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Karan");
        lhs.add("Raushan");
        lhs.add("Rohan");
        lhs.add("pawan");
        // lsh.remove("kddkkd");
        // for(String lis:lhs){
        //     System.out.println(lis);
        // }
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Karan");
        ts.add("Raushan");
        ts.add("Rohan");
        ts.add("pawan");
        System.out.println(ts);
    }
}