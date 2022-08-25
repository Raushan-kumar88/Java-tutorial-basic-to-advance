import java.util.*;
class reverseN{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int rev=0,rem;
     System.out.println("enter number :");
     int no=sc.nextInt();
     while(no!=0){
        rem=no%10;
        rev=rev*10+rem;
        no=no/10;
     }
     System.out.println("The reverse number :"+rev);
    }

}