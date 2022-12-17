import java.util.*;
class BitwiseOperator{    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=9;
        int b=10;
        System.out.println(a|b); //bitwise operator OR
        System.out.println(a&b); //bitwise operator AND
        System.out.println(a^b); //bitwise Exclusive OR
        System.out.println(a<<1); //bitwise  left
        System.out.println(a<<2); 

        System.out.println(b>>1); //bitwise  Right
        System.out.println(b>>2);

        // System.out.println(a~b);

        System.out.println("enter any number : ");
        int n=sc.nextInt();
        if(n%2==0 && n%3==0){
            System.out.println(n);
        }
    }
}

