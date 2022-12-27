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

    // create funcion to sort array in lowest form;
    static int[] SwapArraylowest(int arr[]){
        int le=arr.length;
        int l=0;
        int r=le-1;
        while(l<r){
            if(arr[l]==1 && arr[r]==0){
                int temp=arr[r];
                arr[r]=arr[l];
                arr[l]=temp;
                l++;
                r--;
            }
            if(arr[l]==0){
                l++;
            }
            if(arr[r]==1){
                r--;
            }
        }
        return arr;
    }

// swapping in odd and even
// while(left<right){
//     if(arr[left]%2==1 && arr[right]%2==0){
//         int temp=arr[right];
//         arr[right]=arr[left];
//         arr[left]=temp;
//         right--;
//         left++;
//     }
//     if(arr[left]%2==0){
//         left++;
//     }
//     if(arr[right]%2==1){
//         right--;
//     }
// }

static int[] Prefixsum(int arr[]){
   
		int n=arr.length;
		int temp[] = new int[n];
		temp[0]=arr[0];
		for (int i=1;i<n ;i++ ){
		    temp[i]=temp[i-1]+arr[i];
		} 
    return temp;
}



// here create prefix function sum of the array 
    static int[] CalPrefixsum(int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }

        return arr;
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

// Q to swap array without using any extra array;
            // create array
    int arr4[]={1,0,0,1,0,1,1,0,0};
    // int result2=SwapArraylowest(arr4);
    System.out.println("after swapping arrays : "+Arrays.toString(arr4));
    int result2[]=SwapArraylowest(arr4);
    System.out.println("after swapping arrays : "+Arrays.toString(arr4));




    // find prefix sum array
    // q.
    // create array;;;
    int ar[]={2,1,4,3,7,5,6};
    
    int result3[]=Prefixsum(ar);
    
    System.out.println("prefix sum : "+Arrays.toString(result3));



// Q. calculate Prefixsum of the arrays:
    System.out.println("----------------------------");
    int A[]={1,2,4,3,6,5,9,8};
    System.out.println("The sum of prefix Arrays : "+Arrays.toString(A));

    int ansA[]= CalPrefixsum(A);
    System.out.println("The sum of prefix Arrays : "+Arrays.toString(ansA));
    
    // here ask query from the user
    System.out.println("enter the query of : ");
    int que=sc.nextInt();
    while(que>0){
        System.out.println("enter the first : ");
        int l1=sc.nextInt();
        System.out.println("enter the Last : ");
        int r1=sc.nextInt();
        int sum =ansA[r1]-ansA[l1-1];
        System.out.println("the sum of "+l1+" and "+r1+ " : "+sum);
        que--;
    }
    }
}