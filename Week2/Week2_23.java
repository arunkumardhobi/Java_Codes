//Demonstrate the use of default access modifier with classes in the same package.
class demo_23{
    void display(){
        System.out.println("this is demo class display function");

    }
}
public class Week2_23 {
    public static void main(String[] args) {
        System.out.println("this is Week2_23 class");
        demo_23 obj=new demo_23();
        obj.display();

    }

    
}
