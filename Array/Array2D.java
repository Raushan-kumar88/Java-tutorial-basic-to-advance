import java.util.*;
class Array2D{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("enter the value of row :");
        int r=sc.nextInt();
        System.out.println("enter the value of column :");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            System.out.println("enter the row element :-");
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        // System.out.println(arr[0].length);

        for(int i=0;i<r;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        // another method :-
        // for (int[] i : arr) {
        //     System.out.println(Arrays.toString(i));
        // }
    }
}