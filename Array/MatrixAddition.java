import java.util.*;
class MatrixAddition{
    static void displayMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    // here create sum of two matrix
    static void AddMatrix(int A[][],int r,int c,int B[][],int r1,int c1){
        if(r!=r1 && c!=c1){
            System.out.println("Addition is not possible");
            return;
        }
        int sum[][] = new int[r][c];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                sum[i][j]=A[i][j]+B[i][j];
            }
        }
        System.out.println("the sum of matrix A and B : ");
        displayMatrix(sum);
        return;
    }

    // here create funciton to multiply two matrix 
    static void MultiplyMatrix(int A[][],int r,int c,int B[][],int r1,int c1){
        if(c!=r1){
            System.out.println("multiply is not possible ");
            return;
        }
        int sum[][] = new int[r][c1];
        for(int i=0;i<r;i++){
            for(int j=0;j<c1;j++){

                for(int k=0;k<c;k++){
                    sum[i][j]+=(A[i][k]*B[k][j]);
                }
                
            }
        }
        System.out.println("the Multiply of matrix A and B : ");
        displayMatrix(sum);
        return;
        
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("first matrix value : ");
        // here create matrix 
        System.out.println("first matrix row and column : ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int A[][]=new int[r][c];
        System.out.println("enter the value of Matrix -1");
        for(int i=0;i<r;i++){
            System.out.println("enter the element : ");
            for(int j=0;j<A[i].length;j++){
                A[i][j]=sc.nextInt();
            }
        }
       
        

        // create second matrix 
        System.out.println("Second matrix row and column : ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int B[][]=new int[r1][c1];
        System.out.println("enter the value of Matrix - 2");
        for(int i=0;i<r1;i++){
            System.out.println("enter the element : ");
            for(int j=0;j<B[i].length;j++){
                B[i][j]=sc.nextInt();
            }
        }


        // SHOW FIRST MATIRX :-
        System.out.println("matrix - 1");
        displayMatrix(A);
        // SHOW SECOND MATRIX
        System.out.println("matrix - 2");
        displayMatrix(B);

        // now be add two matrix 
        // AddMatrix(A,r,c,B,r1,c1);

        // now multiply two matrix
        MultiplyMatrix(A,r,c,B,r1,c1);
    }
}