package String;

public class StringRotation {
    static boolean StringCheck(String s1,String s2){
        
        if(s1.length()!=s2.length()){
            return false;
        }
        else{
            String s3=s1+s1;
            if(s3.contains(s2)){
                return true;
            }
            return false;
        }
    }


    public static void main(String[] args) {
        String s1 = "ABACD";  
        String s2 = "CDABA";
        System.out.println(StringCheck(s1,s2));
    }
    
}
