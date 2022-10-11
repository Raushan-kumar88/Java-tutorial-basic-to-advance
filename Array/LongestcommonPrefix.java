// A Java Program to find the longest common prefix
class LongestcommonPrefix{
    static int findlength(String arr[],int l){
        int min=arr[0].length();
        for(int i=1;i<l;i++){
            if(arr[i].length()<min){
                min=arr[i].length();
            }
        }
        return (min);
    }
    static String findPrefix(String arr[],int l){
        int minlength=findlength(arr,l);
        String result = "";
        char current;
        for(int i=0;i<minlength;i++){
            current=arr[i].charAt(i);
            for(int j=0;j<l;j++){
                if(arr[j].charAt(i)!=current){
                    return (result);
                }
            }
            result+=(current);
        }
        return (result);
    }
    public static void main(String[] args) {
        String arr[] = {"abcd","abce","abcv","abchdf"};
        int l=arr.length;
        String ans = findPrefix(arr,l);
        if(ans.length()>0){
            System.out.println("the longest common prefix : "+ans);
        }
        else{
            System.out.println("no any prefix ....");
        }
        
    }
}