import java.util.*;
class calciProgram{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a=sc.nextInt();
        System.out.println("Enter the second number : ");
        int b=sc.nextInt();
        System.out.println("which operation to perform (+,-,*,/,%)");
        int opertor=sc.next().charAt(0);
        System.out.println("A = "+ a + " B = "+ b);
        switch (opertor) {
            case '+':
            System.out.println("a + b = "+(a+b)); 
                break;
            case '-':
            System.out.println("a - b = "+(a-b));
            break;  
            case '*':
            System.out.println("a * b = "+(a*b));
            break;
            case '/':
            System.out.println("a / b = "+(a/b));
            break;
            case '%':
            System.out.println("a % b = "+(a%b));
            break;
            default:
            System.out.println("Invalid operator");
        }
    }
}