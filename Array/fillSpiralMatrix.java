class fillSpiralMatrix{
    static void displayMatrix(int arr [][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.printf("%4d",arr[i][j]," ");
            }
            System.out.println();
        }
    }
    static int[][] Fillmatrix(int n){
        int mat[][]=new int[n][n];
        int toprow=0,rightcol=n-1,botrow=n-1,leftcol=0;
        int count=1;
        while(count<=n*n){
            // fill toprow
        //     for(int i=leftcol;i<=rightcol && count<=n*n;i++){
        //         mat[toprow][i]=count;
              
        //         count++;
        //     }

        //     toprow++;
        //     // fill leftcolumn;
        //     for(int i=toprow;i<=botrow && count<=n*n;i++){
        //         mat[i][rightcol]=count++;
        //     }
        //     rightcol--;

        //     // fill bottomrow
        //     for(int i=rightcol;i>=leftcol && count<=n*n;i--){
        //         mat[botrow][i]=count++;
        //     }
        //     botrow--;
        //     // fill leftcol
        //     for(int i=botrow;i>=toprow && count<=n*n;i--){
        //         mat[i][leftcol]=count++;

        //     }
        //     leftcol++;
        // }
        // this code is output
            // 1   2   3   4
            // 12  13  14   5
            // 11  16  15   6
            // 10   9   8   7


            // fill leftcol
            for(int i=toprow;i<=botrow && count<=n*n;i++){
                mat[i][leftcol]=count++;
                
            }
            leftcol++;
            // // fill bottomrow
            for(int i=leftcol;i<=rightcol && count<=n*n;i++){
                mat[botrow][i]=count++;
            }
            botrow--;
            
            // fill rightcolumn;
            for(int i=botrow;i>=toprow && count<=n*n;i--){
                mat[i][rightcol]=count++;
            }
            rightcol--;
             // fill toprow
            for(int i=rightcol;i>=leftcol && count<=n*n;i--){
                mat[toprow][i]=count;
              
                count++;
            }
            toprow++;
        }

        // this code is outpu:-
        // 1  12  11  10
        // 2  13  16   9
        // 3  14  15   8
        // 4   5   6   7

        return mat;
    }
    public static void main(String[] args) {
        int n=4;
        int SpiralMatrix[][]=Fillmatrix(n);
        displayMatrix(SpiralMatrix);
    }

}