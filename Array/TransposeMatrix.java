// in this questions we create one matrix and then after transpose of the matrix
import java.util.*;
class TransposeMatrix{
    // here create function to display matrix
    static void displayMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    // here function to create transpose of the matrix
    static void transposeMatrix(int arr[][],int r,int c){
        int transposematrix[][]=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                transposematrix[i][j]=arr[j][i];
            }
        }
        displayMatrix(transposematrix);
        return;
    }


    // here create function to transpose of the matrix without using extra matrix
    static void TransposeMatrixx(int arr[][],int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        displayMatrix(arr);
        return ;
    }




    // this is main function

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row and column : ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            System.out.println("enter the element  : ");
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the current matrix : ");
        displayMatrix(arr);

        // first method to transpose matrix using create new arrays
        
        // System.out.println("the transpose matrix : ");
        // transposeMatrix(arr,r,c);

        // transpose square matrix without using extra matrix 
        System.out.println("the transpose matrix :");
        TransposeMatrixx(arr,r,c);

    }
}