// WAP to Set -1 where row or column present in zero;

// import java.util.*;
class ArraySetValue{
    public static void Operation(int arr[][],int R,int C) {

        // create 1D matrix for Row and column;

        int Row[] = new int[R];
        int col[] = new int[C];

        for(int i=0; i<R;i++){
            Row[i]=0;
        }
        // System.out.println(Arrays.toString(Row));

        for(int i=0;i<C;i++){
            col[i]=0;
        }

        // System.out.println(Arrays.toString(col));

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(arr[i][j]==0){
                    Row[i]=1;
                    col[j]=1;
                }
            }
        }

        // System.out.println(Arrays.toString(Row));
        // System.out.println(Arrays.toString(col));

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(Row[i]==1 || col[j]==1){
                    arr[i][j]=9;
                }
            }
        }
    }
    public static void Show(int arr[][],int R,int C) {
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println(".................Set 9 in matrix.................... ");
        int arr[][] ={{1,2,3,5},{0,2,9,4},{8,9,1,0}};
        Show(arr,3,4);
        System.out.println(".................after operation perform.................... ");
        Operation(arr,3,4);
        Show(arr,3,4);
    }
}