// WAP to print Fibonacci series simple method and recursion method;

import java.util.*;
class FibonacciS{
   static int a=0,b=1,c;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        FibonacciS fib=new FibonacciS();
        System.out.println("enter the number :");
        int n=sc.nextInt();
        System.out.format("%4d %4d",a,b);
        fib.Fibonacci(n-2);
        
        // for(int i=1;i<n;i++){
        //     c=a+b;
        //     System.out.format("%4d",c);
        //     a=b;
        //     b=c;  
        // }
        
        // note:- above code is simple method;
        // next code is recursion method;
        }
        void Fibonacci(int f){
            if(f>=1){
                c=a+b;
                System.out.format("%4d",c);
                a=b;
                b=c;
                Fibonacci(f-1);
            }
        }
}