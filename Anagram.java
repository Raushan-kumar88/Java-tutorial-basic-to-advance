import java.util.*;
class Anagram{
    public static Boolean Anagrams(String s, String t){
        HashMap<Character,Integer> hm =new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(hm.get(ch)!=null){
               if(hm.get(ch)==1){
                hm.remove(ch);
               }
               else{
                hm.put(ch,hm.get(ch)-1);
               }
            }
            else{
                return false;
            }
        }
        return hm.isEmpty();
    }
    public static void main(String[] args) {
        
        String s="rare";
        String t="race";
        Boolean ans=Anagrams(s,t);
        System.out.println(ans);
    }
}