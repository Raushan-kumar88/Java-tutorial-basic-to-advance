public class RecursionFun {
    public static void main(String[] args) {


        String na="Beta";
        char ch[]=na.toCharArray();
        char temp=ch[ch.length-1];
        ch[ch.length-1]=ch[0];
        ch[0]=temp;
        for (char c : ch) {
            System.out.print(c+" ");
        }

        // Message(6,6);

        }
    

    static void Message(int r,int c){
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == c)
                    System.out.format(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}

