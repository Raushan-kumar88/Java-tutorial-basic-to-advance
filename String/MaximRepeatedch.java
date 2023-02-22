package String;

public class MaximRepeatedch {
    public static void main(String[] args) {
        System.out.print("maximum repeated Character : ");
        int arr[]=new int[127];
        String s1="raus h a n";
        s1=s1.replaceAll("\\s", "");  // this function to work remove white space from string
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)]=arr[s1.charAt(i)]+1;  // here initialize repeated value in array
        }

        int max=-1;
        char ch=' ';
        for(int i=0;i<s1.length();i++){
            if(max<arr[s1.charAt(i)]){
                max=arr[s1.charAt(i)]; // find the maximum repeated string 
                ch=s1.charAt(i);
            }
            
        }
        System.out.print(ch);
    }
}
