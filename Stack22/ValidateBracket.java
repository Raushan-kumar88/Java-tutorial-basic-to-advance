package Stack22;
import java.util.*;
public class ValidateBracket {



static boolean Validatet(String s){

    Stack<Character> stack=new Stack<>();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch==')'){
            if(stack.peek()=='('){
                stack.pop();
            }
        }
        else if(ch=='}'){
            if(stack.peek()=='{'){
                stack.pop();
            }
        }
        else if(ch==']'){
            if(stack.peek()=='['){
                stack.pop();
            }
        }
        else{
            stack.push(ch);
        }

    }
    if(stack.size()==0){
        return true;
    }
    return false;
}


    public static void main(String[] args) {
        System.out.println("program of validate program");

        String s="()[}";
        boolean status=Validatet(s);
        System.out.println(status);

    }
    
}
