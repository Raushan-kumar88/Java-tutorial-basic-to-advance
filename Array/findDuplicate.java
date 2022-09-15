// find findDuplicate element using HashSet method 
import java.util.Set;
import java.util.HashSet;
class findDuplicate{
    public static void main(String[] args) {
        int arr[] ={4,1,6,3,2,7,2,4,2};
        Set<Integer> s = new HashSet<>();
        System.out.print("The duplicate element :");
        for(int no : arr){
            
            boolean a=s.add(no);
            if(a==false){
                System.out.printf("%4d",no);
            }
        }
    }
}