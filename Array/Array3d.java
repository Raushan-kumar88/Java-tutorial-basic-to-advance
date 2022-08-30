import java.util.*;
class Array3d{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of r :");
        int r=sc.nextInt();
        System.out.println("enter the value of c :");
        int c=sc.nextInt();
        System.out.println("enter the value of z :");
        int z=sc.nextInt();
        int[][][] arr=new int[r][c][z];
        for(int i=0;i<r;i++){
            System.out.println("enter the value");
            for(int j=0;j<c;j++){
                for(int k=0;k<z;k++){
                    arr[i][j][k]=sc.nextInt();
                }
            }
        }

        

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                for(int k=0;k<z;k++){
                    System.out.print(arr[i][j][k]+" ");
                }
            }
            System.out.println();
        }

System.out.println(arr[0][2][1]);
    }
}