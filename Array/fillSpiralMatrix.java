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
            for(int i=leftcol;i<=rightcol && count<=n*n;i++){
                mat[toprow][i]=count;
              
                count++;
            }

            toprow++;
            // fill leftcolumn;
            for(int i=toprow;i<=botrow && count<=n*n;i++){
                mat[i][rightcol]=count++;
            }
            rightcol--;

            // fill bottomrow
            for(int i=rightcol;i>=leftcol && count<=n*n;i--){
                mat[botrow][i]=count++;
            }
            botrow--;
            // fill leftcol
            for(int i=botrow;i>=toprow && count<=n*n;i--){
                mat[i][leftcol]=count++;

            }
            leftcol++;

        }
        return mat;
    }
    public static void main(String[] args) {
        int n=4;
        int SpiralMatrix[][]=Fillmatrix(n);
        displayMatrix(SpiralMatrix);
    }
    
}