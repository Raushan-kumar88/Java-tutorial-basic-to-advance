package Exception;

public class Exceptionhandling extends Exception {

    Exceptionhandling(int age) {
        if (age < 18) {
            try{
                throw new Exception("age must be 18 year or above");
        }catch(Exception e){
            System.out.println(e);
        }
    }
        else {
            
            
            System.out.println("check in ..........");
        }
    }
    // --------------------------------------------------------------------------

    // static void Exceptioncheck( int age) throws Exception{
    // if(age<18){
    // throw new Exception("age must be 18 year or above");
    // }
    // else{
    // System.out.println("check your age");
    // }
    // }
    // --------------------------------------------------------------------------

    // public static void main(String[] args) throws Exception {
    // int a=5;
    // System.out.println(a/0);
    // }
    // or
    // public static void main(String[] args) {
    // int a=5;
    // try{
    // System.out.println(a/0);
    // }catch(Exception e){
    // System.out.println(e);
    // }

    // }
    // here to create own exception
    // --------------------------------------------------------------------------
    // public static void main(String[] args) throws Exception {
    // // int age = 12;
    // // if(age<18){
    // // throw new Exception("age must be 18 year or above");
    // // }
    // // else{
    // // System.out.println("check your age");
    // // }

    // }

    // --------------------------------------------------------------------------
    // public static void main(String[] args) {
    //     int age = 12;
    //     try {
    //         Exceptionhandling.Exceptioncheck(age);
    //     } catch (Exception e) {
    //         System.out.println(e);
    //     }
    // }

    // --------------------------------------------------------------------------

        public static void main(String[] args) {
            Exceptionhandling obj = new Exceptionhandling(19);
        }

}
