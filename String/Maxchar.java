// find maximum repeated character in string using hash map


package String;
import java.util.HashMap;
import java.util.Map.Entry;
public class Maxchar {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm=new HashMap<>();
        String s1="ab c a b a";
        // remove blackspace
        s1=s1.replaceAll("\\s", "");

        char c[]=s1.toCharArray();
        for(char ch:c){
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
            else{
                hm.put(ch, 1);
            }
        }
        int max=-1;
        char chh=' ';
        for(Entry<Character, Integer> me : hm.entrySet()){
            if(max<me.getValue()){
                max=me.getValue();
                chh=me.getKey();
            }
        }
        System.out.println("maximum repeated ch : "+chh);
    }
}
