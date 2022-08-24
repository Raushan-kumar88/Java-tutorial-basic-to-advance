// WAP to find factorial of any number 
import java.util.*;
class factorial{
    public static void main(String[] args) {
        double fact=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of the n : ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println("the factorial of the " + n + " is :" + fact);
    }
}