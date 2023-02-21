// Q6.Write a Java program to print the odd numbers from 1 to 99. Prints one number per line.
// Q7.Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
// Q8.Write a Java program to calculate the sum of two integers and return true if the sum is equal to a
// third integer.

import java.util.*;
class  Oddnumber{
    // this function to calculate odd no 1 to 99;

static void Even(int f_no,int l_no){
    System.out.println("------------print no odd 1 and 99------------------------");
        for(int i=f_no;i<l_no;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
}

// here create function for find divisible no 3 and 5
static void DivisibleN(int small,int large){
    System.out.println("------------print no divisible 3 and 5------------------------");
    for(int i=small;i<large;i++){
        if(i%3==0 && i%5==0){
            System.out.println(i);
        }
    }
}

// here function check two no sum is equal to third no 
static boolean findTrueofnot(int x,int y,int z){
    return((x+y==z) || (y+x==z) || (z+x==y));

}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // first question 
        Even(1,100);
        // Second function
        DivisibleN(1,100);

        // next question 

        System.out.println("enter first no : ");
        int n1=sc.nextInt();
        System.out.println("enter first no : ");
        int n2=sc.nextInt();
        System.out.println("enter first no : ");
        int res=sc.nextInt();
        // Boolean result=findTrueofnot(n1,n2,res);
        System.out.println(findTrueofnot(n1,n2,res));

    }
}

