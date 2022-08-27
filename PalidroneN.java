// check no is Palidrone or note;
import java.util.*;
class PalidroneN{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rev=0,rem;
        System.out.println("enter any number do want to check Palidrone :");
        int no=sc.nextInt();
        int n=no;
        
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }

        if(no==rev){
            System.out.println(rev+ " is Palidrone number..");
        }
        else{
            System.out.println(rev+ " is not Palidrone number..");
        }
    }
}