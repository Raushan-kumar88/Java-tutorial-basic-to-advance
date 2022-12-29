// create program to Rotate90deg 
import java.util.*;
class Rotate90deg{
    // here create function to display matrix
    static void displayMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    // create function to transpose square matrix

    static void TransposeMatrix(int mat[][],int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;

            }
        }
        return;
    }

    // here create function to reverse 1D matrix
    static void reverseArr(int arr[]){
        int i=0; int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return;
    }

    // here create function to rotate matrix
    static int[][]  Rotatematrix(int arr[][] ,int n){

        TransposeMatrix(arr,n,n);
        // here to reverse every matrix row
        for(int i=0;i<n;i++){
            reverseArr(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row and column : ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        for(int i=0;i<r;i++){
            System.out.println("enter the element : ");
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("the current matrix : ");
        displayMatrix(mat);
        System.out.println("The rotate matrix :");
        int ans[][]=Rotatematrix(mat,r);
        displayMatrix(ans);
    }
}

// in this questions
//  first step input matrix m*n
// second step print matrix;
// third step transpose matrix 
// fourth step reverse every row;