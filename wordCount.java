import java.util.*;
class wordCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sentence :");
        int count=1;
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
                count += 1;
            }
        }
        System.out.println(count);
    }
}