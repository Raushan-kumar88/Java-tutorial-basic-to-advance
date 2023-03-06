import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<4;i++){
            list.add(sc.nextInt());
        }

        System.out.println(list.get(0));

    }
}
