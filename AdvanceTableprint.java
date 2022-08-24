// WAP to print magic table ................
import java.util.*;
class AdvanceTableprint{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of the table :");
        int n=sc.nextInt();
        System.out.format("      "); 
        for(int i=1; i<=n; i++) {
            System.out.format("%4d",i);
    }
    System.out.println();
    for(int i=0; i<=n; i++) {
        System.out.printf("-----");
}
System.out.println();
for(int i=1; i<=10; i++) {
    System.out.printf("%4d |",i);
        for(int j=1; j<=n; j++) {
        System.out.format("%4d",(i*j));
    
        }
        System.out.println();
}
}
    
}