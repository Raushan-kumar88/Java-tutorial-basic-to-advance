class NewProgram
{  
    //function to set matrix elements to zeros  
    private static void setZeros(int[][] arr2D, int n, int m)   
    {  
        int answer[][] = new int[n][m];  
        //set all elements of the array as 1  
        for (int i = 0; i < n; i++)   
        {  
            for (int j = 0; j < m; j++)   
            {  
                answer[i][j] = 1;  
            }  
        }  
        //traversing over matrix row wise  
        for (int i = 0; i < n; i++)   
        {  
            for (int j = 0; j < m; j++)   
            {  
                if (arr2D[i][j] == 0)   
                {  
                    // Set this row as zero in answer array  
                    for (int k = 0; k < m; k++)   
                    {  
                        answer[i][k] = 0;  
                    }  
                    break;  
                }  
            }  
        }  
        //traversing over matrix column wise  
        for (int j = 0; j < m; j++)   
        {  
            for (int i = 0; i < n; i++)   
            {  
                if (arr2D[i][j] == 0)   
                {  
                    //set this column as 0 in answer array  
                    for (int k = 0; k < n; k++)   
                    {  
                        answer[k][j] = 0;  
                    }  
                }  
            }  
        }  
        // Updating the elements in matrix array  
        for (int i = 0; i < n; i++)   
        {  
            for (int j = 0; j < m; j++)   
            {  
                if (answer[i][j] == 0)   
                {  
                    arr2D[i][j] = 0;  
                }  
            }  
        }  
    }  
    public static void main(String args[])   
    {  
    //defining an array  
       int[][] arr2D ={{0, 6, 3, 0}, {1, 8, 9, 3}, {6, 2, 0, 7}};  
       //finds the length of the matrix  
       int  n = arr2D.length;  
       int m = arr2D[0].length;  
       //function calling  
       setZeros(arr2D, n, m);  
        for (int i = 0; i < n; i++)   
        {  
            for (int j = 0; j < m; j++)   
            {  
                System.out.print(arr2D[i][j] + " ");  
            }  
            System.out.println();  
        }  
    }  
} 