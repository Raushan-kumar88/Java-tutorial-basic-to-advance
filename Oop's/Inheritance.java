// note:-Inheriting the properties of parent class into child class.
// using extends keyword
// class ParentInheritance{
//     void display(){
//         System.out.println("I am parents class ..........");
//     }
// }
// class Inheritance extends ParentInheritance{
//     public static void main(String[] args) {
//         Inheritance obj=new Inheritance();
//         obj.display();
//     }
// }

class A{
    void A(){
        System.out.println("class A");
    }
}
class B{
    void A(){
        System.out.println("class B");
    }
}

class Inheritance extends A{
    public static void main(String[] args) {
        System.out.println("I am Main class");
        Inheritance obj=new Inheritance();
        obj.A();
        // obj.main();
    }
}


// note:-
// There are 5 Inheritance 
// 1.single Inheritance
// 2.Multilevel Inheritance
// 3.Heirachical Inheritance
// 4.Multiple Inheritance
// 5.Hybrid Inheritance 
// But in java only three Inheritance are used 
// single Inheritance,Multilevel,
// Heirachical Inheritance