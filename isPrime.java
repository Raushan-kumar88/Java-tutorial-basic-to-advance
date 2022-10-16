// WAP to find prime of not
import java.util.*;
class isPrime{

    // here is prime no code......

    // static Boolean isPrime1(int n){
    //     if(n<=1){
    //         return false;
    //     }
    //     int c=2;
    //     while(c*c<=n){
    //         if(n%c==0){
    //             return false;
    //         }
    //         c++;
    //     }
    //     return c*c>=n;
    // }

    // here is isArmstrong no 
    static Boolean isArmstrong(int n){
        int original=n;
        int result = 0;
        int rem;
        while(n>0){
            rem=n%10;
            n=n/10;
            result+=(rem*rem*rem);
        }
        return result==original;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter any no : ");
        // int n=sc.nextInt();
        
        for(int i=1;i<1000;i++){
            // if(isPrime1(i)){
            //     System.out.print(i+" ");
            // }
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
            

        }
        
    }
}