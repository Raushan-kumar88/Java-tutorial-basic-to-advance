import java.util.*;
class countno{
    public static int countNO(int temp){
        int count=0;
        while(temp>0){
            // this is first method to count digit
            int rem=temp%10;
            count++;
            temp=temp/10;
        }
        return count;
    }
    public static int sumInt(int temp){
        int result=0;
        while(temp>0){
            // this is first method to count digit
            int rem=temp%10;
            result+=rem;
            temp=temp/10;

        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no : ");
        int n=sc.nextInt();
        // int temp=n;
        int ans = countNO(n);
        int result=sumInt(n);
        
        
        System.out.println("The total count of "+n+" : "+ans);
        System.out.println("The total count of "+n+" : "+result);
        
    }
}