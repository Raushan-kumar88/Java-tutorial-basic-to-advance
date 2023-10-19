public class rotateMatrix {

    static int[][] transeposeMatrix(int[][] arr){
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr[i].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }
    static int[] swap(int[] arr,int i,int j){
         while(i<=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
    static int[] reverseArray(int[] arr){
        int i = 0 , j = arr.length-1;
       swap(arr,i,j);
        return arr;
    }
    
    static void rotateMatrixElement(int[][] matrix){
        transeposeMatrix(matrix);
        for(int[] ar:matrix){
            reverseArray(ar);
        }
        
        System.out.println("rotate matrix");
         for(int i = 0 ;i<matrix.length;i++){
            for(int j = 0 ;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrixElement(matrix);
    }
}
