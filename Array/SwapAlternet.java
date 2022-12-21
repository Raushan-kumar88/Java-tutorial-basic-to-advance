import java.util.*;
class SwapAlternet{
    // static void display(int arr[]){
    //     System.out.println(Arrays.toString(arr));
    //     return;
    // }
    // static int[] SwapAlter(int []arr){
    //     for(int i=0;i<arr.length;i+=2){
		    
	// 	    if(i+1<arr.length){
	// 	        int temp=arr[i];
	// 	        arr[i]=arr[i+1];
	// 	        arr[i+1]=temp;
	// 	    }
	// 	}
    //     return arr;
    // }
    public static void main(String[] args) {
        // int []Odd = {21,2,9,3,9};
        // int []Even= {21,2,9,1,3,9};

        // // this is odd
        // int []result= SwapAlter(Odd);
        // display(result);

        // // this is even
        // int []result1= SwapAlter(Even);
        // display(result1);



// Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
// Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.


        int[] A={1,2,5,4,0};
        int B[] = {2,4,5,0,1};
        int temp=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                if(A[i]==B[j]){
                    temp+=1;
                }
                
            }
        }
        if(temp==A.length){
            System.out.println("1");
            Arrays.sort(A);
            System.out.println("sorted Arrays : "+Arrays.toString(A));
        }
        else{
            System.out.println("0");
        }
		
    }
}