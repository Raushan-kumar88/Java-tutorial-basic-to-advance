// WAP a program to find common element from three arrays.
import java.util.ArrayList;
class findCommonElement{
    public static void main(String[] args) {
        int arr1[]={2,3,4,6};
        int arr2[]={2,5,3,6,7,8,9};
        int arr3[]={1,3,4,5,6,7,8,9};
        int x=0;int y=0;int z=0;
        ArrayList<Integer> al=new ArrayList<>();
        while(x<arr1.length && y<arr2.length && z<arr3.length){
            if(arr1[x]==arr2[y] && arr2[y]==arr3[z]){
                al.add(arr1[x]);
                x++;
                y++;
                z++;
            }
            else if(arr1[x]<arr2[y] && arr1[x]!=arr2[y]){
                x++;
            }
            else if(arr2[y]<arr3[z] && arr2[y]!=arr3[z]){
                y++;
            }
            else{
                z++;
            } 
        }
        System.out.println("common element ....................");
        for(int j : al){
            System.out.print(j+" ");
            
        }
    }
}