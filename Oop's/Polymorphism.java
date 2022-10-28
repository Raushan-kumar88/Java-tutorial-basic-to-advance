// note :-
// Polymorphism means more than form
// Poly means many 
// and Morphism means forms
// ex:- water :- solid , liquid, ice;
//     shape :- cone , triangle , circle;
// There are two types of Polymorphism
// compile time Polymorphism
//  ->it is also known as overloding.
//  overloding :-
//  same class
//  same name
//  different argument
// and run time Polymorphism
// -> it is alos know as overriding.
// overriding :-
// -> same name 
// -> different class
class Polymorphism{
    static int a=0,b=1;
    void show(int id, String name){
        System.out.println("first method");
    }
    void show(String name){
        System.out.println("second method");
    }
    fibnasic(int n){
        if(n!=0){
            a=a+b;
        }
    }
    public static void main(String[] args){
        
        Polymorphism t = new Polymorphism();
        t.show(10,"Raushan kumar");
        System.out.println(a+" "+b+" ");
        
    }

}
