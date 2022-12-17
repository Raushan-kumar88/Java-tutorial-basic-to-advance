import java.util.*;
class ReverseNO{
    public static int reverse(int n){
        int rev=0;
        while(n>0){
            int rem = n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
    public static int PowerFunction(int a, int b){
        int ans = 1;
        for(int i =1;i<=b;i++){
            ans=ans*a;
        }
        return ans;
    }
    // 2*1+2*2+4*3+12*4+48*5
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no : ");
        int n = sc.nextInt();
        int ans = reverse(n);
        System.out.println(ans);
        int result = PowerFunction(2,5);
        System.out.println(result);

    }
}