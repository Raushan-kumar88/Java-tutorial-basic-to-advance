// this is encapsulation program how to initialized of data and get of data
class data{
    private int id;
    void getini(int idd){
        id=idd;
        return;
    }
    public int getdata(){
        return id;
    }

}
class Encapsulations{
    public static void main(String[] args) {
        System.out.println("encapsulation program ...");
        data obj = new data();
        obj.getini(111);
        System.out.println("id : "+obj.getdata());
        
    }
}