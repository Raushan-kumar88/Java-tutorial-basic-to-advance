import java.util.*;
class primeCount{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter range of prime numbers :");
      int n=sc.nextInt();
      int temp2=0;
      
      for(int i=1;i<=n;i++){
        int count=0;
        for(int j=1;j<=i;j++){
            if(i%j==0){
                count++;
            }
        }
        if(count==2){
            temp2+=1;
            System.out.printf("%4d",i);
        }
        }
        System.out.println("\n============================================================");
        System.out.printf("The total prime number between 1 to %d : %d ",n,temp2);
      
    }
}