// WAP A PROGRAM to search any element from given arrays:
class LinearS{
    public static void main(String[] args) {
        int[] arr={7,3,1,8,9,0,3,77};
        int k=3;
        int temp=0;
        String[] arr1={"Raushan","Aman","Bablue","Pawan"};
        String k1="Raushan";
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println("The element index value is : "+i);
                temp+=1;
            }
            
        }
        
        if(temp==0){
            System.out.println("element is not present in the list.");
        }

        // for string to find element is present or not
        for(int i=0;i<arr1.length;i++){
            if(arr1[i].equals(k1)){
                System.out.println("element is found");
                temp+=1;

            }
            
        }
        if(temp==0){
            System.out.println("element is not present in the list.");
        }

    }
}