// question given "Chennai" to "Bengeluru" , "mumbai" to "delhi","Goa" to " chennai","delhi" to "goa"
// output:- mumbai -> delhi -> Goa -> chennai -> Bengeluru
import java.util.*;
class ToAndFrom{
    public static String RevMap(HashMap<String,String> ticket){
        HashMap<String,String> rev=new HashMap<>();
        for(String key : ticket.keySet()){
            rev.put(ticket.get(key),key);
        }
        // here to check which is not exit in destination
        for(String key : ticket.keySet()){
            if(!rev.containsKey(key)){
                return key; //starting point
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> ticket = new HashMap<>();
        ticket.put("Chennai","Bengaluru");
        ticket.put("Mumbai","Delhi");
        ticket.put("Goa","Chennai");
        ticket.put("Delhi","Goa");
        // add all source and destination point;
       String start= RevMap(ticket);
       
       System.out.print(start);
       for(String key : ticket.keySet()){
            System.out.print(" -> "+ticket.get(start));
            start=ticket.get(start);
       }
    }
}