// note:-
// There are three types of constructor :-
// 1.Default constructor
// 2.No argument constructor
// 3.Perametrized constructor

// class Constructor{
//     int s_id;               //default constructor
//     String name;
//     public static void main(String[] args) {
//         Constructor e1=new Constructor();
//         System.out.println(e1.s_id+" "+e1.name);
//     }
// }
// class Constructor{
//     // no argument constructor................
//     Constructor(){
//         System.out.println("no argument constructor....");
//     }
//     public static void main(String[] args) {
//         Constructor e1=new Constructor();
        
//     }
// }


class Constructor{
    int s_id;
    String name;
    Constructor(int s_id, String name){
        this.s_id=s_id;
        this.name=name;
        display();
    }
    void display(){
        System.out.println("student id  : "+this.s_id+" and name : "+this.name);

    }
    public static void main(String[] args) {
        Constructor e1=new Constructor(1,"Raushan");
        Constructor e2=new Constructor(2,"Karan");
        
    }
}