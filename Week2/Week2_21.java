

// Create a class with a final method 
// and try to override it in a subclass (compile-time error).
class demo{
    final void display(){
            System.out.println("this is final method in demo");
    }
}
public class Week2_21 extends demo {
    final void display(){
        System.out.println("this is final method in Week2_21");

    }
    public static void main(String[] args) {
        Week2_21 obj=new Week2_21();
        obj.display();

        
    }
    
}
