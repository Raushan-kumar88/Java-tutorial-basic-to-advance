import java.util.*;
class vowelcount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence/word");
        String name=sc.nextLine();
        int vowel=0;
        int consonents=0;
        for(int i=0; i<name.length(); i++) {
        char c = name.charAt(i);
    
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
          vowel++;
        }else if(c>'a' && c<='z'){
            consonents++;
        }
    }
        System.out.println(vowel);
        System.out.println(consonents);
    }
}