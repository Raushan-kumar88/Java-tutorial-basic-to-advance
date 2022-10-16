// WAP to find prime of not
import java.util.*;
class isPrime{
    static Boolean isPrime1(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c>=n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any no : ");
        int n=sc.nextInt();
        Boolean ans=isPrime1(n);
        System.out.println(ans);

    }
}