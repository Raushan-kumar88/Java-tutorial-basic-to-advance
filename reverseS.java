import java.util.*;
class reverseS{
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);  
     System.out.println("enter any string to reverse :");
     String name=sc.nextLine();
     String temp="";
     for(int i=name.length()-1; i>=0; i--){
        temp=temp+name.charAt(i);
     }
     System.out.println(temp);
    }
}