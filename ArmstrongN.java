import java.util.*;
class ArmstrongN{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any no :");

        int n=sc.nextInt();
        int temp=n;
        int len=0;

// here is check to to length of the number

        while(temp!=0){
            temp=temp/10;
            len +=1;
        }


        // System.out.println(len);
        int temp2=n; int rem;
        int arm=0; 

        // here is perform to one by one multiply is own digit and add...

        while(temp2!=0){
            rem=temp2%10;
            
            int mul=1;
            for(int i=1;i<=len;i++){
                mul=mul*rem;
                
            }
            arm=arm+mul;
            temp2=temp2/10;
            
            }
            // here check condition no is arm strong or note
            

            if(n==arm){
                System.out.println(n+ " is armstrong number...");
            }
            else{
                System.out.println(n+" not a armstrong number..");
            }
            


    }
}