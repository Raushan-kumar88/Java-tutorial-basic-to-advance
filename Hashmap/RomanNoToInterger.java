import java.util.*;
class RomanNoToInterger{
static int RomanToInteger(String roman){
    HashMap<Character,Integer> hs = new HashMap<>();
    hs.put('I',1);
    hs.put('V',5);
    hs.put('X',10);
    hs.put('L',50);
    hs.put('C',100);
    hs.put('D',500);
    hs.put('M',1000);
    int result = 0;
    for(int i=0;i<roman.length();i++){
    char ch = roman.charAt(i); 
      if(i>0 && hs.get(ch) > hs.get(roman.charAt(i-1)))
      {
        result += hs.get(ch) - 2*hs.get(roman.charAt(i-1));
      }
      else{
        result += hs.get(ch);
      }
       
    }
    return result;
}
public static void main(String[] args) {
    String roman="LCM";
    int ans=RomanToInteger(roman);
    System.out.println("The roman : "+roman);
    System.out.println("The integer value : "+ans);
}
}