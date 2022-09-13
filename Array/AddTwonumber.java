import java.util.*;
class AddTwonumber{
    public static void main(String[] args) {
        int a = 8;
        int b =7;
        while(b!=0){
            int carry=a&b;
            a=a^b;
            b=carry<<1;
        }
        System.out.println("The sum of two number of : "+a);
    }
}