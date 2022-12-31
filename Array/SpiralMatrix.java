import java.util.*;
class SpiralMatrix{
    static void displayMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    // here we can write display spiral matrix
    
    static void displaySpiralMatrix(int mat[][],int r,int c){
        int toprow=0;
        int rightcol=c-1;
        int botrow=r-1;
        int leftcol=0;
        int totalelement=0;
        while(totalelement<r*c){

            // print first row

            for(int i=leftcol;i<=rightcol && totalelement<r*c;i++){
                System.out.print(mat[toprow][i] +" -> ");
                totalelement++;
            }

            // print last column

            toprow++;
            for(int j=toprow;j<=botrow && totalelement<r*c;j++){
                System.out.print(mat[j][rightcol]+" -> ");
                totalelement++;

            }

            // print bottom row

            rightcol--;
            for(int j=rightcol;j>=leftcol && totalelement<r*c;j--){
                System.out.print(mat[botrow][j]+" -> ");
                totalelement++;
            }

            // print first column 
            
            botrow--;
            for(int i=botrow;i>=toprow && totalelement<r*c;i--){
                System.out.print(mat[i][leftcol]+" -> ");
                totalelement++;
            }
            leftcol++;
        }

        return;
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
        System.out.println("The current matrix : ");
        displayMatrix(mat);
        System.out.println("the siral matrix : ");
        displaySpiralMatrix(mat,r,c);
    }
}