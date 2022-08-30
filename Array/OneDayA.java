// Today we discuss 1 d arrays..
// first step:-
// 1.Declaration
// 2.Creation 
// 3.Initialization
// 4.Retrive value
// now :-
// Declaration of array many types:-
// int[] a;
// int []a;
// int a[];
// int[]a;
// note in Declaration time size is not mention

// creation of an arrays:-
// int[] arr=new int[n];
// where n is the size of array
// arrays is a object;
// note in creation time size is compolsary to take


// Initialization of an arrays:-
// int[] arr={2,3,4}
// another method 
// int[] arr =new int[3];
// arr[i]=2;
// and so on

import java.util.*;
class OneDayA{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array n :");
        int n=sc.nextInt();
        int[] arr=new int[n]; // here array are declaration and creation
        System.out.println("enter element : ");

        for(int i=0;i<n;i++){
            
            arr[i]=sc.nextInt(); // here array are intialization...
        }

        //first method to print array
        System.out.println("your present arrays :- \n"+ Arrays.toString(arr));
        
        //second method method to print array
        for(int j :arr){ //foreach loop;
            System.out.format("%d ",j);   // here array are printed;
        }

    }
}