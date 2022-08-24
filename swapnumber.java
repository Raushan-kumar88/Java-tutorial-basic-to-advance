// WAP to swap two number without using any temp variables
import java.util.*;
class swapnumber{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        System.out.println("Before swap number \n A = "+ a +" B = "+ b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap number \n A = "+ a +" B = "+ b);
    }
}