abstract class Abstraction{
    abstract void show();
    public static void main(String[] args) {
        
    }
}
class student extends Abstraction{
    void show(){
        System.out.println("this is student method ..");
    }
}
class teacher extends Abstraction{
    void show(){
        System.out.println("dmeo");
    }
    public static void main(String[] args) {
        
        student obj=new student();
        obj.show();
    }
}