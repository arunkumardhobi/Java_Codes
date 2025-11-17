// Write a program with public, protected, and private methods and
//  access them from subclasses and other classes.

public class Week2_24 {

public static void main(String[] args) {
        Demo_24 obj1=new Demo_24();
        obj1.display();
        // obj1.display1();//this method is private so that it can not access here
         obj1.display2();
    }
    
}
