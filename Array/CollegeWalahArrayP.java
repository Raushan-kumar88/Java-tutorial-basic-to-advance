import java.util.*;
class CollegeWalahArrayP{
    public static int FindUnique(int arr[]){
        // System.out.println("the current Arrays ; "+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        // System.out.println("the current Arrays ; "+Arrays.toString(arr));
        int result=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                result=arr[i];
            }
        }
        return result;
    }
    // find first largest element and second largest element;
    public static void findSecondlargestelement(int arr[]){
        int firstLar=Integer.MIN_VALUE;
        int secondLar=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstLar){
                secondLar=firstLar;
                firstLar=arr[i];
            }
            if(arr[i]>secondLar && arr[i]!=firstLar){
                secondLar=arr[i];
            }

        }
        System.out.println("second largest element : "+secondLar);
    }
    // calculate kth time rotate array
    static int[] rotate(int arr[],int k){
        int n=arr.length;
         k=k%n;
        int rotate[] = new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            rotate[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            rotate[j++]=arr[i];
        }
        return rotate;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {0,0,-2,-3,0,-4};
        int arr1[] = {1,2,3,3,4,5,6,5,6};

        // find unique element in this arrays
        // create funciton which is find unique element;
        
        findSecondlargestelement(arr);
        int ans =FindUnique(arr1);
        System.out.println("the unique element : "+Arrays.toString(arr));
        System.out.println("the unique element : "+ans);
        
        // calculate kth time rotate element :-
        int currentarr[] ={1,2,3,4,5,4,7,3};
        
        System.out.println("enter the kth value : ");
        int k=sc.nextInt();
        int result[] = rotate( currentarr,k);
        System.out.println("the rotate arrays : "+Arrays.toString(result));



        // array rotate without using any array : - 
        // System.out.println("The current Arrays : "+Arrays.toString(arr));
// 		3,7,4,5,4,3,2,1
// 		int j=arr.length-1;
// 		for(int i=0;i<arr.length;i++){
// 		    if(i<j){
// 		        int temp=arr[i];
// 		        arr[i]=arr[j];
// 		        arr[j]=temp;
// 		        j--;
// 		    }
		    
// 		}
        // int i=0;
        // int j=arr.length-1;
        // while(i<j){
        //      int temp=arr[i];
 		     //   arr[i]=arr[j];
		      //  arr[j]=temp;
		      //  i++;
		      //  j--;
        // }

// 		System.out.println("The reverse Arrays : "+Arrays.toString(arr));



    }
}