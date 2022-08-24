import java.util.*;
class greaterFind{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // this program is check greater then between two number.... 
        // System.out.println("enter the first value : "); 
        // int a=sc.nextInt();
        // System.out.println("enter the second value : ");
        // int b=sc.nextInt();
        // if(a>b){
        //     System.out.println(a+ " is greater number.");
        // }
        // else if(a==b){
        //     System.out.println("both are same..");

        // }
        // else{
        //     System.out.println(b+" is greater.");
        // }

        // ** This code is check between greater between three number**
        System.out.println("enter the first value : "); 
        int a=sc.nextInt();
        System.out.println("enter the second value : ");
        int b=sc.nextInt();
        System.out.println("enter the third value : ");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+ " is greater number.");
        }
        else if(b>a && b>c){
            System.out.println(b + " is greater number");
        }
        else if(a==b && a==c){
            System.out.println("all are same..");

        }
        else{
            System.out.println(c+" is greater.");
        }



    }
}