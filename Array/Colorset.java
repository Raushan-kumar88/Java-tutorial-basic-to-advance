import java.util.*;
public class Colorset {
    static void colorCode(int[] arr){
        int i = 0, k=0,j=arr.length-1;
        while(k <= j){
            if(arr[k]==0){
                int temp = arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                i++;
                k++;
            }
            else if(arr[k]==2){
                int temp = arr[k];
                arr[k]=arr[j];
                arr[j]=temp;
                j--;
            }
            else{
                 k++;
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }
	public static void main(String[] args) {
		int[] arr = {1,0,2,0,1,2};
		colorCode(arr);
	}
}

