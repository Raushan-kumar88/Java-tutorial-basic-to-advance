import java.util.*;
class prime{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter any number :");
       int n=sc.nextInt();
       for (int i=2; i<n; i++) {
        if(n%i==0){
            System.out.println("not prime");
            break;
        }
        System.out.println(n+" prime");
            break;
        
       } 
    //    int n=14;
	// 	int temp=0;
	// 	for(int i=2;i<n;i++){
	// 	    if(n%i==0){
	// 	        temp++;
	// 	    }
		   
		   
		    
	// 	}
	// 	 if(temp>0){
	// 	        System.out.println(" no is not prime : "+n);
	// 	    }
	// 	    else{
	// 	        System.out.println(" no is prime : "+n);
	// 	    }
    // another method to check prime or not
    }
}