// WAP print star patter 
import java.util.*;
class StarP{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n :");
        int n=sc.nextInt();
        // for(int i=1;i<n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=n;i++){
        //     for(int j=n;j>=i;j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // output this code:-
        // *
        // **
        // ***
        // **
        // *
        // net method star print:-
            
        // for(int i=1;i<=n;i++){

        //         for(int j=n;j>=i;j--){
        //             System.out.print(" ");     
        //         }
        //         for(int k=1;k<=i;k++){
        //             System.out.print("*"); 
                
        //     }
        //         System.out.println();
        //     }
            
            // output:-
            //     ****
            //      ***
            //       **
            //        *

            // for(int i=1;i<=n;i++){
            //     for(int j=n;j>=i;j--){
            //         if(j==i){
            //             for(int k=1;k<=i;k++){
            //                 System.out.print("* "); 
            //             }
                        
            //         }
            //         System.out.print(" ");
            //     }
            //     System.out.println();
            // }  

            // output:
            //   *
            //  * *
            // * * *

            // next pattern:-

            // for(int i=1;i<=n;i++){
            //     for(int j=n;j>=i;j--){
            //         System.out.print(" ");
            //     }
            //     for(int k=1;k<=i;k++){
            //         System.out.print("*");
            //     }
            //     for(int p=1;p<i;p++){
            //         System.out.print("*");
            //     }
            //     for(int z=n-1;z>=i;z--){
            //         System.out.print(" ");
            //     }
                
            //     System.out.println();
            // }

            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=i;j++){
            //         System.out.print(" ");
            //     }
            //     for(int k=n;k>=i;k--){
            //         System.out.print("*");
            //     }
            //     for(int z=n-1;z>=i;z--){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
        
//             output:-
            
//         *      
//        ***     
//       *****
//      *******
//     *********
//    ***********
//   *************
//   *************
//    ***********
//     *********
//      *******
//       *****
//        ***
//         *


// next program:-

// for(int i=1;i<=n;i++){
//     for(int j=n;j>=i;j--){
//         System.out.print(" ");
//     }
//     for(int k=1;k<(i*2);k++){
//         if(k>1 && k<(i*2)-1){
//             System.out.print(" ");
//         }
//         else{
//             System.out.print("*");
//         }
        
//     }
//     System.out.println();
// }


// for(int i=n;i>=1;i--){
//     for(int j=n;j>=i;j--){
//         System.out.print(" ");
//     }
//     for(int k=1;k<(i*2);k++){
//         if(k>1 && k<(i*2)-1){
//             System.out.print(" ");
//         }
//         else{
//             System.out.print("*");
//         }
        
//     }
//     System.out.println();
// }
// output:-
// enter the value of n :
// 5
//      *    
//     * *   
//    *   *  
//   *     * 
//  *       *
//  *       *
//   *     * 
//    *   *
//     * *
//      *


// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n;j++){
//         if(i>=2 && j>=2 && j<=n-1 && i<=n-1){
//             System.out.print(" ");
//         }
//         else{
//             System.out.printf("*");
//         }
//     }
//     System.out.println();
// }


// output:-
// enter the value of n :
// 8
// ********
// *      *
// *      *
// *      *
// *      *
// *      *
// *      *
// ********

int temp=0;
for(int i=1;i<=n;i++){
    if(i%2!=0){
        for(int j=1;j<=3;j++){
            temp +=1;
            System.out.print(temp+" ");
        }
    }
    else{
        int count=temp+1;
        for(int j=temp+3;j>=count;j--){
            temp +=1;
            System.out.print(j+" ");
        }
    }
    System.out.println();

}

// output :-
// enter the value of n :
// 4
// 1 2 3 
// 6 5 4
// 7 8 9
// 12 11 10

    }
}