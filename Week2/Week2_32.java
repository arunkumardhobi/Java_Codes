//Create a class with a default constructor and an overloaded constructor.
public class Week2_32 {
    Week2_32(){
        System.out.println("this is is default constructor ");
    }
    Week2_32(String s){
        System.out.println("this is prameter constractor:hii my name is "+s);
    }
    public static void main(String[] args) {
        Week2_32 obj=new Week2_32();
        Week2_32 obj1=new Week2_32("arun");
    }
    
}
