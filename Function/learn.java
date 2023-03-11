class learn{
    public static int Factorial(int n){
        int ans=1;
        for(int i=n;i>=1;i--){
            ans=ans*i;
        }
        return ans;
    }
    public static boolean PrimeN(int n){
        // first method to check prime of not
        // boolean no =true;
        if(n==2){
            return true;
        }
        for(int i=2;i<n-1;i++){
            if(n%i==0){
            //   no = false;
            //   break;
            return false;  //this second method to check prime of not
            }
        }
        // return no;
        return true;
    }
    // calculate binary to decimal 
    public static int CalculateB(int no){
        int sum=0;
        int po=0;
        while(no>0){
            int rev=no%10;
            sum=sum+rev*(int)Math.pow(2,po);
            no=no/10;
            po++;
        }
        return sum;
    }
    // calculate decimal to binary 
    
    public static int DecimalNo(int no){
        int result=0;
        int po=0;
        while(no>0){
            int rev=no%2;
            result+=(rev*(int)Math.pow(10,po));
            no=no/2;
            po++;
        }
        return result;
    }
    
	public static void main(String[] args) {
		System.out.println("Find The factorial : ");
		int n=5;
		int sum=Factorial(n);
		System.out.println("the factoiral of "+n+" is : "+ sum);
		System.out.println(PrimeN(n));
		int binaryNo=1111;
		int result2=CalculateB(binaryNo);
	    System.out.println("the binary no "+binaryNo+ " is : "+result2);
	    int no2=15;
	    int result3=DecimalNo(no2);
	    System.out.println("the result of "+no2+" is : "+ result3);
	}
}
