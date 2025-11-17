//Illustrate the concept of a final method that cannot be overridden by a subclass.
 class  demo {
  final void display(){
        System.out.println("hii this is final method in demo");

    }

    
}
public class Week2_19 extends demo{
    @Override

    
   final void display(){
        System.out.println("hii this is final method in Week2_19");

    }
    public static void main(String[] args) {
        Week2_19 obj1=new Week2_19();
        obj1.display();

        
    }
    
}
