// WAP to calculate the factorial of any number using recursive method
import java.util.*;
class factorial{
    int fact=1;
    int fact(int n1){
        if(n1>1){
            fact=fact*n1;
            fact(n1-1);
           
        }
        return fact;
        
    }

}
class factorialRecursive{
    public static void main(String[] args) {
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        
        int n = sc.nextInt();
        factorial f=new factorial();
        result=f.fact(n);
        System.out.println(result);
}

}